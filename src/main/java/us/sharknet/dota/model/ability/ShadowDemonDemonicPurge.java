package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowDemonDemonicPurge extends Ability {

    private static ShadowDemonDemonicPurge instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int charge_restore_time;
    private final int charge_restore_time_tooltip_scepter;
    private final double[] creep_root_duration;
    private final String localizedName;
    private final int max_charges;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] slow_rate;
    private final double[] tooltip_duration;

    private ShadowDemonDemonicPurge() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{50.0,50.0,50.0};
        abilityDamage = new int[]{200,300,400};
        abilityDuration = new double[]{5.0,5.0,5.0};
        abilityManaCost = new int[]{200,200,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5425;
        key = "shadow_demon_demonic_purge";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        charge_restore_time = 40;
        charge_restore_time_tooltip_scepter = 40;
        creep_root_duration = new double[]{3.0,3.0,3.0};
        localizedName = "Demonic Purge";
        max_charges = 3;
        ownerKey = "npc_dota_hero_shadow_demon";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_rate = new int[]{5,3,2};
        tooltip_duration = new double[]{5.0,5.0,5.0};
    }

    public static ShadowDemonDemonicPurge instance() {
        if( instance == null ){
            instance = new ShadowDemonDemonicPurge();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public int getChargeRestoreTimeTooltipScepter() {
        return charge_restore_time_tooltip_scepter;
    }

    public double[] getCreepRootDuration() {
        return creep_root_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return max_charges;
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

    public int[] getSlowRate() {
        return slow_rate;
    }

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowDemonDemonicPurge))
            return false;
        if (object == this)
            return true;
        ShadowDemonDemonicPurge otherObject = (ShadowDemonDemonicPurge) object;
        return otherObject.getKey().equals(getKey());
    }

}
