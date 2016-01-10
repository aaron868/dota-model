package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterStormWindWalk extends Ability {

    private static BrewmasterStormWindWalk instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] bonus_damage;
    private final int[] bonus_movement_speeed;
    private final double[] duration;
    private final double[] fade_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BrewmasterStormWindWalk() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{5,5,5,5};
        abilityManaCost = new int[]{75,75,75,75};
        iD = 5410;
        key = "brewmaster_storm_wind_walk";
        bonus_damage = new int[]{100,100,100,100};
        bonus_movement_speeed = new int[]{50,50,50,50};
        duration = new double[]{20.0,20.0,20.0,20.0};
        fade_time = new double[]{0.6,0.6,0.6,0.6};
        localizedName = "Wind Walk";
        ownerKey = "npc_dota_brewmaster_storm";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static BrewmasterStormWindWalk instance() {
        if( instance == null ){
            instance = new BrewmasterStormWindWalk();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getBonusMovementSpeeed() {
        return bonus_movement_speeed;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getFadeTime() {
        return fade_time;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterStormWindWalk))
            return false;
        if (object == this)
            return true;
        BrewmasterStormWindWalk otherObject = (BrewmasterStormWindWalk) object;
        return otherObject.getKey().equals(getKey());
    }

}
