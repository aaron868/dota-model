package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinBurrow extends Ability {

    private static NyxAssassinBurrow instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final boolean isGrantedByScepter;
    private final String key;
    private final int burrow_delay;
    private final int carapace_burrow_range_tooltip;
    private final int damage_reduction;
    private final double health_regen_rate;
    private final int impale_burn_range_increase_pct_tooltip;
    private final int impale_burrow_cooldown_tooltip;
    private final int impale_burrow_range_tooltip;
    private final String localizedName;
    private final int mana_burn_burrow_range_tooltip;
    private final double mana_regen_rate;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NyxAssassinBurrow() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{1,1,1,1};
        iD = 5666;
        isGrantedByScepter = true;
        key = "nyx_assassin_burrow";
        burrow_delay = 1;
        carapace_burrow_range_tooltip = 300;
        damage_reduction = 40;
        health_regen_rate = 1.5;
        impale_burn_range_increase_pct_tooltip = 75;
        impale_burrow_cooldown_tooltip = 7;
        impale_burrow_range_tooltip = 1225;
        localizedName = "Burrow";
        mana_burn_burrow_range_tooltip = 1050;
        mana_regen_rate = 1.5;
        ownerKey = "npc_dota_hero_nyx_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NyxAssassinBurrow instance() {
        if( instance == null ){
            instance = new NyxAssassinBurrow();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getID() {
        return iD;
    }

    public boolean getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
    }

    public int getBurrowDelay() {
        return burrow_delay;
    }

    public int getCarapaceBurrowRangeTooltip() {
        return carapace_burrow_range_tooltip;
    }

    public int getDamageReduction() {
        return damage_reduction;
    }

    public double getHealthRegenRate() {
        return health_regen_rate;
    }

    public int getImpaleBurnRangeIncreasePctTooltip() {
        return impale_burn_range_increase_pct_tooltip;
    }

    public int getImpaleBurrowCooldownTooltip() {
        return impale_burrow_cooldown_tooltip;
    }

    public int getImpaleBurrowRangeTooltip() {
        return impale_burrow_range_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaBurnBurrowRangeTooltip() {
        return mana_burn_burrow_range_tooltip;
    }

    public double getManaRegenRate() {
        return mana_regen_rate;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NyxAssassinBurrow))
            return false;
        if (object == this)
            return true;
        NyxAssassinBurrow otherObject = (NyxAssassinBurrow) object;
        return otherObject.getKey().equals(getKey());
    }

}
