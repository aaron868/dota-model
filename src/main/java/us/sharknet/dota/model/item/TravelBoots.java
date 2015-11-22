package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TravelBoots extends Item {

    private static TravelBoots instance;

    private final String[] abilityBehavior;
    private final int abilityChannelTime;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String[] itemAliases;
    private final int itemBaseLevel;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int maxUpgradeLevel;
    private final String upgradeRecipe;
    private final String upgradesItems;
    private final int bonus_movement_speed;
    private final String localizedName;

    private TravelBoots() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityChannelTime = 3;
        abilityCooldown = 45;
        abilityManaCost = 75;
        abilitySharedCooldown = "teleport";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_INVULNERABLE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP","DOTA_UNIT_TARGET_BUILDING"};
        iD = 48;
        itemAliases = new String[]{"bot","boots of travel"};
        itemBaseLevel = 1;
        itemCost = 2450;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "common";
        itemShopTags = new String[]{"teleport","move_speed"};
        key = "item_travel_boots";
        maxUpgradeLevel = 2;
        upgradeRecipe = "item_recipe_travel_boots";
        upgradesItems = "item_travel_boots";
        bonus_movement_speed = 100;
        localizedName = "Boots Of Travel";
    }

    public static TravelBoots instance() {
        if( instance == null ){
            instance = new TravelBoots();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemBaseLevel() {
        return itemBaseLevel;
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

    public int getMaxUpgradeLevel() {
        return maxUpgradeLevel;
    }

    public String getUpgradeRecipe() {
        return upgradeRecipe;
    }

    public String getUpgradesItems() {
        return upgradesItems;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TravelBoots))
            return false;
        if (object == this)
            return true;
        TravelBoots otherObject = (TravelBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
