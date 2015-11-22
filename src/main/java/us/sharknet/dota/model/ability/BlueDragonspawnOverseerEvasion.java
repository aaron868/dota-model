package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlueDragonspawnOverseerEvasion extends Ability {

    private static BlueDragonspawnOverseerEvasion instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int evasion_chance_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BlueDragonspawnOverseerEvasion() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5326;
        key = "blue_dragonspawn_overseer_evasion";
        maxLevel = 1;
        evasion_chance_pct = 15;
        localizedName = "Evasion";
        owningHeroShortKey = "blue_dragonspawn";
    }

    public static BlueDragonspawnOverseerEvasion instance() {
        if( instance == null ){
            instance = new BlueDragonspawnOverseerEvasion();
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

    public int getEvasionChancePct() {
        return evasion_chance_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlueDragonspawnOverseerEvasion))
            return false;
        if (object == this)
            return true;
        BlueDragonspawnOverseerEvasion otherObject = (BlueDragonspawnOverseerEvasion) object;
        return otherObject.getKey().equals(getKey());
    }

}
