package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantEyesInTheForest extends Ability {

    private static TreantEyesInTheForest instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final boolean isGrantedByScepter;
    private final String key;
    private final int damage;
    private final String localizedName;
    private final int overgrowth_aoe;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int vision_aoe;

    private TreantEyesInTheForest() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{160,160,160,160};
        abilityCooldown = new double[]{25,25,25,25};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE"};
        iD = 5649;
        isGrantedByScepter = true;
        key = "treant_eyes_in_the_forest";
        damage = 175;
        localizedName = "Eyes in the Forest";
        overgrowth_aoe = 800;
        ownerKey = "npc_dota_hero_treant";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public boolean getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
