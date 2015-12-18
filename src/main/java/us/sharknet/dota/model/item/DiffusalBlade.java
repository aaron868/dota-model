package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DiffusalBlade extends Item {

    private static DiffusalBlade instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemBaseLevel;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemDisplayCharges;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final int itemRequiresCharges;
    private final String[] itemShopTags;
    private final String key;
    private final int maxUpgradeLevel;
    private final String upgradeRecipe;
    private final String upgradesItems;
    private final int bonus_agility;
    private final int bonus_intellect;
    private final int cast_range_tooltip;
    private final int damage_per_burn;
    private final int feedback_mana_burn;
    private final int feedback_mana_burn_ranged;
    private final int initial_charges;
    private final String localizedName;
    private final int purge_rate;
    private final int purge_root_duration;
    private final int purge_slow_duration;
    private final int purge_summoned_damage;

    private DiffusalBlade() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = 0;
        abilityManaCost = 0;
        abilitySharedCooldown = "diffusal";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_INVULNERABLE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 174;
        itemAliases = "diffusal blade 1";
        itemBaseLevel = 1;
        itemCost = 3150;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisplayCharges = 1;
        itemInitialCharges = 8;
        itemPermanent = 1;
        itemQuality = "artifact";
        itemRequiresCharges = 1;
        itemShopTags = new String[]{"agi","int","unique","hard_to_tag"};
        key = "item_diffusal_blade";
        maxUpgradeLevel = 2;
        upgradeRecipe = "item_recipe_diffusal_blade";
        upgradesItems = "item_diffusal_blade";
        bonus_agility = 25;
        bonus_intellect = 10;
        cast_range_tooltip = 600;
        damage_per_burn = 1;
        feedback_mana_burn = 25;
        feedback_mana_burn_ranged = 25;
        initial_charges = 8;
        localizedName = "Diffusal Blade 1";
        purge_rate = 5;
        purge_root_duration = 3;
        purge_slow_duration = 4;
        purge_summoned_damage = 99999;
    }

    public static DiffusalBlade instance() {
        if( instance == null ){
            instance = new DiffusalBlade();
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

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public int getItemRequiresCharges() {
        return itemRequiresCharges;
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public int getDamagePerBurn() {
        return damage_per_burn;
    }

    public int getFeedbackManaBurn() {
        return feedback_mana_burn;
    }

    public int getFeedbackManaBurnRanged() {
        return feedback_mana_burn_ranged;
    }

    public int getInitialCharges() {
        return initial_charges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getPurgeRate() {
        return purge_rate;
    }

    public int getPurgeRootDuration() {
        return purge_root_duration;
    }

    public int getPurgeSlowDuration() {
        return purge_slow_duration;
    }

    public int getPurgeSummonedDamage() {
        return purge_summoned_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DiffusalBlade))
            return false;
        if (object == this)
            return true;
        DiffusalBlade otherObject = (DiffusalBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
