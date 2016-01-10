package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class StormSpiritOverload extends Ability {

    private static StormSpiritOverload instance;

    private final String[] abilityBehavior;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int overload_aoe;
    private final int overload_attack_slow;
    private final int overload_move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] tooltip_duration;

    private StormSpiritOverload() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityDamage = new int[]{30,50,70,90};
        abilityDuration = new double[]{0.6,0.6,0.6,0.6};
        abilityModifierSupportBonus = 40;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5100;
        key = "storm_spirit_overload";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Overload";
        overload_aoe = 275;
        overload_attack_slow = -50;
        overload_move_slow = -80;
        ownerKey = "npc_dota_hero_storm_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        tooltip_duration = new double[]{0.6,0.6,0.6,0.6};
    }

    public static StormSpiritOverload instance() {
        if( instance == null ){
            instance = new StormSpiritOverload();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getOverloadAoe() {
        return overload_aoe;
    }

    public int getOverloadAttackSlow() {
        return overload_attack_slow;
    }

    public int getOverloadMoveSlow() {
        return overload_move_slow;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof StormSpiritOverload))
            return false;
        if (object == this)
            return true;
        StormSpiritOverload otherObject = (StormSpiritOverload) object;
        return otherObject.getKey().equals(getKey());
    }

}
