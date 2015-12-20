package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfBasilius extends Item {

    private static RingOfBasilius instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final int aura_bonus_armor;
    private final double aura_mana_regen;
    private final int aura_radius;
    private final int bonus_armor;
    private final int bonus_damage;
    private final String localizedName;

    private RingOfBasilius() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE"};
        iD = 88;
        itemAliases = new String[]{"rob","ring of basilius"};
        itemCost = 500;
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "rare";
        itemShopTags = new String[]{"damage","regen_mana","armor"};
        key = "item_ring_of_basilius";
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        aura_bonus_armor = 2;
        aura_mana_regen = .65;
        aura_radius = 900;
        bonus_armor = 1;
        bonus_damage = 6;
        localizedName = "Ring Of Basilius";
    }

    public static RingOfBasilius instance() {
        if( instance == null ){
            instance = new RingOfBasilius();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
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

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public int getAuraBonusArmor() {
        return aura_bonus_armor;
    }

    public double getAuraManaRegen() {
        return aura_mana_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RingOfBasilius))
            return false;
        if (object == this)
            return true;
        RingOfBasilius otherObject = (RingOfBasilius) object;
        return otherObject.getKey().equals(getKey());
    }

}
