package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TornadoTempest extends Ability {

    private static TornadoTempest instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int attackspeed_slow;
    private final int far_damage;
    private final int far_radius;
    private final String localizedName;
    private final int movespeed_slow;
    private final int near_damage;
    private final int near_radius;
    private final String owningHeroShortKey;
    private final double tick_rate;

    private TornadoTempest() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5310;
        key = "tornado_tempest";
        maxLevel = 1;
        attackspeed_slow = -15;
        far_damage = 15;
        far_radius = 600;
        localizedName = "Tornado Tempest";
        movespeed_slow = -15;
        near_damage = 45;
        near_radius = 150;
        owningHeroShortKey = "tornado";
        tick_rate = .25;
    }

    public static TornadoTempest instance() {
        if( instance == null ){
            instance = new TornadoTempest();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public int getFarDamage() {
        return far_damage;
    }

    public int getFarRadius() {
        return far_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
    }

    public int getNearDamage() {
        return near_damage;
    }

    public int getNearRadius() {
        return near_radius;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getTickRate() {
        return tick_rate;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TornadoTempest))
            return false;
        if (object == this)
            return true;
        TornadoTempest otherObject = (TornadoTempest) object;
        return otherObject.getKey().equals(getKey());
    }

}
