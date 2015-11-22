package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlackDragonSplashAttack extends Ability {

    private static BlackDragonSplashAttack instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int damage_percent_close;
    private final int damage_percent_far;
    private final int damage_percent_mid;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int range_close;
    private final int range_far;
    private final int range_mid;

    private BlackDragonSplashAttack() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5324;
        key = "black_dragon_splash_attack";
        maxLevel = 1;
        damage_percent_close = 1;
        damage_percent_far = 25;
        damage_percent_mid = 5;
        localizedName = "Splash Attack";
        owningHeroShortKey = "black_dragon";
        range_close = 5;
        range_far = 25;
        range_mid = 15;
    }

    public static BlackDragonSplashAttack instance() {
        if( instance == null ){
            instance = new BlackDragonSplashAttack();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getDamagePercentClose() {
        return damage_percent_close;
    }

    public int getDamagePercentFar() {
        return damage_percent_far;
    }

    public int getDamagePercentMid() {
        return damage_percent_mid;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRangeClose() {
        return range_close;
    }

    public int getRangeFar() {
        return range_far;
    }

    public int getRangeMid() {
        return range_mid;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlackDragonSplashAttack))
            return false;
        if (object == this)
            return true;
        BlackDragonSplashAttack otherObject = (BlackDragonSplashAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
