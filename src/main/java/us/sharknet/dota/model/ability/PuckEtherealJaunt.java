package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PuckEtherealJaunt extends Ability {

    private static PuckEtherealJaunt instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private PuckEtherealJaunt() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5070;
        key = "puck_ethereal_jaunt";
        localizedName = "Ethereal Jaunt";
        ownerKey = "npc_dota_hero_puck";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static PuckEtherealJaunt instance() {
        if( instance == null ){
            instance = new PuckEtherealJaunt();
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
        if (!(object instanceof PuckEtherealJaunt))
            return false;
        if (object == this)
            return true;
        PuckEtherealJaunt otherObject = (PuckEtherealJaunt) object;
        return otherObject.getKey().equals(getKey());
    }

}
