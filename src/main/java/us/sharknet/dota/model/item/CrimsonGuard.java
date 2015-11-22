package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class CrimsonGuard extends Item {

    private static CrimsonGuard instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int itemAlertable;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int block_chance;
    private final int block_chance_active;
    private final int block_damage_melee;
    private final int block_damage_melee_active;
    private final int block_damage_ranged;
    private final int block_damage_ranged_active;
    private final int bonus_all_stats;
    private final int bonus_aoe_armor;
    private final int bonus_aoe_radius;
    private final int bonus_armor;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final int duration;
    private final String localizedName;

    private CrimsonGuard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 7;
        iD = 242;
        itemAlertable = 1;
        itemCost = 355;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"armor","boost_armor","regen_health","block","health_pool"};
        key = "item_crimson_guard";
        block_chance = 75;
        block_chance_active = 1;
        block_damage_melee = 4;
        block_damage_melee_active = 55;
        block_damage_ranged = 2;
        block_damage_ranged_active = 55;
        bonus_all_stats = 2;
        bonus_aoe_armor = 2;
        bonus_aoe_radius = 9;
        bonus_armor = 5;
        bonus_health = 25;
        bonus_health_regen = 6;
        duration = 1;
        localizedName = "Crimson Guard";
    }

    public static CrimsonGuard instance() {
        if( instance == null ){
            instance = new CrimsonGuard();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getID() {
        return iD;
    }

    public int getItemAlertable() {
        return itemAlertable;
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

    public int getBlockChance() {
        return block_chance;
    }

    public int getBlockChanceActive() {
        return block_chance_active;
    }

    public int getBlockDamageMelee() {
        return block_damage_melee;
    }

    public int getBlockDamageMeleeActive() {
        return block_damage_melee_active;
    }

    public int getBlockDamageRanged() {
        return block_damage_ranged;
    }

    public int getBlockDamageRangedActive() {
        return block_damage_ranged_active;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusAoeArmor() {
        return bonus_aoe_armor;
    }

    public int getBonusAoeRadius() {
        return bonus_aoe_radius;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CrimsonGuard))
            return false;
        if (object == this)
            return true;
        CrimsonGuard otherObject = (CrimsonGuard) object;
        return otherObject.getKey().equals(getKey());
    }

}
