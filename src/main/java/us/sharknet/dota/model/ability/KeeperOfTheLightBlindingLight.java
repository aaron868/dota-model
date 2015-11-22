package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightBlindingLight extends Ability {

    private static KeeperOfTheLightBlindingLight instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int knockback_distance;
    private final double[] knockback_duration;
    private final int[] knockback_height;
    private final String localizedName;
    private final double[] miss_duration;
    private final int[] miss_rate;
    private final String owningHeroShortKey;
    private final int[] radius;

    private KeeperOfTheLightBlindingLight() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{900,900,900};
        abilityCooldown = new double[]{20.0,16.0,12.0};
        abilityManaCost = new int[]{50,50,50};
        abilityModifierSupportValue = 1;
        iD = 5476;
        key = "keeper_of_the_light_blinding_light";
        maxLevel = 3;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        knockback_distance = 4;
        knockback_duration = new double[]{0.4,0.4,0.4};
        knockback_height = new int[]{50,50,50};
        localizedName = "Blinding Light";
        miss_duration = new double[]{4.0,5.0,6.0};
        miss_rate = new int[]{80,80,80};
        owningHeroShortKey = "keeper_of_the_light";
        radius = new int[]{675,675,675};
    }

    public static KeeperOfTheLightBlindingLight instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightBlindingLight();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getKnockbackDistance() {
        return knockback_distance;
    }

    public double[] getKnockbackDuration() {
        return knockback_duration;
    }

    public int[] getKnockbackHeight() {
        return knockback_height;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getMissDuration() {
        return miss_duration;
    }

    public int[] getMissRate() {
        return miss_rate;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KeeperOfTheLightBlindingLight))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightBlindingLight otherObject = (KeeperOfTheLightBlindingLight) object;
        return otherObject.getKey().equals(getKey());
    }

}
