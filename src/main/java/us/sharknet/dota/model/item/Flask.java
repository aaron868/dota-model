package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Flask extends Item {

    private static Flask instance;

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
    private final int buff_duration;
    private final String localizedName;
    private final int total_health;

    private Flask() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 25;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 39;
        itemAliases = "healing salve";
        itemCost = 11;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShopTags = "consumable";
        itemStackable = 1;
        key = "item_flask";
        model = "models/props_gameplay/salve.vmdl";
        buff_duration = 8;
        localizedName = "Healing Salve";
        total_health = 4;
    }

    public static Flask instance() {
        if( instance == null ){
            instance = new Flask();
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

    public int getBuffDuration() {
        return buff_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTotalHealth() {
        return total_health;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Flask))
            return false;
        if (object == this)
            return true;
        Flask otherObject = (Flask) object;
        return otherObject.getKey().equals(getKey());
    }

}
