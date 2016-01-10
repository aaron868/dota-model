package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlackDragonDragonhideAura extends Ability {

    private static BlackDragonDragonhideAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_armor;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private BlackDragonDragonhideAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5681;
        key = "black_dragon_dragonhide_aura";
        bonus_armor = 3;
        localizedName = "Dragonhide Aura";
        ownerKey = "npc_dota_neutral_black_dragon";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static BlackDragonDragonhideAura instance() {
        if( instance == null ){
            instance = new BlackDragonDragonhideAura();
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

    public int getBonusArmor() {
        return bonus_armor;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlackDragonDragonhideAura))
            return false;
        if (object == this)
            return true;
        BlackDragonDragonhideAura otherObject = (BlackDragonDragonhideAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
