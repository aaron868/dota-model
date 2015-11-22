package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Bloodstone extends Item {

    private static Bloodstone instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemDisplayCharges;
    private final int itemInitialCharges;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final int bonus_mana;
    private final int bonus_mana_regen;
    private final int charge_range;
    private final int death_gold_reduction;
    private final int heal_on_death_base;
    private final int heal_on_death_per_charge;
    private final int heal_on_death_range;
    private final String localizedName;
    private final double on_death_removal;
    private final int respawn_time_reduction;

    private Bloodstone() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = 0;
        abilityCastRange = 15;
        abilityCooldown = 3;
        fightRecapLevel = 2;
        iD = 121;
        itemAliases = new String[]{"bs","bloodstone"};
        itemCost = 49;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisplayCharges = 1;
        itemInitialCharges = 8;
        itemQuality = "epic";
        itemShopTags = new String[]{"regen_health","regen_mana","mana_pool","health_pool"};
        key = "item_bloodstone";
        bonus_damage = 0;
        bonus_health = 5;
        bonus_health_regen = 9;
        bonus_mana = 4;
        bonus_mana_regen = 2;
        charge_range = 16;
        death_gold_reduction = 0;
        heal_on_death_base = 5;
        heal_on_death_per_charge = 3;
        heal_on_death_range = 1675;
        localizedName = "Bloodstone";
        on_death_removal = .67;
        respawn_time_reduction = 3;
    }

    public static Bloodstone instance() {
        if( instance == null ){
            instance = new Bloodstone();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
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

    public int getChargeRange() {
        return charge_range;
    }

    public int getDeathGoldReduction() {
        return death_gold_reduction;
    }

    public int getHealOnDeathBase() {
        return heal_on_death_base;
    }

    public int getHealOnDeathPerCharge() {
        return heal_on_death_per_charge;
    }

    public int getHealOnDeathRange() {
        return heal_on_death_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getOnDeathRemoval() {
        return on_death_removal;
    }

    public int getRespawnTimeReduction() {
        return respawn_time_reduction;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bloodstone))
            return false;
        if (object == this)
            return true;
        Bloodstone otherObject = (Bloodstone) object;
        return otherObject.getKey().equals(getKey());
    }

}
