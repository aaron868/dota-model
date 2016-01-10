package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NagaSirenRipTide extends Ability {

    private static NagaSirenRipTide instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_reduction;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private NagaSirenRipTide() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{1,1,1,1};
        abilityDamage = new int[]{100,140,180,220};
        abilityManaCost = new int[]{80,90,100,110};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5469;
        key = "naga_siren_rip_tide";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        armor_reduction = new int[]{-2,-3,-4,-5};
        duration = new double[]{8.0,8.0,8.0,8.0};
        localizedName = "Rip Tide";
        ownerKey = "npc_dota_hero_naga_siren";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 320;
    }

    public static NagaSirenRipTide instance() {
        if( instance == null ){
            instance = new NagaSirenRipTide();
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

    public int[] getArmorReduction() {
        return armor_reduction;
    }

    public double[] getDuration() {
        return duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NagaSirenRipTide))
            return false;
        if (object == this)
            return true;
        NagaSirenRipTide otherObject = (NagaSirenRipTide) object;
        return otherObject.getKey().equals(getKey());
    }

}
