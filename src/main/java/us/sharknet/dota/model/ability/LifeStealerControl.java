package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerControl extends Ability {

    private static LifeStealerControl instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LifeStealerControl() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_UNRESTRICTED","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        fightRecapLevel = 1;
        iD = 5655;
        key = "life_stealer_control";
        maxLevel = 1;
        localizedName = "Control";
        owningHeroShortKey = "life_stealer";
    }

    public static LifeStealerControl instance() {
        if( instance == null ){
            instance = new LifeStealerControl();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerControl))
            return false;
        if (object == this)
            return true;
        LifeStealerControl otherObject = (LifeStealerControl) object;
        return otherObject.getKey().equals(getKey());
    }

}
