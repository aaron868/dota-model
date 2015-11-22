package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ZuusThundergodsWrath extends Ability {

    private static ZuusThundergodsWrath instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int[] damage_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] sight_duration;
    private final int sight_radius_day;
    private final int sight_radius_night;
    private final int[] true_sight_radius;
    private final int true_sight_radius_tooltip;

    private ZuusThundergodsWrath() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCooldown = 9;
        abilityManaCost = new int[]{225,325,450};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5113;
        key = "zuus_thundergods_wrath";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{225,350,475};
        damage_scepter = new int[]{440,540,640};
        localizedName = "Thundergods Wrath";
        owningHeroShortKey = "zuus";
        sight_duration = new double[]{3.0,3.0,3.0,3.0};
        sight_radius_day = 500;
        sight_radius_night = 500;
        true_sight_radius = new int[]{900,900,900};
        true_sight_radius_tooltip = 500;
    }

    public static ZuusThundergodsWrath instance() {
        if( instance == null ){
            instance = new ZuusThundergodsWrath();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getSightDuration() {
        return sight_duration;
    }

    public int getSightRadiusDay() {
        return sight_radius_day;
    }

    public int getSightRadiusNight() {
        return sight_radius_night;
    }

    public int[] getTrueSightRadius() {
        return true_sight_radius;
    }

    public int getTrueSightRadiusTooltip() {
        return true_sight_radius_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ZuusThundergodsWrath))
            return false;
        if (object == this)
            return true;
        ZuusThundergodsWrath otherObject = (ZuusThundergodsWrath) object;
        return otherObject.getKey().equals(getKey());
    }

}
