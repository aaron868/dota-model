package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ForestTrollHighPriestHeal extends Ability {

    private static ForestTrollHighPriestHeal instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int health;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ForestTrollHighPriestHeal() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_AUTOCAST"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCastRange = new int[]{350,350,350,350};
        abilityCooldown = new double[]{.5,.5,.5,.5};
        abilityManaCost = new int[]{5,5,5,5};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5318;
        key = "forest_troll_high_priest_heal";
        health = 15;
        localizedName = "Heal";
        ownerKey = "npc_dota_neutral_forest_troll_high_priest";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static ForestTrollHighPriestHeal instance() {
        if( instance == null ){
            instance = new ForestTrollHighPriestHeal();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getHealth() {
        return health;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ForestTrollHighPriestHeal))
            return false;
        if (object == this)
            return true;
        ForestTrollHighPriestHeal otherObject = (ForestTrollHighPriestHeal) object;
        return otherObject.getKey().equals(getKey());
    }

}
