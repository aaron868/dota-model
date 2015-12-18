package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrTricksterPurge extends Ability {

    private static SatyrTricksterPurge instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int purge_rate;
    private final int summon_damage;

    private SatyrTricksterPurge() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .2;
        abilityCastRange = 350;
        abilityCooldown = 3;
        abilityManaCost = 120;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5314;
        key = "satyr_trickster_purge";
        maxLevel = 1;
        duration = 5;
        localizedName = "Purge";
        owningHeroShortKey = "satyr_trickster";
        purge_rate = 5;
        summon_damage = 400;
    }

    public static SatyrTricksterPurge instance() {
        if( instance == null ){
            instance = new SatyrTricksterPurge();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPurgeRate() {
        return purge_rate;
    }

    public int getSummonDamage() {
        return summon_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SatyrTricksterPurge))
            return false;
        if (object == this)
            return true;
        SatyrTricksterPurge otherObject = (SatyrTricksterPurge) object;
        return otherObject.getKey().equals(getKey());
    }

}
