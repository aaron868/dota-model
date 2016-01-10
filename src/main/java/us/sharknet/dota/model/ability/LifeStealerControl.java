package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerControl extends Ability {

    private static LifeStealerControl instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LifeStealerControl() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_UNRESTRICTED","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5655;
        key = "life_stealer_control";
        localizedName = "Control";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static LifeStealerControl instance() {
        if( instance == null ){
            instance = new LifeStealerControl();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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
        if (!(object instanceof LifeStealerControl))
            return false;
        if (object == this)
            return true;
        LifeStealerControl otherObject = (LifeStealerControl) object;
        return otherObject.getKey().equals(getKey());
    }

}
