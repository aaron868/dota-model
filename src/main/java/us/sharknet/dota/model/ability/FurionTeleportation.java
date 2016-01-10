package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FurionTeleportation extends Ability {

    private static FurionTeleportation instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private FurionTeleportation() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new double[]{3,3,3,3};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{50,40,30,20};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5246;
        key = "furion_teleportation";
        localizedName = "Teleportation";
        ownerKey = "npc_dota_hero_furion";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static FurionTeleportation instance() {
        if( instance == null ){
            instance = new FurionTeleportation();
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
        if (!(object instanceof FurionTeleportation))
            return false;
        if (object == this)
            return true;
        FurionTeleportation otherObject = (FurionTeleportation) object;
        return otherObject.getKey().equals(getKey());
    }

}
