package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ForgedSpiritMeltingStrike extends Ability {

    private static ForgedSpiritMeltingStrike instance;

    private final String[] abilityBehavior;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int armor_removed;
    private final int duration;
    private final String localizedName;
    private final int max_armor_removed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ForgedSpiritMeltingStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityManaCost = new int[]{40,40,40,40};
        iD = 5388;
        key = "forged_spirit_melting_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        armor_removed = 1;
        duration = 5;
        localizedName = "Melting Strike";
        max_armor_removed = 10;
        ownerKey = "npc_dota_invoker_forged_spirit";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static ForgedSpiritMeltingStrike instance() {
        if( instance == null ){
            instance = new ForgedSpiritMeltingStrike();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getArmorRemoved() {
        return armor_removed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxArmorRemoved() {
        return max_armor_removed;
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
        if (!(object instanceof ForgedSpiritMeltingStrike))
            return false;
        if (object == this)
            return true;
        ForgedSpiritMeltingStrike otherObject = (ForgedSpiritMeltingStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
