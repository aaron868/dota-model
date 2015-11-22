package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FurionTeleportation extends Ability {

    private static FurionTeleportation instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private FurionTeleportation() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new int[]{3,3,3,3};
        abilityCastRange = 0;
        abilityCooldown = new int[]{50,40,30,20};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5246;
        key = "furion_teleportation";
        localizedName = "Teleportation";
        owningHeroShortKey = "furion";
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

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
