package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixSunRay extends Ability {

    private static PhoenixSunRay instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] base_dmg;
    private final int[] base_heal;
    private final int beam_range;
    private final int forward_move_speed;
    private final int hp_cost_perc_per_second;
    private final double[] hp_perc_dmg;
    private final double[] hp_perc_heal;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double tick_interval;
    private final int tooltip_duration;
    private final int turn_rate;
    private final int turn_rate_initial;

    private PhoenixSunRay() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{1300,1300,1300,1300};
        abilityCooldown = new double[]{20,20,20,20};
        abilityDuration = new double[]{6,6,6,6};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5626;
        key = "phoenix_sun_ray";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        base_dmg = new int[]{15,20,25,30};
        base_heal = new int[]{7,10,13,16};
        beam_range = 1300;
        forward_move_speed = 25;
        hp_cost_perc_per_second = 6;
        hp_perc_dmg = new double[]{1.25,2.5,3.75,5.0};
        hp_perc_heal = new double[]{0.625,1.25,1.875,2.5};
        localizedName = "Sun Ray";
        ownerKey = "npc_dota_hero_phoenix";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 130;
        tick_interval = .2;
        tooltip_duration = 6;
        turn_rate = 25;
        turn_rate_initial = 25;
    }

    public static PhoenixSunRay instance() {
        if( instance == null ){
            instance = new PhoenixSunRay();
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

    public int[] getBaseDmg() {
        return base_dmg;
    }

    public int[] getBaseHeal() {
        return base_heal;
    }

    public int getBeamRange() {
        return beam_range;
    }

    public int getForwardMoveSpeed() {
        return forward_move_speed;
    }

    public int getHpCostPercPerSecond() {
        return hp_cost_perc_per_second;
    }

    public double[] getHpPercDmg() {
        return hp_perc_dmg;
    }

    public double[] getHpPercHeal() {
        return hp_perc_heal;
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

    public int getRadius() {
        return radius;
    }

    public double getTickInterval() {
        return tick_interval;
    }

    public int getTooltipDuration() {
        return tooltip_duration;
    }

    public int getTurnRate() {
        return turn_rate;
    }

    public int getTurnRateInitial() {
        return turn_rate_initial;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixSunRay))
            return false;
        if (object == this)
            return true;
        PhoenixSunRay otherObject = (PhoenixSunRay) object;
        return otherObject.getKey().equals(getKey());
    }

}
