package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Tango extends Item {

    private static Tango instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final String effect;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShopTags;
    private final int itemStackable;
    private final String key;
    private final String model;
    private final int sideShop;
    private final int buff_duration;
    private final int cast_range_ward;
    private final String localizedName;
    private final int total_heal;
    private final int total_heal_ward_tooltip;

    private Tango() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 165;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        effect = "particles/generic_gameplay/dropped_tango.vpcf";
        iD = 44;
        itemAliases = "tango";
        itemCost = 125;
        itemInitialCharges = 4;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShopTags = "consumable";
        itemStackable = 1;
        key = "item_tango";
        model = "models/props_gameplay/tango.vmdl";
        sideShop = 0;
        buff_duration = 16;
        cast_range_ward = 450;
        localizedName = "Tango";
        total_heal = 115;
        total_heal_ward_tooltip = 230;
    }

    public static Tango instance() {
        if( instance == null ){
            instance = new Tango();
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

    public String getItemAliases() {
        return itemAliases;
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

    public String getItemQuality() {
        return itemQuality;
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

    public int getSideShop() {
        return sideShop;
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
        if (!(object instanceof Tango))
            return false;
        if (object == this)
            return true;
        Tango otherObject = (Tango) object;
        return otherObject.getKey().equals(getKey());
    }

}
