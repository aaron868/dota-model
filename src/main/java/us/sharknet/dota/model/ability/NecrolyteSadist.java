package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecrolyteSadist extends Ability {

    private static NecrolyteSadist instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] health_regen;
    private final int hero_multiplier;
    private final String localizedName;
    private final int[] mana_regen;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int regen_duration;

    private NecrolyteSadist() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5160;
        key = "necrolyte_sadist";
        health_regen = new int[]{1,2,3,6};
        hero_multiplier = 10;
        localizedName = "Sadist";
        mana_regen = new int[]{2,4,6,12};
        ownerKey = "npc_dota_hero_necrolyte";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        regen_duration = 6;
    }

    public static NecrolyteSadist instance() {
        if( instance == null ){
            instance = new NecrolyteSadist();
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

    public int[] getHealthRegen() {
        return health_regen;
    }

    public int getHeroMultiplier() {
        return hero_multiplier;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaRegen() {
        return mana_regen;
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

    public int getRegenDuration() {
        return regen_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecrolyteSadist))
            return false;
        if (object == this)
            return true;
        NecrolyteSadist otherObject = (NecrolyteSadist) object;
        return otherObject.getKey().equals(getKey());
    }

}
