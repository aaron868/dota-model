package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantEyesInTheForest extends Ability {

    private static TreantEyesInTheForest instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final int isGrantedByScepter;
    private final String key;
    private final int maxLevel;
    private final int damage;
    private final String localizedName;
    private final int overgrowth_aoe;
    private final String owningHeroShortKey;
    private final int vision_aoe;

    private TreantEyesInTheForest() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = .2;
        abilityCastRange = 160;
        abilityCooldown = 25;
        abilityManaCost = 100;
        abilityUnitTargetType = "DOTA_UNIT_TARGET_TREE";
        fightRecapLevel = 1;
        iD = 5649;
        isGrantedByScepter = 1;
        key = "treant_eyes_in_the_forest";
        maxLevel = 1;
        damage = 175;
        localizedName = "Eyes in the Forest";
        overgrowth_aoe = 800;
        owningHeroShortKey = "treant";
        vision_aoe = 8;
    }

    public static TreantEyesInTheForest instance() {
        if( instance == null ){
            instance = new TreantEyesInTheForest();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public int getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getOvergrowthAoe() {
        return overgrowth_aoe;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getVisionAoe() {
        return vision_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TreantEyesInTheForest))
            return false;
        if (object == this)
            return true;
        TreantEyesInTheForest otherObject = (TreantEyesInTheForest) object;
        return otherObject.getKey().equals(getKey());
    }

}
