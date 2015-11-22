package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinUnburrow extends Ability {

    private static NyxAssassinUnburrow instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private NyxAssassinUnburrow() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCooldown = 0;
        abilityManaCost = 0;
        fightRecapLevel = 1;
        iD = 5673;
        key = "nyx_assassin_unburrow";
        maxLevel = 1;
        localizedName = "Unburrow";
        owningHeroShortKey = "nyx_assassin";
    }

    public static NyxAssassinUnburrow instance() {
        if( instance == null ){
            instance = new NyxAssassinUnburrow();
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

    public int getAbilityManaCost() {
        return abilityManaCost;
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
        if (!(object instanceof NyxAssassinUnburrow))
            return false;
        if (object == this)
            return true;
        NyxAssassinUnburrow otherObject = (NyxAssassinUnburrow) object;
        return otherObject.getKey().equals(getKey());
    }

}
