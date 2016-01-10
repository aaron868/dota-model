package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritBoulderSmash extends Ability {

    private static EarthSpiritBoulderSmash instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int remnant_smash_radius_tooltip;
    private final int[] rock_damage;
    private final int rock_distance;
    private final int rock_search_aoe;
    private final int speed;
    private final double[] stun_duration;
    private final double[] unit_distance;

    private EarthSpiritBoulderSmash() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{22.0,18.0,14.0,10.0};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5608;
        key = "earth_spirit_boulder_smash";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Boulder Smash";
        ownerKey = "npc_dota_hero_earth_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 160;
        remnant_smash_radius_tooltip = 200;
        rock_damage = new int[]{50,100,150,200};
        rock_distance = 2;
        rock_search_aoe = 200;
        speed = 1200;
        stun_duration = new double[]{0.75,1.25,1.75,2.25};
        unit_distance = new double[]{500.0,600.0,700.0,800.0};
    }

    public static EarthSpiritBoulderSmash instance() {
        if( instance == null ){
            instance = new EarthSpiritBoulderSmash();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
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

    public int getRadius() {
        return radius;
    }

    public int getRemnantSmashRadiusTooltip() {
        return remnant_smash_radius_tooltip;
    }

    public int[] getRockDamage() {
        return rock_damage;
    }

    public int getRockDistance() {
        return rock_distance;
    }

    public int getRockSearchAoe() {
        return rock_search_aoe;
    }

    public int getSpeed() {
        return speed;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public double[] getUnitDistance() {
        return unit_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritBoulderSmash))
            return false;
        if (object == this)
            return true;
        EarthSpiritBoulderSmash otherObject = (EarthSpiritBoulderSmash) object;
        return otherObject.getKey().equals(getKey());
    }

}
