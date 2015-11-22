package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DeathProphetWitchcraft extends Ability {

    private static DeathProphetWitchcraft instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_movement_speed;
    private final double[] carrion_swarm_cooldown_adjust;
    private final int[] carrion_swarm_mana_cost_adjust;
    private final int[] exorcism_1_extra_spirits;
    private final int[] exorcism_2_extra_spirits;
    private final int[] exorcism_3_extra_spirits;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] silence_cooldown_adjust;
    private final int[] silence_mana_cost_adjust;

    private DeathProphetWitchcraft() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 592;
        key = "death_prophet_witchcraft";
        bonus_movement_speed = new int[]{5,10,15,20};
        carrion_swarm_cooldown_adjust = new double[]{1.0,2.0,3.0,4.0};
        carrion_swarm_mana_cost_adjust = new int[]{-10,-15,-20,-25};
        exorcism_1_extra_spirits = new int[]{3,4,5,6};
        exorcism_2_extra_spirits = new int[]{3,4,5,6};
        exorcism_3_extra_spirits = new int[]{3,4,5,6};
        localizedName = "Witchcraft";
        owningHeroShortKey = "death_prophet";
        silence_cooldown_adjust = new double[]{1.0,2.0,3.0,4.0};
        silence_mana_cost_adjust = new int[]{-10,-15,-20,-25};
    }

    public static DeathProphetWitchcraft instance() {
        if( instance == null ){
            instance = new DeathProphetWitchcraft();
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

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public double[] getCarrionSwarmCooldownAdjust() {
        return carrion_swarm_cooldown_adjust;
    }

    public int[] getCarrionSwarmManaCostAdjust() {
        return carrion_swarm_mana_cost_adjust;
    }

    public int[] getExorcism1ExtraSpirits() {
        return exorcism_1_extra_spirits;
    }

    public int[] getExorcism2ExtraSpirits() {
        return exorcism_2_extra_spirits;
    }

    public int[] getExorcism3ExtraSpirits() {
        return exorcism_3_extra_spirits;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getSilenceCooldownAdjust() {
        return silence_cooldown_adjust;
    }

    public int[] getSilenceManaCostAdjust() {
        return silence_mana_cost_adjust;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DeathProphetWitchcraft))
            return false;
        if (object == this)
            return true;
        DeathProphetWitchcraft otherObject = (DeathProphetWitchcraft) object;
        return otherObject.getKey().equals(getKey());
    }

}
