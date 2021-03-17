import _ from 'lodash';

import simDefaults from './data/sim_defaults';

import * as tbcsim from 'tbcsim';

export function stateReducer(state, action) {
  let newState = state
  if (_.has(state, action.type)) {
    newState = _.merge({
      ...state,
    }, _.set({}, action.type, action.value));
  } else {
    if(action.type == 'loadCharacterPreset') {
      newState = {
        ...state,

        iterationsCompleted: null,
        iterationResults: null,

        resultsByAbility: null,
        resultsByBuff: null,
        resultsByDebuff: null,
        resultsByDamageType: null,
        resultsResourceUsage: null,
        resultsResourceUsageByAbility: null,
        resultsDps: null,

        character: {
          class: action.value.class,
          description: action.value.description || '',
          spec: action.value.spec,
          race: action.value.race,
          level: action.value.level,
          gear: action.value.gear,
          rotation: action.value.rotation,
          talents: action.value.talents,
        },

        raidBuffs: _.reduce(action.value.raidBuffs, (acc, buff) => {
          acc[buff] = true
          return acc;
        }, {}),
        raidDebuffs: _.reduce(action.value.raidDebuffs, (acc, debuff) => {
          acc[debuff] = true
          return acc;
        }, {}),
      }
    } else if(action.type == 'updateGearSlot') {
      newState = {
        ...state,
        character: {
          ...state.character,
          gear: {
            ...state.character.gear,
            ...action.value
          }
        }
      }
    } else if(action.type == 'setRaidBuff') {
      newState = {
        ...state,
        raidBuffs: {
          ...state.raidBuffs,
          [action.value.name]: action.value.value
        }
      }
    } else if(action.type == 'setRaidDebuff') {
      newState = {
        ...state,
        raidDebuffs: {
          ...state.raidDebuffs,
          [action.value.name]: action.value.value
        }
      }
  } else {
      console.warn(`Unhandled action type: ${action.type}`);
    }
  }

  // Compute some props
  if(newState.durationSeconds != null) {
    newState.durationMs = newState.durationSeconds * 1000
  }

  if(newState.durationVariabilitySeconds != null) {
    newState.durationVariabilityMs = newState.durationVariabilitySeconds * 1000
  }

  return newState
}

export const initialState = {
  iterationsCompleted: null,
  iterationResults: null,

  resultsByAbility: null,
  resultsByBuff: null,
  resultsByDebuff: null,
  resultsByDamageType: null,
  resultsResourceUsage: null,
  resultsResourceUsageByAbility: null,
  resultsDps: null,

  simOptions: {
    durationSeconds: simDefaults.durationSeconds,
    durationVariabilitySeconds: simDefaults.durationVariabilitySeconds,
    stepMs: simDefaults.stepMs,
    latencyMs: simDefaults.latencyMs,
    iterations: simDefaults.iterations,
    targetLevel: simDefaults.targetLevel,
    targetArmor: simDefaults.targetArmor,
    allowParryAndBlock: simDefaults.allowParryAndBlock,
    showHiddenBuffs: simDefaults.showHiddenBuffs
  },

  character: {
    class: null,
    description: null,
    spec: null,
    race: null,
    level: null,
    gear: null,
    rotation: null,
    talents: null,
  },

  raidBuffs: _.reduce(tbcsim.data.abilities.raid.RaidAbilities.buffNames, (acc, buff) => {
    acc[buff] = true
    return acc;
  }, {}),
  raidDebuffs: _.reduce(tbcsim.data.abilities.raid.RaidAbilities.debuffNames, (acc, debuff) => {
    acc[debuff] = true
    return acc;
  }, {}),
};

initialState.serialize = function() {
  return JSON.stringify({
    character: {
      class: this.character.class,
      description: this.character.description || '',
      spec: this.character.spec,
      race: this.character.race,
      level: this.character.level,
      gear: _.mapValues(this.character.gear, it => ({
        name: it.name,
        gems: it.sockets ? it.sockets.map(sk => sk && sk.gem.name) : [],
        enchant: it.enchant ? it.enchant.displayName : null
      })),
      rotation: this.character.rotation,
      talents: this.character.talents,
    },

    raidBuffs: this.raidBuffs,
    raidDebuffs: this.raidDebuffs
  })
};

initialState.deserialize = function(serialized) {
  const newState = JSON.parse(serialized);

  // Rehydrate character data into actual items and etc.
  if(newState.character) {
    newState.character = tbcsim.config.ConfigMaker.fromJson(newState.character)
  }

  return newState;
};
