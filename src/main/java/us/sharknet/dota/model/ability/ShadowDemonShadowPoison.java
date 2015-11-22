package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowDemonShadowPoison extends Ability {

    private static ShadowDemonShadowPoison instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] bonus_stack_damage;
    private final String localizedName;
    private final int max_multiply_stacks;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] speed;
    private final double[] stack_damage;
    private final double[] tooltip_duration;

    private ShadowDemonShadowPoison() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 15;
        abilityCooldown = 2.5;
        abilityDamage = new int[]{50,50,50,50};
        abilityDuration = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = 4;
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5423;
        key = "shadow_demon_shadow_poison";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_stack_damage = new double[]{50.0,50.0,50.0,50.0};
        localizedName = "Shadow Poison";
        max_multiply_stacks = 5;
        owningHeroShortKey = "shadow_demon";
        radius = 19;
        speed = new int[]{1000,1000,1000,1000};
        stack_damage = new double[]{20.0,35.0,50.0,65.0};
        tooltip_duration = new double[]{10.0,10.0,10.0,10.0};
    }

    public static ShadowDemonShadowPoison instance() {
        if( instance == null ){
            instance = new ShadowDemonShadowPoison();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public double[] getBonusStackDamage() {
        return bonus_stack_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxMultiplyStacks() {
        return max_multiply_stacks;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getSpeed() {
        return speed;
    }

    public double[] getStackDamage() {
        return stack_damage;
    }

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowDemonShadowPoison))
            return false;
        if (object == this)
            return true;
        ShadowDemonShadowPoison otherObject = (ShadowDemonShadowPoison) object;
        return otherObject.getKey().equals(getKey());
    }

}
