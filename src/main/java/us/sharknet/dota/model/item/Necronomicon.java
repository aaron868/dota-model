package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Necronomicon extends Item {

    private static Necronomicon instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
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
    private final int archer_attack_speed;
    private final int archer_attack_speed_radius;
    private final int archer_aura_radius_tooltip;
    private final int archer_damage_tooltip;
    private final int archer_health_tooltip;
    private final int archer_mana_burn;
    private final int bonus_intellect;
    private final int bonus_strength;
    private final int explosion;
    private final String localizedName;
    private final int summon_duration;
    private final int warrior_damage_tooltip;
    private final int warrior_health_tooltip;
    private final int warrior_mana_break_tooltip;
    private final int warrior_mana_feedback;
    private final int warrior_truesight;

    private Necronomicon() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = 0;
        abilityCooldown = 95;
        abilityManaCost = 5;
        abilitySharedCooldown = "necronomicon";
        fightRecapLevel = 1;
        iD = 16;
        itemAliases = "necronomicon 1";
        itemBaseLevel = 1;
        itemCost = 27;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","str","hard_to_tag","see_invis"};
        key = "item_necronomicon";
        maxUpgradeLevel = 3;
        upgradeRecipe = "item_recipe_necronomicon";
        upgradesItems = new String[]{"item_necronomicon","item_necronomicon_2"};
        archer_attack_speed = 5;
        archer_attack_speed_radius = 4;
        archer_aura_radius_tooltip = 9;
        archer_damage_tooltip = 60;
        archer_health_tooltip = 700;
        archer_mana_burn = 125;
        bonus_intellect = 15;
        bonus_strength = 8;
        explosion = 550;
        localizedName = "Necronomicon 1";
        summon_duration = 4;
        warrior_damage_tooltip = 45;
        warrior_health_tooltip = 700;
        warrior_mana_break_tooltip = 25;
        warrior_mana_feedback = 20;
        warrior_truesight = 1;
    }

    public static Necronomicon instance() {
        if( instance == null ){
            instance = new Necronomicon();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int getArcherAttackSpeed() {
        return archer_attack_speed;
    }

    public int getArcherAttackSpeedRadius() {
        return archer_attack_speed_radius;
    }

    public int getArcherAuraRadiusTooltip() {
        return archer_aura_radius_tooltip;
    }

    public int getArcherDamageTooltip() {
        return archer_damage_tooltip;
    }

    public int getArcherHealthTooltip() {
        return archer_health_tooltip;
    }

    public int getArcherManaBurn() {
        return archer_mana_burn;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public int getExplosion() {
        return explosion;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getSummonDuration() {
        return summon_duration;
    }

    public int getWarriorDamageTooltip() {
        return warrior_damage_tooltip;
    }

    public int getWarriorHealthTooltip() {
        return warrior_health_tooltip;
    }

    public int getWarriorManaBreakTooltip() {
        return warrior_mana_break_tooltip;
    }

    public int getWarriorManaFeedback() {
        return warrior_mana_feedback;
    }

    public int getWarriorTruesight() {
        return warrior_truesight;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Necronomicon))
            return false;
        if (object == this)
            return true;
        Necronomicon otherObject = (Necronomicon) object;
        return otherObject.getKey().equals(getKey());
    }

}
