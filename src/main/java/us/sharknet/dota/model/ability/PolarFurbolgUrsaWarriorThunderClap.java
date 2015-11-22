package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PolarFurbolgUrsaWarriorThunderClap extends Ability {

    private static PolarFurbolgUrsaWarriorThunderClap instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int attackspeed_slow;
    private final int duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final String owningHeroShortKey;
    private final int radius;

    private PolarFurbolgUrsaWarriorThunderClap() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .5;
        abilityCooldown = 12;
        abilityDamage = 150;
        abilityManaCost = 100;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5302;
        key = "polar_furbolg_ursa_warrior_thunder_clap";
        maxLevel = 1;
        attackspeed_slow = -25;
        duration = 3;
        localizedName = "Thunder Clap";
        movespeed_slow = -25;
        owningHeroShortKey = "polar_furbolg_ursa_warrior";
        radius = 300;
    }

    public static PolarFurbolgUrsaWarriorThunderClap instance() {
        if( instance == null ){
            instance = new PolarFurbolgUrsaWarriorThunderClap();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityManaCost() {
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PolarFurbolgUrsaWarriorThunderClap))
            return false;
        if (object == this)
            return true;
        PolarFurbolgUrsaWarriorThunderClap otherObject = (PolarFurbolgUrsaWarriorThunderClap) object;
        return otherObject.getKey().equals(getKey());
    }

}
