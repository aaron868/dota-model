package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UrsaFurySwipes extends Ability {

    private static UrsaFurySwipes instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_reset_time;
    private final int bonus_reset_time_roshan;
    private final int[] damage_per_stack;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private UrsaFurySwipes() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5359;
        key = "ursa_fury_swipes";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_reset_time = 15;
        bonus_reset_time_roshan = 6;
        damage_per_stack = new int[]{15,20,25,30};
        localizedName = "Fury Swipes";
        ownerKey = "npc_dota_hero_ursa";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static UrsaFurySwipes instance() {
        if( instance == null ){
            instance = new UrsaFurySwipes();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getBonusResetTime() {
        return bonus_reset_time;
    }

    public int getBonusResetTimeRoshan() {
        return bonus_reset_time_roshan;
    }

    public int[] getDamagePerStack() {
        return damage_per_stack;
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
        if (!(object instanceof UrsaFurySwipes))
            return false;
        if (object == this)
            return true;
        UrsaFurySwipes otherObject = (UrsaFurySwipes) object;
        return otherObject.getKey().equals(getKey());
    }

}
