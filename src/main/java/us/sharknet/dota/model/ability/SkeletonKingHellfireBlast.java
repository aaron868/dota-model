package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkeletonKingHellfireBlast extends Ability {

    private static SkeletonKingHellfireBlast instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] blast_dot_damage;
    private final int blast_dot_duration;
    private final int blast_slow;
    private final int blast_speed;
    private final int blast_stun_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int tooltip_slow_duration;

    private SkeletonKingHellfireBlast() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = 525;
        abilityCooldown = new double[]{8.0,8.0,8.0,8.0};
        abilityDamage = new int[]{50,100,150,200};
        abilityManaCost = 14;
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 586;
        key = "skeleton_king_hellfire_blast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        blast_dot_damage = new int[]{15,30,40,50};
        blast_dot_duration = 4;
        blast_slow = -2;
        blast_speed = 1;
        blast_stun_duration = 2;
        localizedName = "Hellfire Blast";
        owningHeroShortKey = "skeleton_king";
        tooltip_slow_duration = 2;
    }

    public static SkeletonKingHellfireBlast instance() {
        if( instance == null ){
            instance = new SkeletonKingHellfireBlast();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public int[] getBlastDotDamage() {
        return blast_dot_damage;
    }

    public int getBlastDotDuration() {
        return blast_dot_duration;
    }

    public int getBlastSlow() {
        return blast_slow;
    }

    public int getBlastSpeed() {
        return blast_speed;
    }

    public int getBlastStunDuration() {
        return blast_stun_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getTooltipSlowDuration() {
        return tooltip_slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkeletonKingHellfireBlast))
            return false;
        if (object == this)
            return true;
        SkeletonKingHellfireBlast otherObject = (SkeletonKingHellfireBlast) object;
        return otherObject.getKey().equals(getKey());
    }

}
