package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Pers extends Item {

    private static Pers instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String itemShareability;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final int bonus_mana_regen;
    private final String localizedName;

    private Pers() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 69;
        itemAliases = "perseverance";
        itemCost = 17;
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "common";
        itemShareability = "ITEM_PARTIALLY_SHAREABLE";
        itemShopTags = new String[]{"regen_health","regen_mana"};
        key = "item_pers";
        bonus_damage = 1;
        bonus_health_regen = 5;
        bonus_mana_regen = 125;
        localizedName = "Perseverance";
    }

    public static Pers instance() {
        if( instance == null ){
            instance = new Pers();
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

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShareability() {
        return itemShareability;
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

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Pers))
            return false;
        if (object == this)
            return true;
        Pers otherObject = (Pers) object;
        return otherObject.getKey().equals(getKey());
    }

}
