package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ForestTrollHighPriestHeal extends Ability {

    private static ForestTrollHighPriestHeal instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int health;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ForestTrollHighPriestHeal() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_AUTOCAST"};
        abilityCastPoint = .5;
        abilityCastRange = 350;
        abilityCooldown = .5;
        abilityManaCost = 5;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5318;
        key = "forest_troll_high_priest_heal";
        maxLevel = 1;
        health = 15;
        localizedName = "Heal";
        owningHeroShortKey = "forest_troll_high_priest";
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

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getHealth() {
        return health;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
