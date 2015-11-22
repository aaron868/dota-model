package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AncientApparitionIceBlast extends Ability {

    private static AncientApparitionIceBlast instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] dot_damage;
    private final double[] frostbite_duration;
    private final int frostbite_duration_scepter;
    private final double[] kill_pct;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] path_radius;
    private final double[] radius_grow;
    private final int[] radius_max;
    private final int[] radius_min;
    private final int[] speed;
    private final int[] target_sight_radius;

    private AncientApparitionIceBlast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.01,0.01,0.01};
        abilityCastRange = 0;
        abilityCooldown = 4;
        abilityDamage = new int[]{250,350,450};
        abilityManaCost = new int[]{100,125,150};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5348;
        key = "ancient_apparition_ice_blast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        dot_damage = new double[]{12.5,20.0,32.0};
        frostbite_duration = new double[]{8.0,9.0,10.0};
        frostbite_duration_scepter = 17;
        kill_pct = new double[]{10.0,11.0,12.0};
        localizedName = "Ice Blast";
        owningHeroShortKey = "ancient_apparition";
        path_radius = new int[]{275,275,275};
        radius_grow = new double[]{50.0,50.0,50.0};
        radius_max = new int[]{1000,1000,1000};
        radius_min = new int[]{275,275,275};
        speed = new int[]{1500,1500,1500,1500};
        target_sight_radius = new int[]{500,500,500};
    }

    public static AncientApparitionIceBlast instance() {
        if( instance == null ){
            instance = new AncientApparitionIceBlast();
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

    public double[] getDotDamage() {
        return dot_damage;
    }

    public double[] getFrostbiteDuration() {
        return frostbite_duration;
    }

    public int getFrostbiteDurationScepter() {
        return frostbite_duration_scepter;
    }

    public double[] getKillPct() {
        return kill_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPathRadius() {
        return path_radius;
    }

    public double[] getRadiusGrow() {
        return radius_grow;
    }

    public int[] getRadiusMax() {
        return radius_max;
    }

    public int[] getRadiusMin() {
        return radius_min;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getTargetSightRadius() {
        return target_sight_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientApparitionIceBlast))
            return false;
        if (object == this)
            return true;
        AncientApparitionIceBlast otherObject = (AncientApparitionIceBlast) object;
        return otherObject.getKey().equals(getKey());
    }

}
