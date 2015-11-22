package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MithrilHammer extends Item {

    private static MithrilHammer instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final String localizedName;

    private MithrilHammer() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 8;
        itemAliases = "mithril hammer";
        itemCost = 16;
        itemQuality = "component";
        itemShopTags = "damage";
        key = "item_mithril_hammer";
        bonus_damage = 24;
        localizedName = "Mithril Hammer";
    }

    public static MithrilHammer instance() {
        if( instance == null ){
            instance = new MithrilHammer();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MithrilHammer))
            return false;
        if (object == this)
            return true;
        MithrilHammer otherObject = (MithrilHammer) object;
        return otherObject.getKey().equals(getKey());
    }

}
