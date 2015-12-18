package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinkerMarchOfTheMachines extends Ability {

    private static TinkerMarchOfTheMachines instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] collision_radius;
    private final int distance;
    private final int distance_scepter;
    private final int duration;
    private final String localizedName;
    private final int machines_per_sec;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] speed;
    private final int[] splash_radius;

    private TinkerMarchOfTheMachines() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.53,0.53,0.53,0.53};
        abilityCastRange = 300;
        abilityCooldown = new double[]{35.0,35.0,35.0,35.0};
        abilityDamage = new int[]{16,24,32,40};
        abilityManaCost = new int[]{145,150,165,190};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5152;
        key = "tinker_march_of_the_machines";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        collision_radius = new int[]{50,50,50,50};
        distance = 1800;
        distance_scepter = 1800;
        duration = 6;
        localizedName = "March Of The Machines";
        machines_per_sec = 24;
        owningHeroShortKey = "tinker";
        radius = 900;
        speed = new int[]{400,400,400,400};
        splash_radius = new int[]{150,150,150,150};
    }

    public static TinkerMarchOfTheMachines instance() {
        if( instance == null ){
            instance = new TinkerMarchOfTheMachines();
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

    public int[] getCollisionRadius() {
        return collision_radius;
    }

    public int getDistance() {
        return distance;
    }

    public int getDistanceScepter() {
        return distance_scepter;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMachinesPerSec() {
        return machines_per_sec;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getSplashRadius() {
        return splash_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinkerMarchOfTheMachines))
            return false;
        if (object == this)
            return true;
        TinkerMarchOfTheMachines otherObject = (TinkerMarchOfTheMachines) object;
        return otherObject.getKey().equals(getKey());
    }

}
