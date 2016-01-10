package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockShadowWord extends Ability {

    private static WarlockShadowWord instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int tick_interval;

    private WarlockShadowWord() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = new double[]{16,16,16,16};
        abilityDamage = new int[]{15,25,35,45};
        abilityManaCost = new int[]{90,110,130,150};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5163;
        key = "warlock_shadow_word";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 12;
        localizedName = "Shadow Word";
        ownerKey = "npc_dota_hero_warlock";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tick_interval = 1;
    }

    public static WarlockShadowWord instance() {
        if( instance == null ){
            instance = new WarlockShadowWord();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getTickInterval() {
        return tick_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WarlockShadowWord))
            return false;
        if (object == this)
            return true;
        WarlockShadowWord otherObject = (WarlockShadowWord) object;
        return otherObject.getKey().equals(getKey());
    }

}
