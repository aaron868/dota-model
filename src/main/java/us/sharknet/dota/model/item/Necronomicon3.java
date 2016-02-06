package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Necronomicon3 extends Item {

    private static Necronomicon3 instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final int iD;
    private final int itemBaseLevel;
    private final int cost;
    private final String key;
    private final int archer_attack_speed;
    private final int archer_attack_speed_radius;
    private final int archer_aura_radius_tooltip;
    private final int archer_damage_tooltip;
    private final int archer_health_tooltip;
    private final int archer_mana_burn;
    private final int bonus_intellect;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int[] explosion;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final int summon_duration;
    private final Vendor[] vendorLocations;
    private final int warrior_damage_tooltip;
    private final int warrior_health_tooltip;
    private final int warrior_mana_break_tooltip;
    private final int warrior_mana_feedback;
    private final int warrior_truesight;

    private Necronomicon3() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = 0;
        abilityCooldown = 95;
        abilityManaCost = 50;
        abilitySharedCooldown = "necronomicon";
        iD = 194;
        itemBaseLevel = 3;
        cost = 5050;
        key = "item_necronomicon_3";
        archer_attack_speed = 9;
        archer_attack_speed_radius = 400;
        archer_aura_radius_tooltip = 900;
        archer_damage_tooltip = 120;
        archer_health_tooltip = 900;
        archer_mana_burn = 225;
        bonus_intellect = 24;
        bonus_strength = 16;
        chargeable = false;
        components = new String[]{"item_necronomicon_2","item_recipe_necronomicon_3"};
        consumable = false;
        explosion = new int[]{550,675,800};
        initialCharges = 0;
        localizedName = "Necronomicon 3";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        summon_duration = 40;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
        warrior_damage_tooltip = 75;
        warrior_health_tooltip = 900;
        warrior_mana_break_tooltip = 75;
        warrior_mana_feedback = 75;
        warrior_truesight = 1000;
    }

    public static Necronomicon3 instance() {
        if( instance == null ){
            instance = new Necronomicon3();
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

    public int getID() {
        return iD;
    }

    public int getItemBaseLevel() {
        return itemBaseLevel;
    }

    public int getCost() {
        return cost;
    }

    public String getKey() {
        return key;
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

    public boolean isChargeable() {
        return chargeable;
    }

    public String[] getComponents() {
        return components;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public int[] getExplosion() {
        return explosion;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return maxCharges;
    }

    public String[] getPartOf() {
        return partOf;
    }

    public boolean isPlaceable() {
        return placeable;
    }

    public int getPlaceableDuration() {
        return placeableDuration;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isRecipe() {
        return recipe;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public int getSummonDuration() {
        return summon_duration;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
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
        if (!(object instanceof Necronomicon3))
            return false;
        if (object == this)
            return true;
        Necronomicon3 otherObject = (Necronomicon3) object;
        return otherObject.getKey().equals(getKey());
    }

}
