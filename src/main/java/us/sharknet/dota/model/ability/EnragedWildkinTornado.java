package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnragedWildkinTornado extends Ability {

    private static EnragedWildkinTornado instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private EnragedWildkinTornado() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{.75,.75,.75,.75};
        abilityCastRange = new int[]{500,500,500,500};
        abilityChannelTime = new double[]{4,4,4,4};
        abilityCooldown = new double[]{7,7,7,7};
        abilityManaCost = new int[]{200,200,200,200};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5312;
        key = "enraged_wildkin_tornado";
        duration = 4;
        localizedName = "Tornado";
        ownerKey = "npc_dota_neutral_enraged_wildkin";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static EnragedWildkinTornado instance() {
        if( instance == null ){
            instance = new EnragedWildkinTornado();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDuration() {
        return duration;
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
        if (!(object instanceof EnragedWildkinTornado))
            return false;
        if (object == this)
            return true;
        EnragedWildkinTornado otherObject = (EnragedWildkinTornado) object;
        return otherObject.getKey().equals(getKey());
    }

}
