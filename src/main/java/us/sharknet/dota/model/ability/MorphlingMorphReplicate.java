package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingMorphReplicate extends Ability {

    private static MorphlingMorphReplicate instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private MorphlingMorphReplicate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{.25,.25,.25,.25};
        abilityManaCost = new int[]{150,150,150};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5058;
        key = "morphling_morph_replicate";
        localizedName = "Morph Replicate";
        ownerKey = "npc_dota_hero_morphling";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static MorphlingMorphReplicate instance() {
        if( instance == null ){
            instance = new MorphlingMorphReplicate();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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
        if (!(object instanceof MorphlingMorphReplicate))
            return false;
        if (object == this)
            return true;
        MorphlingMorphReplicate otherObject = (MorphlingMorphReplicate) object;
        return otherObject.getKey().equals(getKey());
    }

}
