package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TangoSingle extends Item {

    private static TangoSingle instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final String effect;
    private final int iD;
    private final int itemCost;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final int itemPurchasable;
    private final String itemQuality;
    private final int itemSellable;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStackable;
    private final String key;
    private final String model;
    private final int buff_duration;
    private final int cast_range_ward;
    private final String localizedName;
    private final int total_heal;
    private final int total_heal_ward_tooltip;

    private TangoSingle() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 165;
        abilityCooldown = 6;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        effect = "particles/generic_gameplay/dropped_tango.vpcf";
        iD = 241;
        itemCost = 30;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemPurchasable = 0;
        itemQuality = "consumable";
        itemSellable = 0;
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = "consumable";
        itemStackable = 0;
        key = "item_tango_single";
        model = "models/props_gameplay/tango.vmdl";
        buff_duration = 16;
        cast_range_ward = 450;
        localizedName = "Shared Tango";
        total_heal = 115;
        total_heal_ward_tooltip = 230;
    }

    public static TangoSingle instance() {
        if( instance == null ){
            instance = new TangoSingle();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public String getEffect() {
        return effect;
    }

    public int getID() {
        return iD;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
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

    public int getBuffDuration() {
        return buff_duration;
    }

    public int getCastRangeWard() {
        return cast_range_ward;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTotalHeal() {
        return total_heal;
    }

    public int getTotalHealWardTooltip() {
        return total_heal_ward_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TangoSingle))
            return false;
        if (object == this)
            return true;
        TangoSingle otherObject = (TangoSingle) object;
        return otherObject.getKey().equals(getKey());
    }

}
