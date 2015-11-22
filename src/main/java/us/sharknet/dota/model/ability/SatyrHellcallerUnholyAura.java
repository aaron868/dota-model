package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrHellcallerUnholyAura extends Ability {

    private static SatyrHellcallerUnholyAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int health_regen;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private SatyrHellcallerUnholyAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5317;
        key = "satyr_hellcaller_unholy_aura";
        maxLevel = 1;
        health_regen = 4;
        localizedName = "Unholy Aura";
        owningHeroShortKey = "satyr_hellcaller";
        radius = 9;
    }

    public static SatyrHellcallerUnholyAura instance() {
        if( instance == null ){
            instance = new SatyrHellcallerUnholyAura();
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

    public int getHealthRegen() {
        return health_regen;
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
        if (!(object instanceof SatyrHellcallerUnholyAura))
            return false;
        if (object == this)
            return true;
        SatyrHellcallerUnholyAura otherObject = (SatyrHellcallerUnholyAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
