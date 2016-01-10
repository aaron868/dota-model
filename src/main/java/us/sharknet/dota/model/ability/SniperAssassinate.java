package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SniperAssassinate extends Ability {

    private static SniperAssassinate instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCastRangeBuffer;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] projectile_speed;
    private final int[] tooltip_range;
    private final int total_cast_time_tooltip;

    private SniperAssassinate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN"};
        abilityCastPoint = new double[]{2.0,2.0,2.0};
        abilityCastRange = new int[]{2000,2500,3000};
        abilityCastRangeBuffer = 600;
        abilityCooldown = new double[]{20.0,15.0,10.0};
        abilityDamage = new int[]{320,485,650};
        abilityManaCost = new int[]{175,275,375};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_INVULNERABLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5157;
        key = "sniper_assassinate";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Assassinate";
        ownerKey = "npc_dota_hero_sniper";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = new int[]{2500,2500,2500};
        tooltip_range = new int[]{2000,2500,3000};
        total_cast_time_tooltip = 2;
    }

    public static SniperAssassinate instance() {
        if( instance == null ){
            instance = new SniperAssassinate();
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

    public int getAbilityCastRangeBuffer() {
        return abilityCastRangeBuffer;
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

    public int[] getProjectileSpeed() {
        return projectile_speed;
    }

    public int[] getTooltipRange() {
        return tooltip_range;
    }

    public int getTotalCastTimeTooltip() {
        return total_cast_time_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SniperAssassinate))
            return false;
        if (object == this)
            return true;
        SniperAssassinate otherObject = (SniperAssassinate) object;
        return otherObject.getKey().equals(getKey());
    }

}
