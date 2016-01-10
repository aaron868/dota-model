package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VisageGravekeepersCloak extends Ability {

    private static VisageGravekeepersCloak instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_armor;
    private final int[] bonus_resist;
    private final String localizedName;
    private final int max_layers;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int recovery_time;

    private VisageGravekeepersCloak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5482;
        key = "visage_gravekeepers_cloak";
        bonus_armor = new int[]{1,2,4,5};
        bonus_resist = new int[]{3,6,12,16};
        localizedName = "Gravekeepers Cloak";
        max_layers = 4;
        ownerKey = "npc_dota_hero_visage";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        recovery_time = 4;
    }

    public static VisageGravekeepersCloak instance() {
        if( instance == null ){
            instance = new VisageGravekeepersCloak();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusArmor() {
        return bonus_armor;
    }

    public int[] getBonusResist() {
        return bonus_resist;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxLayers() {
        return max_layers;
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

    public int getRecoveryTime() {
        return recovery_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VisageGravekeepersCloak))
            return false;
        if (object == this)
            return true;
        VisageGravekeepersCloak otherObject = (VisageGravekeepersCloak) object;
        return otherObject.getKey().equals(getKey());
    }

}
