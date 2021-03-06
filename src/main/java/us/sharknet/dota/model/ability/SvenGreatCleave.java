package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SvenGreatCleave extends Ability {

    private static SvenGreatCleave instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] great_cleave_damage;
    private final int great_cleave_radius;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SvenGreatCleave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5095;
        key = "sven_great_cleave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        great_cleave_damage = new int[]{30,42,54,66};
        great_cleave_radius = 300;
        localizedName = "Great Cleave";
        ownerKey = "npc_dota_hero_sven";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static SvenGreatCleave instance() {
        if( instance == null ){
            instance = new SvenGreatCleave();
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

    public int[] getGreatCleaveDamage() {
        return great_cleave_damage;
    }

    public int getGreatCleaveRadius() {
        return great_cleave_radius;
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
        if (!(object instanceof SvenGreatCleave))
            return false;
        if (object == this)
            return true;
        SvenGreatCleave otherObject = (SvenGreatCleave) object;
        return otherObject.getKey().equals(getKey());
    }

}
