package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickTelekinesisLand extends Ability {

    private static RubickTelekinesisLand instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private RubickTelekinesisLand() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_AOE"};
        iD = 5449;
        key = "rubick_telekinesis_land";
        maxLevel = 1;
        localizedName = "Telekinesis Land";
        owningHeroShortKey = "rubick";
        radius = new int[]{325,325,325,325};
    }

    public static RubickTelekinesisLand instance() {
        if( instance == null ){
            instance = new RubickTelekinesisLand();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RubickTelekinesisLand))
            return false;
        if (object == this)
            return true;
        RubickTelekinesisLand otherObject = (RubickTelekinesisLand) object;
        return otherObject.getKey().equals(getKey());
    }

}
