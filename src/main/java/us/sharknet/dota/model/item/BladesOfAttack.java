package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BladesOfAttack extends Item {

    private static BladesOfAttack instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_damage;
    private final String localizedName;

    private BladesOfAttack() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 2;
        itemAliases = "blades of attack";
        itemCost = 42;
        itemQuality = "component";
        itemShopTags = new String[]{"damage","tutorial"};
        key = "item_blades_of_attack";
        sideShop = 1;
        bonus_damage = 9;
        localizedName = "Blades Of Attack";
    }

    public static BladesOfAttack instance() {
        if( instance == null ){
            instance = new BladesOfAttack();
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

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BladesOfAttack))
            return false;
        if (object == this)
            return true;
        BladesOfAttack otherObject = (BladesOfAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
