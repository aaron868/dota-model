package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VengefulspiritWaveOfTerror extends Ability {

    private static VengefulspiritWaveOfTerror instance;

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
    private final int[] armor_reduction;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int tooltip_duration;
    private final double[] vision_aoe;
    private final double[] vision_duration;
    private final int wave_speed;
    private final int wave_width;

    private VengefulspiritWaveOfTerror() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1400,1400,1400,1400};
        abilityCooldown = new double[]{20,20,20,20};
        abilityDamage = new int[]{30,50,70,90};
        abilityDuration = new double[]{15,15,15,15};
        abilityManaCost = new int[]{40,40,40,40};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5124;
        key = "vengefulspirit_wave_of_terror";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction = new int[]{-3,-4,-5,-6};
        localizedName = "Wave Of Terror";
        ownerKey = "npc_dota_hero_vengefulspirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_duration = 15;
        vision_aoe = new double[]{500.0,500.0,500.0,500.0};
        vision_duration = new double[]{3.0,3.0,3.0,3.0};
        wave_speed = 2;
        wave_width = 300;
    }

    public static VengefulspiritWaveOfTerror instance() {
        if( instance == null ){
            instance = new VengefulspiritWaveOfTerror();
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

    public int[] getArmorReduction() {
        return armor_reduction;
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

    public int getTooltipDuration() {
        return tooltip_duration;
    }

    public double[] getVisionAoe() {
        return vision_aoe;
    }

    public double[] getVisionDuration() {
        return vision_duration;
    }

    public int getWaveSpeed() {
        return wave_speed;
    }

    public int getWaveWidth() {
        return wave_width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VengefulspiritWaveOfTerror))
            return false;
        if (object == this)
            return true;
        VengefulspiritWaveOfTerror otherObject = (VengefulspiritWaveOfTerror) object;
        return otherObject.getKey().equals(getKey());
    }

}
