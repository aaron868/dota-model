package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GiantWolfCriticalStrike extends Ability {

    private static GiantWolfCriticalStrike instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int crit_chance;
    private final int crit_mult;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private GiantWolfCriticalStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5307;
        key = "giant_wolf_critical_strike";
        crit_chance = 20;
        crit_mult = 200;
        localizedName = "Critical Strike";
        ownerKey = "npc_dota_neutral_giant_wolf";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static GiantWolfCriticalStrike instance() {
        if( instance == null ){
            instance = new GiantWolfCriticalStrike();
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

    public int getCritChance() {
        return crit_chance;
    }

    public int getCritMult() {
        return crit_mult;
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
        if (!(object instanceof GiantWolfCriticalStrike))
            return false;
        if (object == this)
            return true;
        GiantWolfCriticalStrike otherObject = (GiantWolfCriticalStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
