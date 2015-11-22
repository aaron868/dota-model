package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class OgreAxe extends Item {

    private static OgreAxe instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_strength;
    private final String localizedName;

    private OgreAxe() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 21;
        itemAliases = "ogre club";
        itemCost = 1;
        itemQuality = "component";
        itemShopTags = "str";
        key = "item_ogre_axe";
        bonus_strength = 1;
        localizedName = "Ogre Club";
    }

    public static OgreAxe instance() {
        if( instance == null ){
            instance = new OgreAxe();
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

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreAxe))
            return false;
        if (object == this)
            return true;
        OgreAxe otherObject = (OgreAxe) object;
        return otherObject.getKey().equals(getKey());
    }

}
