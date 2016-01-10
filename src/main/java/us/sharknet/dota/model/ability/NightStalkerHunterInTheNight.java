package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NightStalkerHunterInTheNight extends Ability {

    private static NightStalkerHunterInTheNight instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed_night;
    private final int[] bonus_movement_speed_pct_night;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NightStalkerHunterInTheNight() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5277;
        key = "night_stalker_hunter_in_the_night";
        bonus_attack_speed_night = new int[]{45,60,75,90};
        bonus_movement_speed_pct_night = new int[]{20,25,30,35};
        localizedName = "Hunter In The Night";
        ownerKey = "npc_dota_hero_night_stalker";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static NightStalkerHunterInTheNight instance() {
        if( instance == null ){
            instance = new NightStalkerHunterInTheNight();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusAttackSpeedNight() {
        return bonus_attack_speed_night;
    }

    public int[] getBonusMovementSpeedPctNight() {
        return bonus_movement_speed_pct_night;
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
        if (!(object instanceof NightStalkerHunterInTheNight))
            return false;
        if (object == this)
            return true;
        NightStalkerHunterInTheNight otherObject = (NightStalkerHunterInTheNight) object;
        return otherObject.getKey().equals(getKey());
    }

}
