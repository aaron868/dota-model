package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpectreReality extends Ability {

    private static SpectreReality instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SpectreReality() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{0,0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5338;
        key = "spectre_reality";
        localizedName = "Reality";
        ownerKey = "npc_dota_hero_spectre";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static SpectreReality instance() {
        if( instance == null ){
            instance = new SpectreReality();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof SpectreReality))
            return false;
        if (object == this)
            return true;
        SpectreReality otherObject = (SpectreReality) object;
        return otherObject.getKey().equals(getKey());
    }

}
