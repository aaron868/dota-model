package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Desolator extends Item {

    private static Desolator instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int corruption_armor;
    private final int corruption_duration;
    private final String localizedName;

    private Desolator() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 168;
        itemAliases = "desolator";
        itemCost = 35;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","unique"};
        key = "item_desolator";
        bonus_damage = 5;
        corruption_armor = -7;
        corruption_duration = 15;
        localizedName = "Desolator";
    }

    public static Desolator instance() {
        if( instance == null ){
            instance = new Desolator();
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

    public String[] getItemDeclarations() {
        return itemDeclarations;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getCorruptionArmor() {
        return corruption_armor;
    }

    public int getCorruptionDuration() {
        return corruption_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Desolator))
            return false;
        if (object == this)
            return true;
        Desolator otherObject = (Desolator) object;
        return otherObject.getKey().equals(getKey());
    }

}
