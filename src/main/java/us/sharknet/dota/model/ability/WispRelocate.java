package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispRelocate extends Ability {

    private static WispRelocate instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final double[] cast_delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] return_time;

    private WispRelocate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0,0,0};
        abilityCooldown = new double[]{90.0,75.0,60.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5488;
        key = "wisp_relocate";
        cast_delay = new double[]{2.5,2.25,2.0};
        localizedName = "Relocate";
        ownerKey = "npc_dota_hero_wisp";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        return_time = new double[]{12.0,12.0,12.0};
    }

    public static WispRelocate instance() {
        if( instance == null ){
            instance = new WispRelocate();
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

    public double[] getCastDelay() {
        return cast_delay;
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

    public double[] getReturnTime() {
        return return_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WispRelocate))
            return false;
        if (object == this)
            return true;
        WispRelocate otherObject = (WispRelocate) object;
        return otherObject.getKey().equals(getKey());
    }

}
