package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ArcaneBoots extends Item {

    private static ArcaneBoots instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int itemAlertable;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_mana;
    private final int bonus_movement;
    private final String localizedName;
    private final int replenish_amount;
    private final int replenish_radius;

    private ArcaneBoots() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 55;
        abilityManaCost = 0;
        iD = 180;
        itemAlertable = 1;
        itemAliases = new String[]{"mana","mb","arcane boots"};
        itemCost = 1350;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "rare";
        itemShopTags = new String[]{"move_speed","boost_mana","mana_pool"};
        key = "item_arcane_boots";
        bonus_mana = 250;
        bonus_movement = 50;
        localizedName = "Arcane Boots";
        replenish_amount = 135;
        replenish_radius = 900;
    }

    public static ArcaneBoots instance() {
        if( instance == null ){
            instance = new ArcaneBoots();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public int getItemAlertable() {
        return itemAlertable;
    }

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
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

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusMovement() {
        return bonus_movement;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getReplenishAmount() {
        return replenish_amount;
    }

    public int getReplenishRadius() {
        return replenish_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ArcaneBoots))
            return false;
        if (object == this)
            return true;
        ArcaneBoots otherObject = (ArcaneBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
