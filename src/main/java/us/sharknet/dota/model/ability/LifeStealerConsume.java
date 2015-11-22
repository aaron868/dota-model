package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerConsume extends Ability {

    private static LifeStealerConsume instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LifeStealerConsume() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_UNRESTRICTED","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 1;
        iD = 5253;
        key = "life_stealer_consume";
        localizedName = "Consume";
        owningHeroShortKey = "life_stealer";
    }

    public static LifeStealerConsume instance() {
        if( instance == null ){
            instance = new LifeStealerConsume();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public String getAbilityType() {
        return abilityType;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerConsume))
            return false;
        if (object == this)
            return true;
        LifeStealerConsume otherObject = (LifeStealerConsume) object;
        return otherObject.getKey().equals(getKey());
    }

}
