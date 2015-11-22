package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VenomancerVenomousGale extends Ability {

    private static VenomancerVenomousGale instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final int[] movement_slow;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] speed;
    private final int[] strike_damage;
    private final int[] tick_damage;
    private final double[] tick_interval;

    private VenomancerVenomousGale() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 800;
        abilityCooldown = new double[]{22.0,22.0,22.0,22.0};
        abilityManaCost = 125;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5178;
        key = "venomancer_venomous_gale";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{15.0,15.0,15.0,15.0};
        localizedName = "Venomous Gale";
        movement_slow = new int[]{-50,-50,-50,-50};
        owningHeroShortKey = "venomancer";
        radius = 125;
        speed = new int[]{1200,1200,1200,1200};
        strike_damage = new int[]{25,50,75,100};
        tick_damage = new int[]{10,40,70,100};
        tick_interval = new double[]{3.0,3.0,3.0,3.0};
    }

    public static VenomancerVenomousGale instance() {
        if( instance == null ){
            instance = new VenomancerVenomousGale();
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

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSlow() {
        return movement_slow;
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

    public int[] getStrikeDamage() {
        return strike_damage;
    }

    public int[] getTickDamage() {
        return tick_damage;
    }

    public double[] getTickInterval() {
        return tick_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VenomancerVenomousGale))
            return false;
        if (object == this)
            return true;
        VenomancerVenomousGale otherObject = (VenomancerVenomousGale) object;
        return otherObject.getKey().equals(getKey());
    }

}
