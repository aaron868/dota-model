package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Clarity extends Item {

    private static Clarity instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
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
    private final String localizedName;
    private final int total_mana;

    private Clarity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 250;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 38;
        itemAliases = "clarity";
        itemCost = 50;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShopTags = "consumable";
        itemStackable = 1;
        key = "item_clarity";
        model = "models/props_gameplay/clarity.vmdl";
        sideShop = 0;
        buff_duration = 45;
        localizedName = "Clarity";
        total_mana = 170;
    }

    public static Clarity instance() {
        if( instance == null ){
            instance = new Clarity();
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTotalMana() {
        return total_mana;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Clarity))
            return false;
        if (object == this)
            return true;
        Clarity otherObject = (Clarity) object;
        return otherObject.getKey().equals(getKey());
    }

}
