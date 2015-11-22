package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowDemonSoulCatcher extends Ability {

    private static ShadowDemonSoulCatcher instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage_taken;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double[] tooltip_duration;

    private ShadowDemonSoulCatcher() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 600;
        abilityCooldown = new double[]{13.0,13.0,13.0,13.0};
        abilityDuration = new double[]{12.0,12.0,12.0,12.0};
        abilityManaCost = new int[]{50,60,70,80};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        fightRecapLevel = 1;
        iD = 5422;
        key = "shadow_demon_soul_catcher";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage_taken = new int[]{20,30,40,50};
        localizedName = "Soul Catcher";
        owningHeroShortKey = "shadow_demon";
        radius = new int[]{450,450,450,450};
        tooltip_duration = new double[]{12.0,12.0,12.0,12.0};
    }

    public static ShadowDemonSoulCatcher instance() {
        if( instance == null ){
            instance = new ShadowDemonSoulCatcher();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int[] getBonusDamageTaken() {
        return bonus_damage_taken;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowDemonSoulCatcher))
            return false;
        if (object == this)
            return true;
        ShadowDemonSoulCatcher otherObject = (ShadowDemonSoulCatcher) object;
        return otherObject.getKey().equals(getKey());
    }

}
