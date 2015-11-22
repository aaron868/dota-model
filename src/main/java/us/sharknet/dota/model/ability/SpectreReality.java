package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpectreReality extends Ability {

    private static SpectreReality instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private SpectreReality() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = 0;
        abilityCooldown = 0;
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5338;
        key = "spectre_reality";
        maxLevel = 1;
        localizedName = "Reality";
        owningHeroShortKey = "spectre";
    }

    public static SpectreReality instance() {
        if( instance == null ){
            instance = new SpectreReality();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SpectreReality))
            return false;
        if (object == this)
            return true;
        SpectreReality otherObject = (SpectreReality) object;
        return otherObject.getKey().equals(getKey());
    }

}
