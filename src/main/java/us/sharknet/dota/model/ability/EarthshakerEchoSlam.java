package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthshakerEchoSlam extends Ability {

    private static EarthshakerEchoSlam instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int echo_slam_damage_range;
    private final int[] echo_slam_echo_damage;
    private final int echo_slam_echo_range;
    private final int echo_slam_echo_search_range;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private EarthshakerEchoSlam() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{150.0,130.0,110.0};
        abilityDamage = new int[]{160,210,270};
        abilityManaCost = new int[]{145,205,265};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5026;
        key = "earthshaker_echo_slam";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        echo_slam_damage_range = 575;
        echo_slam_echo_damage = new int[]{40,55,70};
        echo_slam_echo_range = 575;
        echo_slam_echo_search_range = 575;
        localizedName = "Echo Slam";
        ownerKey = "npc_dota_hero_earthshaker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static EarthshakerEchoSlam instance() {
        if( instance == null ){
            instance = new EarthshakerEchoSlam();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
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
        if (!(object instanceof EarthshakerEchoSlam))
            return false;
        if (object == this)
            return true;
        EarthshakerEchoSlam otherObject = (EarthshakerEchoSlam) object;
        return otherObject.getKey().equals(getKey());
    }

}
