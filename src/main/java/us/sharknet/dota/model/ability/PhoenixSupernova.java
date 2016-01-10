package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixSupernova extends Ability {

    private static PhoenixSupernova instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
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
    private final int[] aura_radius;
    private final int cast_range_tooltip_scepter;
    private final int[] damage_per_sec;
    private final String localizedName;
    private final int[] max_hero_attacks;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;
    private final int tooltip_duration;

    private PhoenixSupernova() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = new double[]{110.0,110.0,110.0};
        abilityDuration = new double[]{6,6,6,6};
        abilityManaCost = new int[]{200,200,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5630;
        key = "phoenix_supernova";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        aura_radius = new int[]{1000,1000,1000};
        cast_range_tooltip_scepter = 500;
        damage_per_sec = new int[]{60,90,120};
        localizedName = "Supernova";
        max_hero_attacks = new int[]{5,8,11};
        ownerKey = "npc_dota_hero_phoenix";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{1.5,2.0,2.5};
        tooltip_duration = 6;
    }

    public static PhoenixSupernova instance() {
        if( instance == null ){
            instance = new PhoenixSupernova();
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

    public int[] getAuraRadius() {
        return aura_radius;
    }

    public int getCastRangeTooltipScepter() {
        return cast_range_tooltip_scepter;
    }

    public int[] getDamagePerSec() {
        return damage_per_sec;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxHeroAttacks() {
        return max_hero_attacks;
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

    public double[] getStunDuration() {
        return stun_duration;
    }

    public int getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixSupernova))
            return false;
        if (object == this)
            return true;
        PhoenixSupernova otherObject = (PhoenixSupernova) object;
        return otherObject.getKey().equals(getKey());
    }

}
