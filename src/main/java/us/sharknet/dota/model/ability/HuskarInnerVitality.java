package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class HuskarInnerVitality extends Ability {

    private static HuskarInnerVitality instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDuration;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final double[] attrib_bonus;
    private final int heal;
    private final double[] hurt_attrib_bonus;
    private final double hurt_percent;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] tooltip_attrib_bonus;
    private final int[] tooltip_hurt_attrib_bonus;

    private HuskarInnerVitality() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 800;
        abilityCooldown = new int[]{22,18,14,10};
        abilityDuration = new int[]{16,16,16,16};
        abilityManaCost = new int[]{170,170,170,170};
        abilityModifierSupportValue = 0;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 5271;
        key = "huskar_inner_vitality";
        attrib_bonus = new double[]{0.05,0.1,0.15,0.2};
        heal = 10;
        hurt_attrib_bonus = new double[]{0.2,0.4,0.6,0.8};
        hurt_percent = .4;
        localizedName = "Inner Vitality";
        owningHeroShortKey = "huskar";
        tooltip_attrib_bonus = new int[]{5,10,15,20};
        tooltip_hurt_attrib_bonus = new int[]{20,40,60,80};
    }

    public static HuskarInnerVitality instance() {
        if( instance == null ){
            instance = new HuskarInnerVitality();
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getAttribBonus() {
        return attrib_bonus;
    }

    public int getHeal() {
        return heal;
    }

    public double[] getHurtAttribBonus() {
        return hurt_attrib_bonus;
    }

    public double getHurtPercent() {
        return hurt_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getTooltipAttribBonus() {
        return tooltip_attrib_bonus;
    }

    public int[] getTooltipHurtAttribBonus() {
        return tooltip_hurt_attrib_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HuskarInnerVitality))
            return false;
        if (object == this)
            return true;
        HuskarInnerVitality otherObject = (HuskarInnerVitality) object;
        return otherObject.getKey().equals(getKey());
    }

}
