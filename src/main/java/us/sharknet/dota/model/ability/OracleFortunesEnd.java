package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OracleFortunesEnd extends Ability {

    private static OracleFortunesEnd instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bolt_speed;
    private final int[] damage;
    private final String localizedName;
    private final double max_channel_time_tooltip;
    private final double maximum_purge_duration;
    private final double minimum_purge_duration;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private OracleFortunesEnd() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_DONT_CANCEL_CHANNEL"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{850,850,850,850};
        abilityChannelTime = new double[]{2.5,2.5,2.5,2.5};
        abilityCooldown = new double[]{15,12,9,6};
        abilityManaCost = new int[]{110,110,110,110};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_INVULNERABLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5637;
        key = "oracle_fortunes_end";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bolt_speed = 1200;
        damage = new int[]{90,120,150,180};
        localizedName = "Fortunes End";
        max_channel_time_tooltip = 2.5;
        maximum_purge_duration = 2.5;
        minimum_purge_duration = .5;
        ownerKey = "npc_dota_hero_oracle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 300;
    }

    public static OracleFortunesEnd instance() {
        if( instance == null ){
            instance = new OracleFortunesEnd();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getBoltSpeed() {
        return bolt_speed;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getMaxChannelTimeTooltip() {
        return max_channel_time_tooltip;
    }

    public double getMaximumPurgeDuration() {
        return maximum_purge_duration;
    }

    public double getMinimumPurgeDuration() {
        return minimum_purge_duration;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OracleFortunesEnd))
            return false;
        if (object == this)
            return true;
        OracleFortunesEnd otherObject = (OracleFortunesEnd) object;
        return otherObject.getKey().equals(getKey());
    }

}
