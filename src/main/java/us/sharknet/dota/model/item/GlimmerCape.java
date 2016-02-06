package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GlimmerCape extends Item {

    private static GlimmerCape instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int active_magical_armor;
    private final int bonus_attack_speed;
    private final int bonus_magical_armor;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final double fade_delay;
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

    private GlimmerCape() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT"};
        abilityCastRange = 800;
        abilityCooldown = 16;
        abilityManaCost = 110;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 254;
        cost = 1950;
        disassemblable = true;
        key = "item_glimmer_cape";
        active_magical_armor = 45;
        bonus_attack_speed = 20;
        bonus_magical_armor = 15;
        chargeable = false;
        components = new String[]{"item_shadow_amulet","item_cloak"};
        consumable = false;
        duration = 5;
        fade_delay = .6;
        initialCharges = 0;
        localizedName = "Glimmer Cape";
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

    public static GlimmerCape instance() {
        if( instance == null ){
            instance = new GlimmerCape();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public String getAbilityUnitTargetType() {
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

    public int getActiveMagicalArmor() {
        return active_magical_armor;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusMagicalArmor() {
        return bonus_magical_armor;
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

    public int getDuration() {
        return duration;
    }

    public double getFadeDelay() {
        return fade_delay;
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
        if (!(object instanceof GlimmerCape))
            return false;
        if (object == this)
            return true;
        GlimmerCape otherObject = (GlimmerCape) object;
        return otherObject.getKey().equals(getKey());
    }

}
