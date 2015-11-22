package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class OrbOfVenom extends Item {

    private static OrbOfVenom instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final String localizedName;
    private final int poison_damage;
    private final int poison_duration;
    private final int poison_movement_speed_melee;
    private final int poison_movement_speed_range;

    private OrbOfVenom() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 181;
        itemAliases = "orb of venom";
        itemCost = 275;
        itemQuality = "component";
        itemShopTags = "hard_to_tag";
        key = "item_orb_of_venom";
        sideShop = 1;
        localizedName = "Orb Of Venom";
        poison_damage = 3;
        poison_duration = 4;
        poison_movement_speed_melee = -12;
        poison_movement_speed_range = -4;
    }

    public static OrbOfVenom instance() {
        if( instance == null ){
            instance = new OrbOfVenom();
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

    public int getSideShop() {
        return sideShop;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getPoisonDamage() {
        return poison_damage;
    }

    public int getPoisonDuration() {
        return poison_duration;
    }

    public int getPoisonMovementSpeedMelee() {
        return poison_movement_speed_melee;
    }

    public int getPoisonMovementSpeedRange() {
        return poison_movement_speed_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OrbOfVenom))
            return false;
        if (object == this)
            return true;
        OrbOfVenom otherObject = (OrbOfVenom) object;
        return otherObject.getKey().equals(getKey());
    }

}
