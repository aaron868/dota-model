package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Aegis extends Item {

    private static Aegis instance;

    private final String abilityBehavior;
    private final int fightRecapLevel;
    private final int iD;
    private final int itemContributesToNetWorthWhenDropped;
    private final int itemCost;
    private final int itemDroppable;
    private final int itemKillable;
    private final int itemPurchasable;
    private final String itemQuality;
    private final int itemSellable;
    private final String key;
    private final String model;
    private final int disappear_time;
    private final int disappear_time_minutes_tooltip;
    private final String localizedName;
    private final int reincarnate_time;

    private Aegis() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        fightRecapLevel = 2;
        iD = 117;
        itemContributesToNetWorthWhenDropped = 0;
        itemCost = 0;
        itemDroppable = 0;
        itemKillable = 1;
        itemPurchasable = 0;
        itemQuality = "artifact";
        itemSellable = 0;
        key = "item_aegis";
        model = "models/props_gameplay/aegis.vmdl";
        disappear_time = 3;
        disappear_time_minutes_tooltip = 5;
        localizedName = "Aegis";
        reincarnate_time = 5;
    }

    public static Aegis instance() {
        if( instance == null ){
            instance = new Aegis();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public int getItemContributesToNetWorthWhenDropped() {
        return itemContributesToNetWorthWhenDropped;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemDroppable() {
        return itemDroppable;
    }

    public int getItemKillable() {
        return itemKillable;
    }

    public int getItemPurchasable() {
        return itemPurchasable;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public int getItemSellable() {
        return itemSellable;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getDisappearTime() {
        return disappear_time;
    }

    public int getDisappearTimeMinutesTooltip() {
        return disappear_time_minutes_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getReincarnateTime() {
        return reincarnate_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Aegis))
            return false;
        if (object == this)
            return true;
        Aegis otherObject = (Aegis) object;
        return otherObject.getKey().equals(getKey());
    }

}
