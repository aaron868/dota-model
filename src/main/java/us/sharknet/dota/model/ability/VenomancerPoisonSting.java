package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VenomancerPoisonSting extends Ability {

    private static VenomancerPoisonSting instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double[] duration;
    private final String localizedName;
    private final int[] movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private VenomancerPoisonSting() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5179;
        key = "venomancer_poison_sting";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage = new int[]{6,12,18,24};
        duration = new double[]{6.0,9.0,12.0,15.0};
        localizedName = "Poison Sting";
        movement_speed = new int[]{-11,-12,-13,-14};
        ownerKey = "npc_dota_hero_venomancer";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static VenomancerPoisonSting instance() {
        if( instance == null ){
            instance = new VenomancerPoisonSting();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeed() {
        return movement_speed;
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
        if (!(object instanceof VenomancerPoisonSting))
            return false;
        if (object == this)
            return true;
        VenomancerPoisonSting otherObject = (VenomancerPoisonSting) object;
        return otherObject.getKey().equals(getKey());
    }

}
