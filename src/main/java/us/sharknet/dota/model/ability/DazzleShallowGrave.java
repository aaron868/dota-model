package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DazzleShallowGrave extends Ability {

    private static DazzleShallowGrave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] range_tooltip;

    private DazzleShallowGrave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{550,700,850,1000};
        abilityCooldown = new double[]{60,45,30,15};
        abilityDuration = new double[]{5,5,5,5};
        abilityManaCost = new int[]{150,150,150,150};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5234;
        key = "dazzle_shallow_grave";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        duration_tooltip = new double[]{5.0,5.0,5.0,5.0};
        localizedName = "Shallow Grave";
        ownerKey = "npc_dota_hero_dazzle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        range_tooltip = new int[]{550,700,850,1000};
    }

    public static DazzleShallowGrave instance() {
        if( instance == null ){
            instance = new DazzleShallowGrave();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public double[] getDurationTooltip() {
        return duration_tooltip;
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

    public int[] getRangeTooltip() {
        return range_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DazzleShallowGrave))
            return false;
        if (object == this)
            return true;
        DazzleShallowGrave otherObject = (DazzleShallowGrave) object;
        return otherObject.getKey().equals(getKey());
    }

}
