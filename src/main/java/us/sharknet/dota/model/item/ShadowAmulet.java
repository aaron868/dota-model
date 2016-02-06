package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ShadowAmulet extends Item {

    private static ShadowAmulet instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final double fade_time;
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

    private ShadowAmulet() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT"};
        abilityCastRange = 600;
        abilityCooldown = 1;
        abilityManaCost = 0;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 215;
        cost = 1400;
        key = "item_shadow_amulet";
        bonus_attack_speed = 20;
        chargeable = false;
        components = new String[0];
        consumable = false;
        fade_time = 1.5;
        initialCharges = 0;
        localizedName = "Shadow Amulet";
        maxCharges = 0;
        partOf = new String[]{"item_glimmer_cape","item_invis_sword"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static ShadowAmulet instance() {
        if( instance == null ){
            instance = new ShadowAmulet();
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

    public String getKey() {
        return key;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
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

    public double getFadeTime() {
        return fade_time;
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
        if (!(object instanceof ShadowAmulet))
            return false;
        if (object == this)
            return true;
        ShadowAmulet otherObject = (ShadowAmulet) object;
        return otherObject.getKey().equals(getKey());
    }

}
