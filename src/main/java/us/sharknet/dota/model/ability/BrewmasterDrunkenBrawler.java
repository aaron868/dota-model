package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterDrunkenBrawler extends Ability {

    private static BrewmasterDrunkenBrawler instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] crit_chance;
    private final int crit_multiplier;
    private final int[] dodge_chance;
    private final double[] last_proc;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BrewmasterDrunkenBrawler() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5402;
        key = "brewmaster_drunken_brawler";
        crit_chance = new int[]{10,15,20,25};
        crit_multiplier = 200;
        dodge_chance = new int[]{10,15,20,25};
        last_proc = new double[]{16.0,14.0,12.0,10.0};
        localizedName = "Drunken Brawler";
        owningHeroShortKey = "brewmaster";
    }

    public static BrewmasterDrunkenBrawler instance() {
        if( instance == null ){
            instance = new BrewmasterDrunkenBrawler();
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

    public int[] getCritChance() {
        return crit_chance;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
    }

    public int[] getDodgeChance() {
        return dodge_chance;
    }

    public double[] getLastProc() {
        return last_proc;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterDrunkenBrawler))
            return false;
        if (object == this)
            return true;
        BrewmasterDrunkenBrawler otherObject = (BrewmasterDrunkenBrawler) object;
        return otherObject.getKey().equals(getKey());
    }

}
