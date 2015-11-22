package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Bottle extends Item {

    private static Bottle instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final int itemDisplayCharges;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStackable;
    private final String key;
    private final String model;
    private final int health_restore;
    private final String localizedName;
    private final int mana_restore;
    private final int movement_speed_percent_bonus;
    private final int restore_time;

    private Bottle() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastPoint = 0;
        abilityCastRange = 35;
        abilityCooldown = .5;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 41;
        itemAliases = "bottle";
        itemCost = 7;
        itemDisplayCharges = 1;
        itemInitialCharges = 3;
        itemPermanent = 1;
        itemQuality = "consumable";
        itemShareability = "ITEM_PARTIALLY_SHAREABLE";
        itemShopTags = "consumable";
        itemStackable = 0;
        key = "item_bottle";
        model = "models/props_gameplay/bottle_blue.vmdl";
        health_restore = 11;
        localizedName = "Bottle";
        mana_restore = 7;
        movement_speed_percent_bonus = -3;
        restore_time = 3;
    }

    public static Bottle instance() {
        if( instance == null ){
            instance = new Bottle();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShareability() {
        return itemShareability;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public int getItemStackable() {
        return itemStackable;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getHealthRestore() {
        return health_restore;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRestore() {
        return mana_restore;
    }

    public int getMovementSpeedPercentBonus() {
        return movement_speed_percent_bonus;
    }

    public int getRestoreTime() {
        return restore_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bottle))
            return false;
        if (object == this)
            return true;
        Bottle otherObject = (Bottle) object;
        return otherObject.getKey().equals(getKey());
    }

}
