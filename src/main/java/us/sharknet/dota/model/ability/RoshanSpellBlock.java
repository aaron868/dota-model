package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RoshanSpellBlock extends Ability {

    private static RoshanSpellBlock instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private RoshanSpellBlock() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{15,15,15,15};
        iD = 5213;
        key = "roshan_spell_block";
        localizedName = "Spell Block";
        ownerKey = "npc_dota_roshan";
        ownerType = AbilityOwnerType.Roshan;
        passive = false;
        placeholder = false;
    }

    public static RoshanSpellBlock instance() {
        if( instance == null ){
            instance = new RoshanSpellBlock();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof RoshanSpellBlock))
            return false;
        if (object == this)
            return true;
        RoshanSpellBlock otherObject = (RoshanSpellBlock) object;
        return otherObject.getKey().equals(getKey());
    }

}
