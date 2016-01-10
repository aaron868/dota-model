package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinyCraggyExterior extends Ability {

    private static TinyCraggyExterior instance;

    private final String[] abilityBehavior;
    private final int[] abilityDamage;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int[] bonus_armor;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int[] stun_chance;
    private final double[] stun_duration;

    private TinyCraggyExterior() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityDamage = new int[]{25,35,45,55};
        abilityModifierSupportBonus = 35;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5108;
        key = "tiny_craggy_exterior";
        bonus_armor = new int[]{2,3,4,5};
        localizedName = "Craggy Exterior";
        ownerKey = "npc_dota_hero_tiny";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = new int[]{300,300,300,300};
        stun_chance = new int[]{10,15,20,25};
        stun_duration = new double[]{1.0,1.25,1.5,1.75};
    }

    public static TinyCraggyExterior instance() {
        if( instance == null ){
            instance = new TinyCraggyExterior();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
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

    public int[] getBonusArmor() {
        return bonus_armor;
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

    public int[] getRadius() {
        return radius;
    }

    public int[] getStunChance() {
        return stun_chance;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinyCraggyExterior))
            return false;
        if (object == this)
            return true;
        TinyCraggyExterior otherObject = (TinyCraggyExterior) object;
        return otherObject.getKey().equals(getKey());
    }

}
