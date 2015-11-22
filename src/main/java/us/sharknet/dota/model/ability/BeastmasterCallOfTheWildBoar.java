package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterCallOfTheWildBoar extends Ability {

    private static BeastmasterCallOfTheWildBoar instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] boar_attackslow_tooltip;
    private final int[] boar_damage_tooltip;
    private final int[] boar_duration;
    private final int[] boar_hp_tooltip;
    private final int[] boar_moveslow_tooltip;
    private final int[] hawk_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int poison_duration_tooltip;

    private BeastmasterCallOfTheWildBoar() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .3;
        abilityCooldown = new double[]{40.0,40.0,40.0,40.0};
        abilityManaCost = 15;
        iD = 5580;
        key = "beastmaster_call_of_the_wild_boar";
        boar_attackslow_tooltip = new int[]{10,20,30,40};
        boar_damage_tooltip = new int[]{15,30,45,60};
        boar_duration = new int[]{60,60,60,60};
        boar_hp_tooltip = new int[]{200,300,400,500};
        boar_moveslow_tooltip = new int[]{10,20,30,40};
        hawk_duration = new int[]{60,60,60,60};
        localizedName = "Call Of The Wild Boar";
        owningHeroShortKey = "beastmaster";
        poison_duration_tooltip = 3;
    }

    public static BeastmasterCallOfTheWildBoar instance() {
        if( instance == null ){
            instance = new BeastmasterCallOfTheWildBoar();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBoarAttackslowTooltip() {
        return boar_attackslow_tooltip;
    }

    public int[] getBoarDamageTooltip() {
        return boar_damage_tooltip;
    }

    public int[] getBoarDuration() {
        return boar_duration;
    }

    public int[] getBoarHpTooltip() {
        return boar_hp_tooltip;
    }

    public int[] getBoarMoveslowTooltip() {
        return boar_moveslow_tooltip;
    }

    public int[] getHawkDuration() {
        return hawk_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPoisonDurationTooltip() {
        return poison_duration_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterCallOfTheWildBoar))
            return false;
        if (object == this)
            return true;
        BeastmasterCallOfTheWildBoar otherObject = (BeastmasterCallOfTheWildBoar) object;
        return otherObject.getKey().equals(getKey());
    }

}
