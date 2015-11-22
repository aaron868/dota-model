package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class StaffOfWizardry extends Item {

    private static StaffOfWizardry instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_intellect;
    private final String localizedName;

    private StaffOfWizardry() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 23;
        itemAliases = "staff of wizardry";
        itemCost = 1;
        itemQuality = "component";
        itemShopTags = "int";
        key = "item_staff_of_wizardry";
        bonus_intellect = 1;
        localizedName = "Staff Of Wizardry";
    }

    public static StaffOfWizardry instance() {
        if( instance == null ){
            instance = new StaffOfWizardry();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof StaffOfWizardry))
            return false;
        if (object == this)
            return true;
        StaffOfWizardry otherObject = (StaffOfWizardry) object;
        return otherObject.getKey().equals(getKey());
    }

}
