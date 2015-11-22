package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlackDragonDragonhideAura extends Ability {

    private static BlackDragonDragonhideAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bonus_armor;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private BlackDragonDragonhideAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5681;
        key = "black_dragon_dragonhide_aura";
        maxLevel = 1;
        bonus_armor = 2;
        localizedName = "Dragonhide Aura";
        owningHeroShortKey = "black_dragon";
        radius = 9;
    }

    public static BlackDragonDragonhideAura instance() {
        if( instance == null ){
            instance = new BlackDragonDragonhideAura();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlackDragonDragonhideAura))
            return false;
        if (object == this)
            return true;
        BlackDragonDragonhideAura otherObject = (BlackDragonDragonhideAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
