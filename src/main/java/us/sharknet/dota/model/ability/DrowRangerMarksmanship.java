package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerMarksmanship extends Ability {

    private static DrowRangerMarksmanship instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int damage_reduction_scepter;
    private final String localizedName;
    private final int[] marksmanship_agility_bonus;
    private final String owningHeroShortKey;
    private final int radius;
    private final int scepter_range;
    private final int split_count_scepter;

    private DrowRangerMarksmanship() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5022;
        key = "drow_ranger_marksmanship";
        damage_reduction_scepter = 50;
        localizedName = "Marksmanship";
        marksmanship_agility_bonus = new int[]{40,60,80};
        owningHeroShortKey = "drow_ranger";
        radius = 400;
        scepter_range = 375;
        split_count_scepter = 2;
    }

    public static DrowRangerMarksmanship instance() {
        if( instance == null ){
            instance = new DrowRangerMarksmanship();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getDamageReductionScepter() {
        return damage_reduction_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMarksmanshipAgilityBonus() {
        return marksmanship_agility_bonus;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getScepterRange() {
        return scepter_range;
    }

    public int getSplitCountScepter() {
        return split_count_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DrowRangerMarksmanship))
            return false;
        if (object == this)
            return true;
        DrowRangerMarksmanship otherObject = (DrowRangerMarksmanship) object;
        return otherObject.getKey().equals(getKey());
    }

}
