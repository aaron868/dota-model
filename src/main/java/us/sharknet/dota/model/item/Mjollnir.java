package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Mjollnir extends Item {

    private static Mjollnir instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int chain_chance;
    private final int chain_cooldown;
    private final int chain_damage;
    private final double chain_delay;
    private final int chain_radius;
    private final int chain_strikes;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
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
    private final int static_chance;
    private final int static_cooldown;
    private final int static_damage;
    private final int static_duration;
    private final int static_primary_radius;
    private final int static_radius;
    private final int static_seconary_radius;
    private final int static_strikes;
    private final Vendor[] vendorLocations;

    private Mjollnir() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 800;
        abilityCooldown = 35;
        abilityManaCost = 50;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 158;
        cost = 5700;
        disassemblable = true;
        key = "item_mjollnir";
        bonus_attack_speed = 80;
        bonus_damage = 24;
        chain_chance = 25;
        chain_cooldown = 0;
        chain_damage = 150;
        chain_delay = .25;
        chain_radius = 900;
        chain_strikes = 12;
        chargeable = false;
        components = new String[]{"item_maelstrom","item_hyperstone","item_recipe_mjollnir"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Mjollnir";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        static_chance = 20;
        static_cooldown = 1;
        static_damage = 200;
        static_duration = 15;
        static_primary_radius = 600;
        static_radius = 900;
        static_seconary_radius = 900;
        static_strikes = 4;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Mjollnir instance() {
        if( instance == null ){
            instance = new Mjollnir();
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public int getCost() {
        return cost;
    }

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public String getKey() {
        return key;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getChainChance() {
        return chain_chance;
    }

    public int getChainCooldown() {
        return chain_cooldown;
    }

    public int getChainDamage() {
        return chain_damage;
    }

    public double getChainDelay() {
        return chain_delay;
    }

    public int getChainRadius() {
        return chain_radius;
    }

    public int getChainStrikes() {
        return chain_strikes;
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

    public int getStaticChance() {
        return static_chance;
    }

    public int getStaticCooldown() {
        return static_cooldown;
    }

    public int getStaticDamage() {
        return static_damage;
    }

    public int getStaticDuration() {
        return static_duration;
    }

    public int getStaticPrimaryRadius() {
        return static_primary_radius;
    }

    public int getStaticRadius() {
        return static_radius;
    }

    public int getStaticSeconaryRadius() {
        return static_seconary_radius;
    }

    public int getStaticStrikes() {
        return static_strikes;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Mjollnir))
            return false;
        if (object == this)
            return true;
        Mjollnir otherObject = (Mjollnir) object;
        return otherObject.getKey().equals(getKey());
    }

}
