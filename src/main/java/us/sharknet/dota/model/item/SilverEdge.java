package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SilverEdge extends Item {

    private static SilverEdge instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int backstab_duration;
    private final int backstab_duration_range;
    private final int backstab_reduction;
    private final int backstab_slow;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_strength;
    private final String localizedName;
    private final int maim_attack_speed;
    private final int maim_chance;
    private final int maim_duration;
    private final int maim_movement_speed;
    private final int windwalk_bonus_damage;
    private final int windwalk_duration;
    private final double windwalk_fade_time;
    private final int windwalk_movement_speed;

    private SilverEdge() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 24;
        abilityManaCost = 75;
        abilitySharedCooldown = "shadow_blade";
        fightRecapLevel = 1;
        iD = 249;
        itemAliases = new String[]{"sb","invis","shadow blade"};
        itemCost = 545;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","attack_speed","movespeed","hard_to_tag"};
        key = "item_silver_edge";
        backstab_duration = 5;
        backstab_duration_range = 5;
        backstab_reduction = -4;
        backstab_slow = 0;
        bonus_attack_speed = 3;
        bonus_damage = 32;
        bonus_strength = 16;
        localizedName = "Silver Edge";
        maim_attack_speed = -2;
        maim_chance = 15;
        maim_duration = 4;
        maim_movement_speed = -2;
        windwalk_bonus_damage = 225;
        windwalk_duration = 14;
        windwalk_fade_time = .3;
        windwalk_movement_speed = 2;
    }

    public static SilverEdge instance() {
        if( instance == null ){
            instance = new SilverEdge();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int getBackstabDuration() {
        return backstab_duration;
    }

    public int getBackstabDurationRange() {
        return backstab_duration_range;
    }

    public int getBackstabReduction() {
        return backstab_reduction;
    }

    public int getBackstabSlow() {
        return backstab_slow;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaimAttackSpeed() {
        return maim_attack_speed;
    }

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimMovementSpeed() {
        return maim_movement_speed;
    }

    public int getWindwalkBonusDamage() {
        return windwalk_bonus_damage;
    }

    public int getWindwalkDuration() {
        return windwalk_duration;
    }

    public double getWindwalkFadeTime() {
        return windwalk_fade_time;
    }

    public int getWindwalkMovementSpeed() {
        return windwalk_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SilverEdge))
            return false;
        if (object == this)
            return true;
        SilverEdge otherObject = (SilverEdge) object;
        return otherObject.getKey().equals(getKey());
    }

}
