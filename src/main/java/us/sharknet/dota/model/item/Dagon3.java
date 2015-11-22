package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Dagon3 extends Item {

    private static Dagon3 instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemBaseLevel;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int maxUpgradeLevel;
    private final String upgradeRecipe;
    private final String[] upgradesItems;
    private final int bonus_all_stats;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int damage;
    private final double damage_delay;
    private final String localizedName;
    private final int range_tooltip;

    private Dagon3() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 700;
        abilityCooldown = 25.0;
        abilityManaCost = 18;
        abilitySharedCooldown = "dagon";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 22;
        itemAliases = "dagon 3";
        itemBaseLevel = 3;
        itemCost = 522;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"damage","int","str","agi","hard_to_tag"};
        key = "item_dagon_3";
        maxUpgradeLevel = 5;
        upgradeRecipe = "item_recipe_dagon";
        upgradesItems = new String[]{"item_dagon_3","item_dagon_4"};
        bonus_all_stats = 3;
        bonus_damage = 9;
        bonus_intellect = 19;
        damage = 600;
        damage_delay = 0.0;
        localizedName = "Dagon 3";
        range_tooltip = 700;
    }

    public static Dagon3 instance() {
        if( instance == null ){
            instance = new Dagon3();
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

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
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

    public String[] getUpgradesItems() {
        return upgradesItems;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getDamage() {
        return damage;
    }

    public double getDamageDelay() {
        return damage_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getRangeTooltip() {
        return range_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Dagon3))
            return false;
        if (object == this)
            return true;
        Dagon3 otherObject = (Dagon3) object;
        return otherObject.getKey().equals(getKey());
    }

}
