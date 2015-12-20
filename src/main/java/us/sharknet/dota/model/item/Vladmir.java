package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Vladmir extends Item {

    private static Vladmir instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int armor_aura;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final int damage_aura;
    private final int hp_regen;
    private final String localizedName;
    private final double mana_regen_aura;
    private final int vampiric_aura;
    private final int vampiric_aura_ranged;

    private Vladmir() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 81;
        itemAliases = new String[]{"vladmir's offering","vlads"};
        itemCost = 2300;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"lifesteal","damage","armor","regen_mana"};
        key = "item_vladmir";
        armor_aura = 5;
        aura_radius = 900;
        bonus_all_stats = 2;
        damage_aura = 15;
        hp_regen = 3;
        localizedName = "Vladmir's Offering";
        mana_regen_aura = .8;
        vampiric_aura = 15;
        vampiric_aura_ranged = 10;
    }

    public static Vladmir instance() {
        if( instance == null ){
            instance = new Vladmir();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int getArmorAura() {
        return armor_aura;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getDamageAura() {
        return damage_aura;
    }

    public int getHpRegen() {
        return hp_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getManaRegenAura() {
        return mana_regen_aura;
    }

    public int getVampiricAura() {
        return vampiric_aura;
    }

    public int getVampiricAuraRanged() {
        return vampiric_aura_ranged;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Vladmir))
            return false;
        if (object == this)
            return true;
        Vladmir otherObject = (Vladmir) object;
        return otherObject.getKey().equals(getKey());
    }

}
