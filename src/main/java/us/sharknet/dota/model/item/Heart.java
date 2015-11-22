package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Heart extends Item {

    private static Heart instance;

    private final String abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_health;
    private final int bonus_strength;
    private final int cooldown_melee;
    private final int cooldown_ranged_tooltip;
    private final int health_regen_rate;
    private final String localizedName;

    private Heart() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 7;
        iD = 114;
        itemAliases = new String[]{"hot","heart of tarrasque"};
        itemCost = 55;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"str","regen_health","health_pool"};
        key = "item_heart";
        bonus_health = 3;
        bonus_strength = 4;
        cooldown_melee = 5;
        cooldown_ranged_tooltip = 7;
        health_regen_rate = 4;
        localizedName = "Heart Of Tarrasque";
    }

    public static Heart instance() {
        if( instance == null ){
            instance = new Heart();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public int getCooldownMelee() {
        return cooldown_melee;
    }

    public int getCooldownRangedTooltip() {
        return cooldown_ranged_tooltip;
    }

    public int getHealthRegenRate() {
        return health_regen_rate;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Heart))
            return false;
        if (object == this)
            return true;
        Heart otherObject = (Heart) object;
        return otherObject.getKey().equals(getKey());
    }

}
