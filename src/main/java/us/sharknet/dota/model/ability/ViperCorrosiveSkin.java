package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ViperCorrosiveSkin extends Ability {

    private static ViperCorrosiveSkin instance;

    private final String[] abilityBehavior;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_speed;
    private final int[] bonus_magic_resistance;
    private final int[] bonus_movement_speed;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final int max_range_tooltip;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ViperCorrosiveSkin() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityModifierSupportBonus = 10;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5220;
        key = "viper_corrosive_skin";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_attack_speed = new int[]{-10,-15,-20,-25};
        bonus_magic_resistance = new int[]{10,15,20,25};
        bonus_movement_speed = new int[]{-10,-15,-20,-25};
        damage = new int[]{10,15,20,25};
        duration = 4;
        localizedName = "Corrosive Skin";
        max_range_tooltip = 1400;
        ownerKey = "npc_dota_hero_viper";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static ViperCorrosiveSkin instance() {
        if( instance == null ){
            instance = new ViperCorrosiveSkin();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusMagicResistance() {
        return bonus_magic_resistance;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxRangeTooltip() {
        return max_range_tooltip;
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
        if (!(object instanceof ViperCorrosiveSkin))
            return false;
        if (object == this)
            return true;
        ViperCorrosiveSkin otherObject = (ViperCorrosiveSkin) object;
        return otherObject.getKey().equals(getKey());
    }

}
