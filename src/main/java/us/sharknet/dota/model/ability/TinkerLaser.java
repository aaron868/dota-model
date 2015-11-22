package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinkerLaser extends Ability {

    private static TinkerLaser instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_range_scepter;
    private final int cast_range_tooltip;
    private final double[] duration_creep;
    private final double[] duration_hero;
    private final String localizedName;
    private final int[] miss_rate;
    private final String owningHeroShortKey;

    private TinkerLaser() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.53,0.53,0.53,0.53};
        abilityCastRange = 55;
        abilityCooldown = new double[]{14.0,14.0,14.0,14.0};
        abilityDamage = new int[]{80,160,240,320};
        abilityManaCost = new int[]{95,120,145,170};
        abilityModifierSupportValue = .3;
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 515;
        key = "tinker_laser";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_scepter = 55;
        cast_range_tooltip = 55;
        duration_creep = new double[]{6.0,6.0,6.0,6.0};
        duration_hero = new double[]{3.0,3.5,4.0,4.5};
        localizedName = "Laser";
        miss_rate = new int[]{100,100,100,100};
        owningHeroShortKey = "tinker";
    }

    public static TinkerLaser instance() {
        if( instance == null ){
            instance = new TinkerLaser();
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

    public int[] getAbilityManaCost() {
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

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getDurationCreep() {
        return duration_creep;
    }

    public double[] getDurationHero() {
        return duration_hero;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMissRate() {
        return miss_rate;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinkerLaser))
            return false;
        if (object == this)
            return true;
        TinkerLaser otherObject = (TinkerLaser) object;
        return otherObject.getKey().equals(getKey());
    }

}
