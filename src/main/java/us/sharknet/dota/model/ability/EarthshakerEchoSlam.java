package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthshakerEchoSlam extends Ability {

    private static EarthshakerEchoSlam instance;

    private final String abilityBehavior;
    private final int[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int echo_slam_damage_range;
    private final int[] echo_slam_echo_damage;
    private final int echo_slam_echo_range;
    private final int echo_slam_echo_search_range;
    private final String localizedName;
    private final String owningHeroShortKey;

    private EarthshakerEchoSlam() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCooldown = new double[]{150.0,130.0,110.0};
        abilityDamage = new int[]{160,210,270};
        abilityManaCost = new int[]{145,205,265};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 526;
        key = "earthshaker_echo_slam";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        echo_slam_damage_range = 575;
        echo_slam_echo_damage = new int[]{40,55,70};
        echo_slam_echo_range = 575;
        echo_slam_echo_search_range = 575;
        localizedName = "Echo Slam";
        owningHeroShortKey = "earthshaker";
    }

    public static EarthshakerEchoSlam instance() {
        if( instance == null ){
            instance = new EarthshakerEchoSlam();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getEchoSlamDamageRange() {
        return echo_slam_damage_range;
    }

    public int[] getEchoSlamEchoDamage() {
        return echo_slam_echo_damage;
    }

    public int getEchoSlamEchoRange() {
        return echo_slam_echo_range;
    }

    public int getEchoSlamEchoSearchRange() {
        return echo_slam_echo_search_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthshakerEchoSlam))
            return false;
        if (object == this)
            return true;
        EarthshakerEchoSlam otherObject = (EarthshakerEchoSlam) object;
        return otherObject.getKey().equals(getKey());
    }

}
