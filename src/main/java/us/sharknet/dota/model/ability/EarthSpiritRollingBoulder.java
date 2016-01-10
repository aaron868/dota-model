package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritRollingBoulder extends Ability {

    private static EarthSpiritRollingBoulder instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage;
    private final double delay;
    private final int distance;
    private final String localizedName;
    private final int move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int rock_distance;
    private final int rock_speed;
    private final int slow_duration;
    private final int speed;

    private EarthSpiritRollingBoulder() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{3000,3000,3000,3000};
        abilityCooldown = new double[]{16.0,12.0,8.0,4.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5609;
        key = "earth_spirit_rolling_boulder";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = 100;
        delay = .6;
        distance = 8;
        localizedName = "Rolling Boulder";
        move_slow = 80;
        ownerKey = "npc_dota_hero_earth_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 150;
        rock_distance = 16;
        rock_speed = 1600;
        slow_duration = 2;
        speed = 800;
    }

    public static EarthSpiritRollingBoulder instance() {
        if( instance == null ){
            instance = new EarthSpiritRollingBoulder();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int getDamage() {
        return damage;
    }

    public double getDelay() {
        return delay;
    }

    public int getDistance() {
        return distance;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSlow() {
        return move_slow;
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

    public int getRockDistance() {
        return rock_distance;
    }

    public int getRockSpeed() {
        return rock_speed;
    }

    public int getSlowDuration() {
        return slow_duration;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritRollingBoulder))
            return false;
        if (object == this)
            return true;
        EarthSpiritRollingBoulder otherObject = (EarthSpiritRollingBoulder) object;
        return otherObject.getKey().equals(getKey());
    }

}
