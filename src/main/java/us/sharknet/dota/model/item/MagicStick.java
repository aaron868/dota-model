package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MagicStick extends Item {

    private static MagicStick instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final String abilitySharedCooldown;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final int itemDisplayCharges;
    private final String itemQuality;
    private final int itemRequiresCharges;
    private final String[] itemShopTags;
    private final String key;
    private final String model;
    private final int sideShop;
    private final int charge_radius;
    private final String localizedName;
    private final int max_charges;
    private final int restore_per_charge;

    private MagicStick() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 13;
        abilitySharedCooldown = "magicwand";
        iD = 34;
        itemAliases = "magic stick";
        itemCost = 200;
        itemDisplayCharges = 1;
        itemQuality = "component";
        itemRequiresCharges = 1;
        itemShopTags = new String[]{"regen_health","regen_mana","boost_health","boost_mana"};
        key = "item_magic_stick";
        model = "models/props_gameplay/magic_wand.vmdl";
        sideShop = 1;
        charge_radius = 1200;
        localizedName = "Magic Stick";
        max_charges = 10;
        restore_per_charge = 15;
    }

    public static MagicStick instance() {
        if( instance == null ){
            instance = new MagicStick();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
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

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public int getItemRequiresCharges() {
        return itemRequiresCharges;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getChargeRadius() {
        return charge_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return max_charges;
    }

    public int getRestorePerCharge() {
        return restore_per_charge;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagicStick))
            return false;
        if (object == this)
            return true;
        MagicStick otherObject = (MagicStick) object;
        return otherObject.getKey().equals(getKey());
    }

}
