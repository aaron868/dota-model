package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomLancerPhantomEdge extends Ability {

    private static PhantomLancerPhantomEdge instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final int bonus_speed;
    private final String localizedName;
    private final int[] max_distance;
    private final int min_distance;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private PhantomLancerPhantomEdge() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{16,12,8,4};
        iD = 5068;
        key = "phantom_lancer_phantom_edge";
        bonus_speed = 800;
        localizedName = "Phantom Rush";
        max_distance = new int[]{600,700,800,900};
        min_distance = 300;
        ownerKey = "npc_dota_hero_phantom_lancer";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static PhantomLancerPhantomEdge instance() {
        if( instance == null ){
            instance = new PhantomLancerPhantomEdge();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int getBonusSpeed() {
        return bonus_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxDistance() {
        return max_distance;
    }

    public int getMinDistance() {
        return min_distance;
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
        if (!(object instanceof PhantomLancerPhantomEdge))
            return false;
        if (object == this)
            return true;
        PhantomLancerPhantomEdge otherObject = (PhantomLancerPhantomEdge) object;
        return otherObject.getKey().equals(getKey());
    }

}
