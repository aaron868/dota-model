package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NevermoreRequiem extends Ability {

    private static NevermoreRequiem instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double cast_time_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int requiem_damage_scepter_pct;
    private final int requiem_heal_scepter_pct;
    private final int[] requiem_line_speed;
    private final int[] requiem_line_width_end;
    private final int[] requiem_line_width_start;
    private final int[] requiem_radius;
    private final int requiem_reduction_damage;
    private final int requiem_reduction_ms;
    private final int[] requiem_reduction_radius;
    private final int requiem_reduction_tooltip;
    private final int requiem_slow_duration;
    private final int[] requiem_soul_conversion;
    private final double soul_death_release;

    private NevermoreRequiem() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN"};
        abilityCastPoint = new double[]{1.67,1.67,1.67};
        abilityCooldown = new double[]{120.0,110.0,100.0};
        abilityDamage = new int[]{80,120,160};
        abilityDuration = new double[]{5.0,5.0,5.0};
        abilityManaCost = new int[]{150,175,200};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5064;
        key = "nevermore_requiem";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cast_time_tooltip = 1.67;
        localizedName = "Requiem of Souls";
        ownerKey = "npc_dota_hero_nevermore";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        requiem_damage_scepter_pct = 4;
        requiem_heal_scepter_pct = 1;
        requiem_line_speed = new int[]{700,700,700};
        requiem_line_width_end = new int[]{400,425,450};
        requiem_line_width_start = new int[]{75,100,125};
        requiem_radius = new int[]{975,1000,1025};
        requiem_reduction_damage = -50;
        requiem_reduction_ms = -25;
        requiem_reduction_radius = new int[]{700,700,700};
        requiem_reduction_tooltip = -50;
        requiem_slow_duration = 5;
        requiem_soul_conversion = new int[]{2,2,2};
        soul_death_release = .5;
    }

    public static NevermoreRequiem instance() {
        if( instance == null ){
            instance = new NevermoreRequiem();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double getCastTimeTooltip() {
        return cast_time_tooltip;
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

    public int getRequiemDamageScepterPct() {
        return requiem_damage_scepter_pct;
    }

    public int getRequiemHealScepterPct() {
        return requiem_heal_scepter_pct;
    }

    public int[] getRequiemLineSpeed() {
        return requiem_line_speed;
    }

    public int[] getRequiemLineWidthEnd() {
        return requiem_line_width_end;
    }

    public int[] getRequiemLineWidthStart() {
        return requiem_line_width_start;
    }

    public int[] getRequiemRadius() {
        return requiem_radius;
    }

    public int getRequiemReductionDamage() {
        return requiem_reduction_damage;
    }

    public int getRequiemReductionMs() {
        return requiem_reduction_ms;
    }

    public int[] getRequiemReductionRadius() {
        return requiem_reduction_radius;
    }

    public int getRequiemReductionTooltip() {
        return requiem_reduction_tooltip;
    }

    public int getRequiemSlowDuration() {
        return requiem_slow_duration;
    }

    public int[] getRequiemSoulConversion() {
        return requiem_soul_conversion;
    }

    public double getSoulDeathRelease() {
        return soul_death_release;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NevermoreRequiem))
            return false;
        if (object == this)
            return true;
        NevermoreRequiem otherObject = (NevermoreRequiem) object;
        return otherObject.getKey().equals(getKey());
    }

}
