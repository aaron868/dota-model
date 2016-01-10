package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GyrocopterRocketBarrage extends Ability {

    private static GyrocopterRocketBarrage instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int rockets_per_second;

    private GyrocopterRocketBarrage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{7.0,6.5,6,5.5};
        abilityDamage = new int[]{7,12,17,22};
        abilityDuration = new double[]{3,3,3,3};
        abilityManaCost = new int[]{90,90,90,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5361;
        key = "gyrocopter_rocket_barrage";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Rocket Barrage";
        ownerKey = "npc_dota_hero_gyrocopter";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 400;
        rockets_per_second = 10;
    }

    public static GyrocopterRocketBarrage instance() {
        if( instance == null ){
            instance = new GyrocopterRocketBarrage();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getRocketsPerSecond() {
        return rockets_per_second;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GyrocopterRocketBarrage))
            return false;
        if (object == this)
            return true;
        GyrocopterRocketBarrage otherObject = (GyrocopterRocketBarrage) object;
        return otherObject.getKey().equals(getKey());
    }

}
