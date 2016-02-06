package us.sharknet.dota.model;

/**
 * The parent class for all Dota items.
 */
public abstract class Item {

    public static final int UNLIMITED = 9999;

    public enum Vendor {SIDE_SHOP, FOUNTAIN_SHOP, SECRET_SHOP, ROSHAN_DEATH}

    public enum Shareablilty {NOT_SHAREABLE, PARTIALLY_SHAREABLE, FULLY_SHAREABLE}


    public Item() {
    }

    /**
     * @return The English, human readable name of the ability.
     */
    public abstract String getLocalizedName();

    /**
     * @return The string key used by Valve for this ability in the VPK files.
     */
    public abstract String getKey();

    /**
     * @return The gold cost to purchase the item.
     */
    public abstract int getCost();

    /**
     * @return True if this item is a recipe.
     */
    public abstract boolean isRecipe();

    /**
     * @return True if this item can be consumed. When you use a consumable item it is gone. It is true for tangos, smokes, moon shard, etc. It does not include
     * wards and couriers which are counted as "placeables". Aghanim scepters given by Alchemist are also excluded. A bottle is counted as chargeable item
     * because it can be refilled and it does go away when used like a Clarity.
     */
    public abstract boolean isConsumable();

    /**
     * @return True if this is a dummy item and not a real one. Right now this applies to "ward dispensers" only.
     */
    public abstract boolean isPlaceholder();

    /**
     * @return True if this item can be put on the map as as a new entity. It is true for wards, the courier, and iron branches
     * since they can now be planted to grow happy trees.
     */
    public abstract boolean isPlaceable();

    /**
     * @return The list of locations that sell (or give in the case of Roshan) this item. Will never be empty or null;
     */
    public abstract Vendor[] getVendorLocations();

    /**
     * @return The degree to which this item can be shared. A fully shareable item can be used and sold. A partially shareable item can be
     * used but not upgraded or sold. An item that is not shareable cannot be given to another player.
     */
    public abstract Shareablilty getShareability();

    /**
     * @return The items needed to build this item. Returns an array of item key strings. Will return an empty array for
     * items that do not have components.
     */
    public abstract String[] getComponents();

    /**
     * @return The items that this item is a component of. Returns an array of item key strings. Will return an empty array for
     * items that are not components of other items.
     */
    public abstract String[] getPartOf();

    /**
     * @return The number of individual items you receive when you purchase the item. Currently only tangos and sentry wards give
     * you more than one item when purchased.
     */
    public abstract int getQuantity();

    /**
     * @return True if the item can contain charges. It may have a fixed number of charges like Drums of Endurance and Diffusal Blade, or it
     * may gain charges during the course of the game like an Urn of Shadows or a Bottle.
     */
    public abstract boolean isChargeable();

    /**
     * @return This property only applies to item for which isChargeable() is true. It returns the number of charges the item starts with when
     * you buy it. Normally if the initial charges and max charges return the same value then this item has a fixed number of charges. Bottle is the exception.
     * It starts with 3 (if you buy it at the fountain, 1 if you buy it at a side shop) but can be re-filled to a maximum of three.
     */
    public abstract int getInitialCharges();

    /**
     * @return This property only applies to item for which isChargeable() is true. It returns the maximum number of charges an item can hold. This will return 9999
     * for items that can hold a (practically) unlimited number of charges.
     */
    public abstract int getMaxCharges();

    /**
     * @return This property only applies to item for which isPlaceable() is true. It returns the time a placeable object last on the map in seconds. This will return 9999
     * for items that do not expire. It return 0 for non-placeable items. The duration returned for iron branches is the duration of the happy tree.
     */
    public abstract int getPlaceableDuration();

    /**
     * @return The amount of gold you would relieve for selling and item (if it can be sold) more than 10 seconds after purchasing it. Items
     * sell for 50% of their purchase cost. This method does not check if the item is actually sellable. For example, Divine Rapiers cannot
     * be sold.
     */
    public int getSellValue() {
        return (getCost() + 2 - 1) / 2;
    }

    /**
     * @return True if the item can be denied. For example, if the item is dropped on the ground can an enemy player right-click it and destroy it.
     */
    public boolean isDeniable() {
        return true;
    }

    /**
     * @return True if the item can be split into its constituent items.
     */
    public boolean isDisassemblable() {
        return false;
    }

    /**
     * @return True if the item can be dropped from a player's inventory. Only the Aegis and Divine Rapiers cannot be dropped (at least not voluntarily).
     */
    public boolean isDroppable() {
        return true;
    }

    /**
     * @return True if the item can be purchased in one of the shops. Only the Aegis and Cheese cannot be purchased but must won through victory over the terrible beast Roshan.
     */
    public boolean isPurchasable() {
        return true;
    }

    /**
     * @return True if a player can store more than one of this item in a single inventory slot. For example, a player can store multiple Observer Wards in a single slot.
     * This is <i>not</i> related to stacking the abilities of items and spells.
     */
    public boolean isStackable() {
        return false;
    }

    /**
     * @return True if a player can sell this item in one of the shops.
     */
    public boolean isSellable() {
        return true;
    }

    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
