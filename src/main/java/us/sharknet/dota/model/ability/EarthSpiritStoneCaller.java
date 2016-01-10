package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritStoneCaller extends Ability {

    private static EarthSpiritStoneCaller instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int charge_restore_time;
    private final int duration;
    private final String localizedName;
    private final int max_charges;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private EarthSpiritStoneCaller() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{1100,1100,1100,1100};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{0,0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5611;
        key = "earth_spirit_stone_caller";
        charge_restore_time = 3;
        duration = 12;
        localizedName = "Stone Caller";
        max_charges = 6;
        ownerKey = "npc_dota_hero_earth_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static EarthSpiritStoneCaller instance() {
        if( instance == null ){
            instance = new EarthSpiritStoneCaller();
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

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return max_charges;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritStoneCaller))
            return false;
        if (object == this)
            return true;
        EarthSpiritStoneCaller otherObject = (EarthSpiritStoneCaller) object;
        return otherObject.getKey().equals(getKey());
    }

}
