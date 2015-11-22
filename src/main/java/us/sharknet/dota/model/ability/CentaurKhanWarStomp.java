package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurKhanWarStomp extends Ability {

    private static CentaurKhanWarStomp instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int hero_stun_duration;
    private final String localizedName;
    private final int non_hero_stun_duration;
    private final String owningHeroShortKey;
    private final int radius;

    private CentaurKhanWarStomp() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .5;
        abilityCooldown = 2;
        abilityDamage = 25;
        abilityManaCost = 1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5295;
        key = "centaur_khan_war_stomp";
        maxLevel = 1;
        hero_stun_duration = 2;
        localizedName = "War Stomp";
        non_hero_stun_duration = 3;
        owningHeroShortKey = "centaur_khan";
        radius = 25;
    }

    public static CentaurKhanWarStomp instance() {
        if( instance == null ){
            instance = new CentaurKhanWarStomp();
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

    public int getHeroStunDuration() {
        return hero_stun_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNonHeroStunDuration() {
        return non_hero_stun_duration;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CentaurKhanWarStomp))
            return false;
        if (object == this)
            return true;
        CentaurKhanWarStomp otherObject = (CentaurKhanWarStomp) object;
        return otherObject.getKey().equals(getKey());
    }

}
