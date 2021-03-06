package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LionManaDrain extends Ability {

    private static LionManaDrain instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int break_distance;
    private final int duration;
    private final String localizedName;
    private final int[] mana_per_second;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double tick_interval;

    private LionManaDrain() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{850,850,850,850};
        abilityChannelTime = new double[]{5.1,5.1,5.1,5.1};
        abilityCooldown = new double[]{16,12,8,4};
        abilityManaCost = new int[]{10,10,10,10};
        abilityModifierSupportValue = 5;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_FOW_VISIBLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5046;
        key = "lion_mana_drain";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        break_distance = 1200;
        duration = 5;
        localizedName = "Mana Drain";
        mana_per_second = new int[]{20,40,60,120};
        ownerKey = "npc_dota_hero_lion";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tick_interval = .1;
    }

    public static LionManaDrain instance() {
        if( instance == null ){
            instance = new LionManaDrain();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getBreakDistance() {
        return break_distance;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaPerSecond() {
        return mana_per_second;
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

    public double getTickInterval() {
        return tick_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LionManaDrain))
            return false;
        if (object == this)
            return true;
        LionManaDrain otherObject = (LionManaDrain) object;
        return otherObject.getKey().equals(getKey());
    }

}
