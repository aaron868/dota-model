package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbilityDeward extends Ability {

    private static AbilityDeward instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private AbilityDeward() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastRange = 600;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        iD = 5669;
        key = "ability_deward";
        localizedName = "Deward";
        owningHeroShortKey = "ward";
    }

    public static AbilityDeward instance() {
        if( instance == null ){
            instance = new AbilityDeward();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbilityDeward))
            return false;
        if (object == this)
            return true;
        AbilityDeward otherObject = (AbilityDeward) object;
        return otherObject.getKey().equals(getKey());
    }

}
