package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class OctarineCore extends Item {

    private static OctarineCore instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int active_duration;
    private final int bonus_cooldown;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final int bonus_intelligence;
    private final int bonus_mana;
    private final int bonus_mana_regen;
    private final int creep_lifesteal;
    private final int hero_lifesteal;
    private final String localizedName;

    private OctarineCore() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 235;
        itemAliases = new String[]{"mana","mb","octarine core"};
        itemCost = 59;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "rare";
        itemShopTags = new String[]{"move_speed","boost_mana","mana_pool"};
        key = "item_octarine_core";
        active_duration = 7;
        bonus_cooldown = 25;
        bonus_health = 45;
        bonus_health_regen = 4;
        bonus_intelligence = 25;
        bonus_mana = 4;
        bonus_mana_regen = 1;
        creep_lifesteal = 5;
        hero_lifesteal = 25;
        localizedName = "Octarine Core";
    }

    public static OctarineCore instance() {
        if( instance == null ){
            instance = new OctarineCore();
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

    public int getActiveDuration() {
        return active_duration;
    }

    public int getBonusCooldown() {
        return bonus_cooldown;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusIntelligence() {
        return bonus_intelligence;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getCreepLifesteal() {
        return creep_lifesteal;
    }

    public int getHeroLifesteal() {
        return hero_lifesteal;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OctarineCore))
            return false;
        if (object == this)
            return true;
        OctarineCore otherObject = (OctarineCore) object;
        return otherObject.getKey().equals(getKey());
    }

}
