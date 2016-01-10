package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class HuskarLifeBreak extends Ability {

    private static HuskarLifeBreak instance;

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
    private final int charge_speed;
    private final int cooldown_scepter;
    private final double health_cost_percent;
    private final double health_damage;
    private final double health_damage_scepter;
    private final String localizedName;
    private final int[] movespeed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] slow_durtion_tooltip;
    private final int tooltip_health_cost_percent;
    private final int tooltip_health_damage;
    private final int tooltip_health_damage_scepter;

    private HuskarLifeBreak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{550,550,550,550};
        abilityCooldown = new double[]{12,12,12,12};
        abilityDuration = new double[]{4,5,6};
        abilityManaCost = new int[]{0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5274;
        key = "huskar_life_break";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        charge_speed = 1000;
        cooldown_scepter = 4;
        health_cost_percent = .35;
        health_damage = .35;
        health_damage_scepter = .65;
        localizedName = "Life Break";
        movespeed = new int[]{-40,-50,-60};
        ownerKey = "npc_dota_hero_huskar";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_durtion_tooltip = new double[]{4.0,5.0,6.0};
        tooltip_health_cost_percent = 35;
        tooltip_health_damage = 35;
        tooltip_health_damage_scepter = 65;
    }

    public static HuskarLifeBreak instance() {
        if( instance == null ){
            instance = new HuskarLifeBreak();
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

    public int getChargeSpeed() {
        return charge_speed;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public double getHealthCostPercent() {
        return health_cost_percent;
    }

    public double getHealthDamage() {
        return health_damage;
    }

    public double getHealthDamageScepter() {
        return health_damage_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeed() {
        return movespeed;
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

    public double[] getSlowDurtionTooltip() {
        return slow_durtion_tooltip;
    }

    public int getTooltipHealthCostPercent() {
        return tooltip_health_cost_percent;
    }

    public int getTooltipHealthDamage() {
        return tooltip_health_damage;
    }

    public int getTooltipHealthDamageScepter() {
        return tooltip_health_damage_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HuskarLifeBreak))
            return false;
        if (object == this)
            return true;
        HuskarLifeBreak otherObject = (HuskarLifeBreak) object;
        return otherObject.getKey().equals(getKey());
    }

}
