package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingMorph extends Ability {

    private static MorphlingMorph instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_attributes;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private MorphlingMorph() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        iD = 5054;
        key = "morphling_morph";
        bonus_attributes = new int[]{3,4,5,6};
        localizedName = "Morph";
        ownerKey = "npc_dota_hero_morphling";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static MorphlingMorph instance() {
        if( instance == null ){
            instance = new MorphlingMorph();
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

    public int[] getBonusAttributes() {
        return bonus_attributes;
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
        if (!(object instanceof MorphlingMorph))
            return false;
        if (object == this)
            return true;
        MorphlingMorph otherObject = (MorphlingMorph) object;
        return otherObject.getKey().equals(getKey());
    }

}
