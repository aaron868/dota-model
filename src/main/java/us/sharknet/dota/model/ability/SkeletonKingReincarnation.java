package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkeletonKingReincarnation extends Ability {

    private static SkeletonKingReincarnation instance;

    private final String abilityBehavior;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int attackslow_tooltip;
    private final int aura_radius;
    private final int aura_radius_tooltip_scepter;
    private final String localizedName;
    private final int movespeed;
    private final String owningHeroShortKey;
    private final double[] reincarnate_time;
    private final int scepter_duration;
    private final int slow_duration;
    private final int slow_radius;

    private SkeletonKingReincarnation() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = new int[]{260,160,60};
        abilityManaCost = 16;
        abilityModifierSupportValue = .2;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 2;
        iD = 589;
        key = "skeleton_king_reincarnation";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackslow_tooltip = -75;
        aura_radius = 12;
        aura_radius_tooltip_scepter = 12;
        localizedName = "Reincarnation";
        movespeed = -75;
        owningHeroShortKey = "skeleton_king";
        reincarnate_time = new double[]{3.0,3.0,3.0};
        scepter_duration = 7;
        slow_duration = 5;
        slow_radius = 9;
    }

    public static SkeletonKingReincarnation instance() {
        if( instance == null ){
            instance = new SkeletonKingReincarnation();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getAttackslowTooltip() {
        return attackslow_tooltip;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getAuraRadiusTooltipScepter() {
        return aura_radius_tooltip_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getReincarnateTime() {
        return reincarnate_time;
    }

    public int getScepterDuration() {
        return scepter_duration;
    }

    public int getSlowDuration() {
        return slow_duration;
    }

    public int getSlowRadius() {
        return slow_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkeletonKingReincarnation))
            return false;
        if (object == this)
            return true;
        SkeletonKingReincarnation otherObject = (SkeletonKingReincarnation) object;
        return otherObject.getKey().equals(getKey());
    }

}
