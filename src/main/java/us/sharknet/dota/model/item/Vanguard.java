package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Vanguard extends Item {

    private static Vanguard instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int block_damage_melee;
    private final int block_damage_ranged;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final String localizedName;

    private Vanguard() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 125;
        itemAliases = "vanguard";
        itemCost = 2150;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"regen_health","block","health_pool"};
        key = "item_vanguard";
        block_damage_melee = 32;
        block_damage_ranged = 16;
        bonus_health = 250;
        bonus_health_regen = 6;
        localizedName = "Vanguard";
    }

    public static Vanguard instance() {
        if( instance == null ){
            instance = new Vanguard();
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

    public int getBlockDamageMelee() {
        return block_damage_melee;
    }

    public int getBlockDamageRanged() {
        return block_damage_ranged;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Vanguard))
            return false;
        if (object == this)
            return true;
        Vanguard otherObject = (Vanguard) object;
        return otherObject.getKey().equals(getKey());
    }

}
