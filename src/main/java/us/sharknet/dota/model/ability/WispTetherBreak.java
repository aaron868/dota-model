package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispTetherBreak extends Ability {

    private static WispTetherBreak instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WispTetherBreak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{1.0,1.0,1.0,1.0};
        iD = 5489;
        key = "wisp_tether_break";
        localizedName = "Tether Break";
        ownerKey = "npc_dota_hero_wisp";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static WispTetherBreak instance() {
        if( instance == null ){
            instance = new WispTetherBreak();
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WispTetherBreak))
            return false;
        if (object == this)
            return true;
        WispTetherBreak otherObject = (WispTetherBreak) object;
        return otherObject.getKey().equals(getKey());
    }

}
