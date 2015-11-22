package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TranquilBoots extends Item {

    private static TranquilBoots instance;

    private final String abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final int itemHideCharges;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_armor;
    private final int bonus_health_regen;
    private final int bonus_movement_speed;
    private final int break_count;
    private final int break_threshold;
    private final int break_time;
    private final int broken_movement_speed;
    private final int heal_amount;
    private final int heal_duration;
    private final double heal_interval;
    private final String localizedName;

    private TranquilBoots() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 13;
        abilityManaCost = 0;
        iD = 214;
        itemAliases = "tranquil boots";
        itemCost = 1;
        itemDeclarations = "DECLARE_PURCHASES_TO_SPECTATORS";
        itemHideCharges = 1;
        itemQuality = "rare";
        itemShopTags = new String[]{"move_speed","regen_health","armor"};
        key = "item_tranquil_boots";
        bonus_armor = 4;
        bonus_health_regen = 12;
        bonus_movement_speed = 9;
        break_count = 1;
        break_threshold = 2;
        break_time = 13;
        broken_movement_speed = 6;
        heal_amount = 25;
        heal_duration = 2;
        heal_interval = .334;
        localizedName = "Tranquil Boots";
    }

    public static TranquilBoots instance() {
        if( instance == null ){
            instance = new TranquilBoots();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int getItemHideCharges() {
        return itemHideCharges;
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBreakCount() {
        return break_count;
    }

    public int getBreakThreshold() {
        return break_threshold;
    }

    public int getBreakTime() {
        return break_time;
    }

    public int getBrokenMovementSpeed() {
        return broken_movement_speed;
    }

    public int getHealAmount() {
        return heal_amount;
    }

    public int getHealDuration() {
        return heal_duration;
    }

    public double getHealInterval() {
        return heal_interval;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TranquilBoots))
            return false;
        if (object == this)
            return true;
        TranquilBoots otherObject = (TranquilBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
