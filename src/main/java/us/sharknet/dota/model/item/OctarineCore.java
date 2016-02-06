package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class OctarineCore extends Item {

    private static OctarineCore instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int active_duration;
    private final int bonus_cooldown;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final int bonus_intelligence;
    private final int bonus_mana;
    private final int bonus_mana_regen;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int creep_lifesteal;
    private final int hero_lifesteal;
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
    private final Vendor[] vendorLocations;

    private OctarineCore() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 235;
        cost = 5900;
        disassemblable = true;
        key = "item_octarine_core";
        active_duration = 7;
        bonus_cooldown = 25;
        bonus_health = 450;
        bonus_health_regen = 4;
        bonus_intelligence = 25;
        bonus_mana = 400;
        bonus_mana_regen = 100;
        chargeable = false;
        components = new String[]{"item_mystic_staff","item_soul_booster"};
        consumable = false;
        creep_lifesteal = 5;
        hero_lifesteal = 25;
        initialCharges = 0;
        localizedName = "Octarine Core";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
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

    public int getCost() {
        return cost;
    }

    public boolean isDisassemblable() {
        return disassemblable;
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

    public boolean isChargeable() {
        return chargeable;
    }

    public String[] getComponents() {
        return components;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public int getCreepLifesteal() {
        return creep_lifesteal;
    }

    public int getHeroLifesteal() {
        return hero_lifesteal;
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

    public Vendor[] getVendorLocations() {
        return vendorLocations;
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
