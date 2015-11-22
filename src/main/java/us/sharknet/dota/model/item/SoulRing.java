package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SoulRing extends Item {

    private static SoulRing instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final int duration;
    private final int health_regen;
    private final int health_sacrifice;
    private final String localizedName;
    private final int mana_gain;
    private final int mana_regen;

    private SoulRing() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 3;
        abilityManaCost = 0;
        iD = 178;
        itemAliases = "soul ring";
        itemCost = 800;
        itemDeclarations = "DECLARE_PURCHASES_TO_SPECTATORS";
        itemQuality = "common";
        itemShopTags = new String[]{"regen_health","boost_mana"};
        key = "item_soul_ring";
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        duration = 10;
        health_regen = 3;
        health_sacrifice = 150;
        localizedName = "Soul Ring";
        mana_gain = 150;
        mana_regen = 50;
    }

    public static SoulRing instance() {
        if( instance == null ){
            instance = new SoulRing();
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

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemDeclarations() {
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

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public int getDuration() {
        return duration;
    }

    public int getHealthRegen() {
        return health_regen;
    }

    public int getHealthSacrifice() {
        return health_sacrifice;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaGain() {
        return mana_gain;
    }

    public int getManaRegen() {
        return mana_regen;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SoulRing))
            return false;
        if (object == this)
            return true;
        SoulRing otherObject = (SoulRing) object;
        return otherObject.getKey().equals(getKey());
    }

}
