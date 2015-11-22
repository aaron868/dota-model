package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WinterWyvernSplinterBlast extends Ability {

    private static WinterWyvernSplinterBlast instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_movespeed;
    private final int duration;
    private final String localizedName;
    private final int movespeed_slow_tooltip;
    private final String owningHeroShortKey;
    private final int projectile_max_time;
    private final int projectile_speed;
    private final int secondary_projectile_speed;
    private final int split_radius;

    private WinterWyvernSplinterBlast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 1200;
        abilityCooldown = 7;
        abilityDamage = new int[]{100,180,260,340};
        abilityManaCost = new int[]{120,130,140,150};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5652;
        key = "winter_wyvern_splinter_blast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_movespeed = -25;
        duration = 4;
        localizedName = "Splinter Blast";
        movespeed_slow_tooltip = 25;
        owningHeroShortKey = "winter_wyvern";
        projectile_max_time = 1;
        projectile_speed = 650;
        secondary_projectile_speed = 650;
        split_radius = 500;
    }

    public static WinterWyvernSplinterBlast instance() {
        if( instance == null ){
            instance = new WinterWyvernSplinterBlast();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusMovespeed() {
        return bonus_movespeed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlowTooltip() {
        return movespeed_slow_tooltip;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileMaxTime() {
        return projectile_max_time;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int getSecondaryProjectileSpeed() {
        return secondary_projectile_speed;
    }

    public int getSplitRadius() {
        return split_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WinterWyvernSplinterBlast))
            return false;
        if (object == this)
            return true;
        WinterWyvernSplinterBlast otherObject = (WinterWyvernSplinterBlast) object;
        return otherObject.getKey().equals(getKey());
    }

}
