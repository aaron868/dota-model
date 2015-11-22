package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChaosKnightChaosStrike extends Ability {

    private static ChaosKnightChaosStrike instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int armor_duration;
    private final int armor_reduction;
    private final int armor_reduction_tooltip;
    private final int[] crit_chance;
    private final int[] crit_damage;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ChaosKnightChaosStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5428;
        key = "chaos_knight_chaos_strike";
        armor_duration = 8;
        armor_reduction = -5;
        armor_reduction_tooltip = 5;
        crit_chance = new int[]{10,10,10,10};
        crit_damage = new int[]{125,175,225,275};
        localizedName = "Chaos Strike";
        owningHeroShortKey = "chaos_knight";
    }

    public static ChaosKnightChaosStrike instance() {
        if( instance == null ){
            instance = new ChaosKnightChaosStrike();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getArmorDuration() {
        return armor_duration;
    }

    public int getArmorReduction() {
        return armor_reduction;
    }

    public int getArmorReductionTooltip() {
        return armor_reduction_tooltip;
    }

    public int[] getCritChance() {
        return crit_chance;
    }

    public int[] getCritDamage() {
        return crit_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChaosKnightChaosStrike))
            return false;
        if (object == this)
            return true;
        ChaosKnightChaosStrike otherObject = (ChaosKnightChaosStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
