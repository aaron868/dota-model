package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SvenGodsStrength extends Ability {

    private static SvenGodsStrength instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] gods_strength_damage;
    private final int[] gods_strength_damage_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int scepter_aoe;

    private SvenGodsStrength() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = new double[]{80.0,80.0,80.0};
        abilityDuration = new double[]{25.0,25.0,25.0};
        abilityManaCost = new int[]{100,150,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5097;
        key = "sven_gods_strength";
        gods_strength_damage = new int[]{100,150,200};
        gods_strength_damage_scepter = new int[]{75,100,125};
        localizedName = "Gods Strength";
        ownerKey = "npc_dota_hero_sven";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        scepter_aoe = 900;
    }

    public static SvenGodsStrength instance() {
        if( instance == null ){
            instance = new SvenGodsStrength();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getGodsStrengthDamage() {
        return gods_strength_damage;
    }

    public int[] getGodsStrengthDamageScepter() {
        return gods_strength_damage_scepter;
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

    public int getScepterAoe() {
        return scepter_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SvenGodsStrength))
            return false;
        if (object == this)
            return true;
        SvenGodsStrength otherObject = (SvenGodsStrength) object;
        return otherObject.getKey().equals(getKey());
    }

}
