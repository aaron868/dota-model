package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KoboldTaskmasterSpeedAura extends Ability {

    private static KoboldTaskmasterSpeedAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bonus_movement_speed;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private KoboldTaskmasterSpeedAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5293;
        key = "kobold_taskmaster_speed_aura";
        maxLevel = 1;
        bonus_movement_speed = 12;
        localizedName = "Speed Aura";
        owningHeroShortKey = "kobold_taskmaster";
        radius = 900;
    }

    public static KoboldTaskmasterSpeedAura instance() {
        if( instance == null ){
            instance = new KoboldTaskmasterSpeedAura();
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

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
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
        if (!(object instanceof KoboldTaskmasterSpeedAura))
            return false;
        if (object == this)
            return true;
        KoboldTaskmasterSpeedAura otherObject = (KoboldTaskmasterSpeedAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
