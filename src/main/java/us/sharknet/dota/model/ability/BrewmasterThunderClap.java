package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterThunderClap extends Ability {

    private static BrewmasterThunderClap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_speed_slow;
    private final int[] damage;
    private final int duration;
    private final double[] duration_creeps;
    private final String localizedName;
    private final int[] movement_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private BrewmasterThunderClap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.4,0.4,0.4};
        abilityCooldown = new double[]{13,13,13,13};
        abilityManaCost = new int[]{90,105,130,150};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5400;
        key = "brewmaster_thunder_clap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attack_speed_slow = new int[]{25,35,45,55};
        damage = new int[]{100,175,250,300};
        duration = 4;
        duration_creeps = new double[]{8.0,8.0,8.0,8.0};
        localizedName = "Thunder Clap";
        movement_slow = new int[]{25,35,45,55};
        ownerKey = "npc_dota_hero_brewmaster";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{400,400,400,400};
    }

    public static BrewmasterThunderClap instance() {
        if( instance == null ){
            instance = new BrewmasterThunderClap();
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

    public int[] getAttackSpeedSlow() {
        return attack_speed_slow;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDuration() {
        return duration;
    }

    public double[] getDurationCreeps() {
        return duration_creeps;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSlow() {
        return movement_slow;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterThunderClap))
            return false;
        if (object == this)
            return true;
        BrewmasterThunderClap otherObject = (BrewmasterThunderClap) object;
        return otherObject.getKey().equals(getKey());
    }

}
