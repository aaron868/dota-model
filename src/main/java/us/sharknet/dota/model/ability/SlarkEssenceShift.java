package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlarkEssenceShift extends Ability {

    private static SlarkEssenceShift instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int agi_gain;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int stat_loss;

    private SlarkEssenceShift() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5496;
        key = "slark_essence_shift";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        agi_gain = 3;
        duration = new double[]{15.0,30.0,60.0,120.0};
        localizedName = "Essence Shift";
        ownerKey = "npc_dota_hero_slark";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        stat_loss = 1;
    }

    public static SlarkEssenceShift instance() {
        if( instance == null ){
            instance = new SlarkEssenceShift();
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAgiGain() {
        return agi_gain;
    }

    public double[] getDuration() {
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

    public int getStatLoss() {
        return stat_loss;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SlarkEssenceShift))
            return false;
        if (object == this)
            return true;
        SlarkEssenceShift otherObject = (SlarkEssenceShift) object;
        return otherObject.getKey().equals(getKey());
    }

}
