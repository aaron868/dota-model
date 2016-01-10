package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnchantressUntouchable extends Ability {

    private static EnchantressUntouchable instance;

    private final String[] abilityBehavior;
    private final double[] abilityDuration;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] slow_attack_speed;
    private final int slow_duration;

    private EnchantressUntouchable() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityDuration = new double[]{4,4,4,4};
        iD = 5267;
        key = "enchantress_untouchable";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Untouchable";
        ownerKey = "npc_dota_hero_enchantress";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        slow_attack_speed = new int[]{-40,-70,-100,-130};
        slow_duration = 4;
    }

    public static EnchantressUntouchable instance() {
        if( instance == null ){
            instance = new EnchantressUntouchable();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int[] getSlowAttackSpeed() {
        return slow_attack_speed;
    }

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnchantressUntouchable))
            return false;
        if (object == this)
            return true;
        EnchantressUntouchable otherObject = (EnchantressUntouchable) object;
        return otherObject.getKey().equals(getKey());
    }

}
