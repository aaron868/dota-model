package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkeletonKingHellfireBlast extends Ability {

    private static SkeletonKingHellfireBlast instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] blast_dot_damage;
    private final int blast_dot_duration;
    private final int blast_slow;
    private final int blast_speed;
    private final int blast_stun_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int tooltip_slow_duration;

    private SkeletonKingHellfireBlast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = new int[]{525,525,525,525};
        abilityCooldown = new double[]{8.0,8.0,8.0,8.0};
        abilityDamage = new int[]{50,100,150,200};
        abilityManaCost = new int[]{140,140,140,140};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5086;
        key = "skeleton_king_hellfire_blast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        blast_dot_damage = new int[]{15,30,40,50};
        blast_dot_duration = 4;
        blast_slow = -20;
        blast_speed = 1000;
        blast_stun_duration = 2;
        localizedName = "Hellfire Blast";
        ownerKey = "npc_dota_hero_skeleton_king";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_slow_duration = 2;
    }

    public static SkeletonKingHellfireBlast instance() {
        if( instance == null ){
            instance = new SkeletonKingHellfireBlast();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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
