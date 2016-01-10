package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskWalrusPunch extends Ability {

    private static TuskWalrusPunch instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int air_time;
    private final double[] cooldown_scepter;
    private final int crit_multiplier;
    private final String localizedName;
    private final int move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int push_length;
    private final double[] slow_duration;

    private TuskWalrusPunch() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{128,128,128,128};
        abilityCooldown = new double[]{36,24,12};
        abilityManaCost = new int[]{50,75,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5568;
        key = "tusk_walrus_punch";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        air_time = 1;
        cooldown_scepter = new double[]{20.0,16.0,12.0};
        crit_multiplier = 350;
        localizedName = "Walrus Punch";
        move_slow = 40;
        ownerKey = "npc_dota_hero_tusk";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        push_length = 1000;
        slow_duration = new double[]{2.0,3.0,4.0};
    }

    public static TuskWalrusPunch instance() {
        if( instance == null ){
            instance = new TuskWalrusPunch();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int getAirTime() {
        return air_time;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSlow() {
        return move_slow;
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

    public int getPushLength() {
        return push_length;
    }

    public double[] getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TuskWalrusPunch))
            return false;
        if (object == this)
            return true;
        TuskWalrusPunch otherObject = (TuskWalrusPunch) object;
        return otherObject.getKey().equals(getKey());
    }

}
