package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NagaSirenSongOfTheSirenCancel extends Ability {

    private static NagaSirenSongOfTheSirenCancel instance;

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

    private NagaSirenSongOfTheSirenCancel() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0};
        abilityCooldown = new double[]{1.0,1.0,1.0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5478;
        key = "naga_siren_song_of_the_siren_cancel";
        localizedName = "Song Of The Siren Cancel";
        ownerKey = "npc_dota_hero_naga_siren";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NagaSirenSongOfTheSirenCancel instance() {
        if( instance == null ){
            instance = new NagaSirenSongOfTheSirenCancel();
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
        if (!(object instanceof NagaSirenSongOfTheSirenCancel))
            return false;
        if (object == this)
            return true;
        NagaSirenSongOfTheSirenCancel otherObject = (NagaSirenSongOfTheSirenCancel) object;
        return otherObject.getKey().equals(getKey());
    }

}
