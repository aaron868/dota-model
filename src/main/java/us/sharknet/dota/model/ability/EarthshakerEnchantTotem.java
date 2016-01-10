package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthshakerEnchantTotem extends Ability {

    private static EarthshakerEnchantTotem instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] tooltip_duration;
    private final int[] totem_damage_percentage;

    private EarthshakerEnchantTotem() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.69,0.69,0.69,0.69};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{5,5,5,5};
        abilityDamage = new int[]{0,0,0,0};
        abilityDuration = new double[]{14.0,14.0,14.0,14.0};
        abilityManaCost = new int[]{20,30,40,50};
        iD = 5024;
        key = "earthshaker_enchant_totem";
        localizedName = "Enchant Totem";
        ownerKey = "npc_dota_hero_earthshaker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_duration = new double[]{14.0,14.0,14.0,14.0};
        totem_damage_percentage = new int[]{100,200,300,400};
    }

    public static EarthshakerEnchantTotem instance() {
        if( instance == null ){
            instance = new EarthshakerEnchantTotem();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }

    public int[] getTotemDamagePercentage() {
        return totem_damage_percentage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthshakerEnchantTotem))
            return false;
        if (object == this)
            return true;
        EarthshakerEnchantTotem otherObject = (EarthshakerEnchantTotem) object;
        return otherObject.getKey().equals(getKey());
    }

}
