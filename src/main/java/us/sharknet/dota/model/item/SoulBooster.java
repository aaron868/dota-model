package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SoulBooster extends Item {

    private static SoulBooster instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final int bonus_mana;
    private final int bonus_mana_regen;
    private final String localizedName;

    private SoulBooster() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 129;
        itemAliases = "soul booster";
        itemCost = 32;
        itemQuality = "epic";
        itemShopTags = new String[]{"regen_health","regen_mana","health_pool","mana_pool"};
        key = "item_soul_booster";
        bonus_health = 45;
        bonus_health_regen = 4;
        bonus_mana = 4;
        bonus_mana_regen = 1;
        localizedName = "Soul Booster";
    }

    public static SoulBooster instance() {
        if( instance == null ){
            instance = new SoulBooster();
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

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SoulBooster))
            return false;
        if (object == this)
            return true;
        SoulBooster otherObject = (SoulBooster) object;
        return otherObject.getKey().equals(getKey());
    }

}
