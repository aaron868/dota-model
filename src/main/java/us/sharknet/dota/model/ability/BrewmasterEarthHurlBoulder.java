package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterEarthHurlBoulder extends Ability {

    private static BrewmasterEarthHurlBoulder instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] speed;

    private BrewmasterEarthHurlBoulder() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .4;
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = 5;
        abilityManaCost = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 544;
        key = "brewmaster_earth_hurl_boulder";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = 5;
        duration = new double[]{2.0,2.0,2.0,2.0};
        localizedName = "Hurl Boulder";
        owningHeroShortKey = "brewmaster_earth";
        speed = new int[]{800,800,800,800};
    }

    public static BrewmasterEarthHurlBoulder instance() {
        if( instance == null ){
            instance = new BrewmasterEarthHurlBoulder();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterEarthHurlBoulder))
            return false;
        if (object == this)
            return true;
        BrewmasterEarthHurlBoulder otherObject = (BrewmasterEarthHurlBoulder) object;
        return otherObject.getKey().equals(getKey());
    }

}
