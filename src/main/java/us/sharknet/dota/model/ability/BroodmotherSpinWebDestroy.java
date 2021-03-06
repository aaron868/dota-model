package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpinWebDestroy extends Ability {

    private static BroodmotherSpinWebDestroy instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BroodmotherSpinWebDestroy() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5643;
        key = "broodmother_spin_web_destroy";
        localizedName = "Spin Web Detroy";
        ownerKey = "npc_dota_hero_broodmother";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static BroodmotherSpinWebDestroy instance() {
        if( instance == null ){
            instance = new BroodmotherSpinWebDestroy();
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
        if (!(object instanceof BroodmotherSpinWebDestroy))
            return false;
        if (object == this)
            return true;
        BroodmotherSpinWebDestroy otherObject = (BroodmotherSpinWebDestroy) object;
        return otherObject.getKey().equals(getKey());
    }

}
