package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightElderDragonForm extends Ability {

    private static DragonKnightElderDragonForm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_range;
    private final int[] bonus_movement_speed;
    private final int[] corrosive_breath_damage;
    private final double[] corrosive_breath_duration;
    private final double[] duration;
    private final int frost_aoe;
    private final int frost_bonus_attack_speed;
    private final int frost_bonus_movement_speed;
    private final double[] frost_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] splash_damage_percent;
    private final int[] splash_radius;

    private DragonKnightElderDragonForm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = new double[]{115.0,115.0,115.0};
        abilityManaCost = new int[]{50,50,50};
        abilityModifierSupportValue = .35;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5229;
        key = "dragon_knight_elder_dragon_form";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_attack_range = new int[]{372,372,372};
        bonus_movement_speed = new int[]{25,25,25};
        corrosive_breath_damage = new int[]{20,20,20};
        corrosive_breath_duration = new double[]{5.0,5.0,5.0};
        duration = new double[]{60.0,60.0,60.0};
        frost_aoe = 3;
        frost_bonus_attack_speed = -20;
        frost_bonus_movement_speed = -30;
        frost_duration = new double[]{3.0,3.0,3.0};
        localizedName = "Elder Dragon Form";
        ownerKey = "npc_dota_hero_dragon_knight";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        splash_damage_percent = new int[]{100,75,50};
        splash_radius = new int[]{150,225,300};
    }

    public static DragonKnightElderDragonForm instance() {
        if( instance == null ){
            instance = new DragonKnightElderDragonForm();
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

    public int[] getBonusAttackRange() {
        return bonus_attack_range;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int[] getCorrosiveBreathDamage() {
        return corrosive_breath_damage;
    }

    public double[] getCorrosiveBreathDuration() {
        return corrosive_breath_duration;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getFrostAoe() {
        return frost_aoe;
    }

    public int getFrostBonusAttackSpeed() {
        return frost_bonus_attack_speed;
    }

    public int getFrostBonusMovementSpeed() {
        return frost_bonus_movement_speed;
    }

    public double[] getFrostDuration() {
        return frost_duration;
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

    public int[] getSplashDamagePercent() {
        return splash_damage_percent;
    }

    public int[] getSplashRadius() {
        return splash_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonKnightElderDragonForm))
            return false;
        if (object == this)
            return true;
        DragonKnightElderDragonForm otherObject = (DragonKnightElderDragonForm) object;
        return otherObject.getKey().equals(getKey());
    }

}
