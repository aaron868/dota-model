package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CrystalMaidenFreezingField extends Ability {

    private static CrystalMaidenFreezingField instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int attack_slow;
    private final int attack_slow_scepter;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int duration_tooltip;
    private final double explosion_interval;
    private final int explosion_max_dist;
    private final int explosion_min_dist;
    private final int explosion_radius;
    private final String localizedName;
    private final int movespeed_slow;
    private final int movespeed_slow_scepter;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int slow_duration;

    private CrystalMaidenFreezingField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityChannelTime = new double[]{10,10,10,10};
        abilityCooldown = new double[]{90,90,90,90};
        abilityDuration = new double[]{1,1,1,1};
        abilityManaCost = new int[]{200,400,600};
        abilityModifierSupportValue = .35;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5129;
        key = "crystal_maiden_freezing_field";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attack_slow = -30;
        attack_slow_scepter = -50;
        damage = new int[]{105,170,250};
        damage_scepter = new int[]{170,250,310};
        duration_tooltip = 10;
        explosion_interval = .1;
        explosion_max_dist = 785;
        explosion_min_dist = 195;
        explosion_radius = 300;
        localizedName = "Freezing Field";
        movespeed_slow = -30;
        movespeed_slow_scepter = -50;
        ownerKey = "npc_dota_hero_crystal_maiden";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 835;
        slow_duration = 1;
    }

    public static CrystalMaidenFreezingField instance() {
        if( instance == null ){
            instance = new CrystalMaidenFreezingField();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int getAttackSlow() {
        return attack_slow;
    }

    public int getAttackSlowScepter() {
        return attack_slow_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public double getExplosionInterval() {
        return explosion_interval;
    }

    public int getExplosionMaxDist() {
        return explosion_max_dist;
    }

    public int getExplosionMinDist() {
        return explosion_min_dist;
    }

    public int getExplosionRadius() {
        return explosion_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
    }

    public int getMovespeedSlowScepter() {
        return movespeed_slow_scepter;
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

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CrystalMaidenFreezingField))
            return false;
        if (object == this)
            return true;
        CrystalMaidenFreezingField otherObject = (CrystalMaidenFreezingField) object;
        return otherObject.getKey().equals(getKey());
    }

}
