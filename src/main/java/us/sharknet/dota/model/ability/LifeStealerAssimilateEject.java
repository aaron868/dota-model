package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerAssimilateEject extends Ability {

    private static LifeStealerAssimilateEject instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final int damage_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius_tooltip;

    private LifeStealerAssimilateEject() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5675;
        key = "life_stealer_assimilate_eject";
        damage_tooltip = 300;
        localizedName = "Eject";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius_tooltip = new int[]{700,700,700};
    }

    public static LifeStealerAssimilateEject instance() {
        if( instance == null ){
            instance = new LifeStealerAssimilateEject();
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

    public int getDamageTooltip() {
        return damage_tooltip;
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

    public int[] getRadiusTooltip() {
        return radius_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerAssimilateEject))
            return false;
        if (object == this)
            return true;
        LifeStealerAssimilateEject otherObject = (LifeStealerAssimilateEject) object;
        return otherObject.getKey().equals(getKey());
    }

}
