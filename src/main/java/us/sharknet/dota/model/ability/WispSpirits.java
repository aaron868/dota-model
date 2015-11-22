package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispSpirits extends Ability {

    private static WispSpirits instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] creep_damage;
    private final int default_radius;
    private final int[] explode_radius;
    private final int[] hero_damage;
    private final int[] hero_hit_radius;
    private final int[] hit_radius;
    private final String localizedName;
    private final int[] max_range;
    private final int[] min_range;
    private final String owningHeroShortKey;
    private final double[] revolution_time;
    private final double[] spirit_duration;
    private final int[] spirit_movement_rate;

    private WispSpirits() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = 0;
        abilityCooldown = new double[]{20.0,18.0,16.0,14.0};
        abilityDuration = new double[]{19.0,19.0,19.0,19.0};
        abilityManaCost = new int[]{120,130,140,150};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5486;
        key = "wisp_spirits";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        creep_damage = new int[]{8,14,20,26};
        default_radius = 15;
        explode_radius = new int[]{300,300,300,300};
        hero_damage = new int[]{25,50,75,100};
        hero_hit_radius = new int[]{70,70,70,70};
        hit_radius = new int[]{150,150,150,150};
        localizedName = "Spirits";
        max_range = new int[]{875,875,875,875};
        min_range = new int[]{100,100,100,100};
        owningHeroShortKey = "wisp";
        revolution_time = new double[]{5.0,5.0,5.0,5.0};
        spirit_duration = new double[]{19.0,19.0,19.0,19.0};
        spirit_movement_rate = new int[]{250,250,250,250};
    }

    public static WispSpirits instance() {
        if( instance == null ){
            instance = new WispSpirits();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int[] getCreepDamage() {
        return creep_damage;
    }

    public int getDefaultRadius() {
        return default_radius;
    }

    public int[] getExplodeRadius() {
        return explode_radius;
    }

    public int[] getHeroDamage() {
        return hero_damage;
    }

    public int[] getHeroHitRadius() {
        return hero_hit_radius;
    }

    public int[] getHitRadius() {
        return hit_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxRange() {
        return max_range;
    }

    public int[] getMinRange() {
        return min_range;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getRevolutionTime() {
        return revolution_time;
    }

    public double[] getSpiritDuration() {
        return spirit_duration;
    }

    public int[] getSpiritMovementRate() {
        return spirit_movement_rate;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WispSpirits))
            return false;
        if (object == this)
            return true;
        WispSpirits otherObject = (WispSpirits) object;
        return otherObject.getKey().equals(getKey());
    }

}
