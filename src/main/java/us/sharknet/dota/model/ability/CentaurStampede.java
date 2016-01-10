package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurStampede extends Ability {

    private static CentaurStampede instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int base_damage;
    private final int[] cooldown_scepter;
    private final int damage_reduction;
    private final int damage_reduction_tooltip_scepter;
    private final double duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double slow_duration;
    private final int slow_movement_speed;
    private final double[] strength_damage;

    private CentaurStampede() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{90.0,75.0,60.0};
        abilityManaCost = new int[]{100,100,100,100};
        abilityModifierSupportValue = .2;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5517;
        key = "centaur_stampede";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        base_damage = 0;
        cooldown_scepter = new int[]{90,75,60};
        damage_reduction = 60;
        damage_reduction_tooltip_scepter = 60;
        duration = 3.75;
        localizedName = "Stampede";
        ownerKey = "npc_dota_hero_centaur";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 105;
        slow_duration = 1.5;
        slow_movement_speed = 100;
        strength_damage = new double[]{1.0,2.0,3.0};
    }

    public static CentaurStampede instance() {
        if( instance == null ){
            instance = new CentaurStampede();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getBaseDamage() {
        return base_damage;
    }

    public int[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int getDamageReduction() {
        return damage_reduction;
    }

    public int getDamageReductionTooltipScepter() {
        return damage_reduction_tooltip_scepter;
    }

    public double getDuration() {
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

    public double getSlowDuration() {
        return slow_duration;
    }

    public int getSlowMovementSpeed() {
        return slow_movement_speed;
    }

    public double[] getStrengthDamage() {
        return strength_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CentaurStampede))
            return false;
        if (object == this)
            return true;
        CentaurStampede otherObject = (CentaurStampede) object;
        return otherObject.getKey().equals(getKey());
    }

}
