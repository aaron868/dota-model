package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidTrueFormDruid extends Ability {

    private static LoneDruidTrueFormDruid instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double transformation_time;

    private LoneDruidTrueFormDruid() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{0,0,0};
        abilityCooldown = new double[]{0.0,0.0,0.0};
        abilityManaCost = new int[]{25,25,25};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5416;
        key = "lone_druid_true_form_druid";
        localizedName = "True Form Druid";
        ownerKey = "npc_dota_hero_lone_druid";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        transformation_time = 1.933;
    }

    public static LoneDruidTrueFormDruid instance() {
        if( instance == null ){
            instance = new LoneDruidTrueFormDruid();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public String getLocalizedName() {
        return localizedName;
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

    public double getTransformationTime() {
        return transformation_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidTrueFormDruid))
            return false;
        if (object == this)
            return true;
        LoneDruidTrueFormDruid otherObject = (LoneDruidTrueFormDruid) object;
        return otherObject.getKey().equals(getKey());
    }

}
