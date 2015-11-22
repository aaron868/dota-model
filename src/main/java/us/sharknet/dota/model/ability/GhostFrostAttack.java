package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GhostFrostAttack extends Ability {

    private static GhostFrostAttack instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int attackspeed_slow;
    private final double duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final String owningHeroShortKey;

    private GhostFrostAttack() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5301;
        key = "ghost_frost_attack";
        maxLevel = 1;
        attackspeed_slow = -20;
        duration = 1.5;
        localizedName = "Frost Attack";
        movespeed_slow = -20;
        owningHeroShortKey = "ghost";
    }

    public static GhostFrostAttack instance() {
        if( instance == null ){
            instance = new GhostFrostAttack();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double getDuration() {
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GhostFrostAttack))
            return false;
        if (object == this)
            return true;
        GhostFrostAttack otherObject = (GhostFrostAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
