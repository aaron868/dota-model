package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AntimageSpellShield extends Ability {

    private static AntimageSpellShield instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] spell_shield_resistance;

    private AntimageSpellShield() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5005;
        key = "antimage_spell_shield";
        localizedName = "Spell Shield";
        ownerKey = "npc_dota_hero_antimage";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        spell_shield_resistance = new int[]{26,34,42,50};
    }

    public static AntimageSpellShield instance() {
        if( instance == null ){
            instance = new AntimageSpellShield();
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

    public int[] getSpellShieldResistance() {
        return spell_shield_resistance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AntimageSpellShield))
            return false;
        if (object == this)
            return true;
        AntimageSpellShield otherObject = (AntimageSpellShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
