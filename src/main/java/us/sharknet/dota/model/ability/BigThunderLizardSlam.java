package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BigThunderLizardSlam extends Ability {

    private static BigThunderLizardSlam instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int attack_slow_tooltip;
    private final int hero_duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final int non_hero_duration;
    private final String owningHeroShortKey;
    private final int radius;

    private BigThunderLizardSlam() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = 0;
        abilityCooldown = 6;
        abilityDamage = 7;
        abilityManaCost = 9;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5332;
        key = "big_thunder_lizard_slam";
        maxLevel = 1;
        attack_slow_tooltip = -25;
        hero_duration = 2;
        localizedName = "Slam";
        movespeed_slow = -25;
        non_hero_duration = 4;
        owningHeroShortKey = "big_thunder_lizard";
        radius = 25;
    }

    public static BigThunderLizardSlam instance() {
        if( instance == null ){
            instance = new BigThunderLizardSlam();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
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

    public int getAttackSlowTooltip() {
        return attack_slow_tooltip;
    }

    public int getHeroDuration() {
        return hero_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
    }

    public int getNonHeroDuration() {
        return non_hero_duration;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BigThunderLizardSlam))
            return false;
        if (object == this)
            return true;
        BigThunderLizardSlam otherObject = (BigThunderLizardSlam) object;
        return otherObject.getKey().equals(getKey());
    }

}
