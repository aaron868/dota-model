package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ZuusLightningBolt extends Ability {

    private static ZuusLightningBolt instance;

    private final String[] abilityBehavior;
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
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double sight_duration;
    private final int sight_radius_day;
    private final int sight_radius_night;
    private final int spread_aoe;
    private final int true_sight_radius;

    private ZuusLightningBolt() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 7;
        abilityCooldown = new double[]{6.0,6.0,6.0,6.0};
        abilityDamage = new int[]{100,175,275,350};
        abilityManaCost = new int[]{75,95,115,135};
        abilityModifierSupportValue = .1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5111;
        key = "zuus_lightning_bolt";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Lightning Bolt";
        owningHeroShortKey = "zuus";
        sight_duration = 4.5;
        sight_radius_day = 75;
        sight_radius_night = 75;
        spread_aoe = 325;
        true_sight_radius = 75;
    }

    public static ZuusLightningBolt instance() {
        if( instance == null ){
            instance = new ZuusLightningBolt();
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getSightDuration() {
        return sight_duration;
    }

    public int getSightRadiusDay() {
        return sight_radius_day;
    }

    public int getSightRadiusNight() {
        return sight_radius_night;
    }

    public int getSpreadAoe() {
        return spread_aoe;
    }

    public int getTrueSightRadius() {
        return true_sight_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ZuusLightningBolt))
            return false;
        if (object == this)
            return true;
        ZuusLightningBolt otherObject = (ZuusLightningBolt) object;
        return otherObject.getKey().equals(getKey());
    }

}