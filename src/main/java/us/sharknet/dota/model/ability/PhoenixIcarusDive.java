package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixIcarusDive extends Ability {

    private static PhoenixIcarusDive instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int burn_duration;
    private final int burn_tick_interval;
    private final int[] damage_per_second;
    private final int dash_length;
    private final int dash_width;
    private final int hit_radius;
    private final int hp_cost_perc;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int slow_movement_speed_pct;

    private PhoenixIcarusDive() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCooldown = new double[]{36,36,36,36};
        abilityDuration = new double[]{2,2,2,2};
        abilityManaCost = new int[]{0,0,0,0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5623;
        key = "phoenix_icarus_dive";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_duration = 4;
        burn_tick_interval = 1;
        damage_per_second = new int[]{10,30,50,70};
        dash_length = 1400;
        dash_width = 500;
        hit_radius = 200;
        hp_cost_perc = 15;
        localizedName = "Icarus Dive";
        ownerKey = "npc_dota_hero_phoenix";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_movement_speed_pct = -25;
    }

    public static PhoenixIcarusDive instance() {
        if( instance == null ){
            instance = new PhoenixIcarusDive();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBurnDuration() {
        return burn_duration;
    }

    public int getBurnTickInterval() {
        return burn_tick_interval;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public int getDashLength() {
        return dash_length;
    }

    public int getDashWidth() {
        return dash_width;
    }

    public int getHitRadius() {
        return hit_radius;
    }

    public int getHpCostPerc() {
        return hp_cost_perc;
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

    public int getSlowMovementSpeedPct() {
        return slow_movement_speed_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixIcarusDive))
            return false;
        if (object == this)
            return true;
        PhoenixIcarusDive otherObject = (PhoenixIcarusDive) object;
        return otherObject.getKey().equals(getKey());
    }

}
