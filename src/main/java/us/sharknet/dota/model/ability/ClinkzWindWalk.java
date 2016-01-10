package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ClinkzWindWalk extends Ability {

    private static ClinkzWindWalk instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final double[] fade_time;
    private final String localizedName;
    private final int[] move_speed_bonus_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ClinkzWindWalk() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{20,19,18,17};
        abilityManaCost = new int[]{75,75,75,75};
        iD = 5261;
        key = "clinkz_wind_walk";
        duration = new double[]{20.0,25.0,30.0,35.0};
        fade_time = new double[]{0.6,0.6,0.6,0.6};
        localizedName = "Wind Walk";
        move_speed_bonus_pct = new int[]{11,22,33,44};
        ownerKey = "npc_dota_hero_clinkz";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ClinkzWindWalk instance() {
        if( instance == null ){
            instance = new ClinkzWindWalk();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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

    public int[] getMoveSpeedBonusPct() {
        return move_speed_bonus_pct;
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
        if (!(object instanceof ClinkzWindWalk))
            return false;
        if (object == this)
            return true;
        ClinkzWindWalk otherObject = (ClinkzWindWalk) object;
        return otherObject.getKey().equals(getKey());
    }

}
