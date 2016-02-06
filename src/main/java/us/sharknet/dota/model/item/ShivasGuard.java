package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ShivasGuard extends Item {

    private static ShivasGuard instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int aura_attack_speed;
    private final int aura_radius;
    private final int blast_damage;
    private final int blast_debuff_duration;
    private final int blast_movement_speed;
    private final int blast_radius;
    private final int blast_speed;
    private final int bonus_armor;
    private final int bonus_intellect;
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
    private final Vendor[] vendorLocations;

    private ShivasGuard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 30;
        abilityManaCost = 100;
        iD = 119;
        cost = 4700;
        disassemblable = true;
        key = "item_shivas_guard";
        aura_attack_speed = -45;
        aura_radius = 900;
        blast_damage = 200;
        blast_debuff_duration = 4;
        blast_movement_speed = -40;
        blast_radius = 900;
        blast_speed = 350;
        bonus_armor = 15;
        bonus_intellect = 30;
        chargeable = false;
        components = new String[]{"item_platemail","item_mystic_staff","item_recipe_shivas_guard"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Shiva's Guard";
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

    public static ShivasGuard instance() {
        if( instance == null ){
            instance = new ShivasGuard();
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

    public int getAuraAttackSpeed() {
        return aura_attack_speed;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBlastDamage() {
        return blast_damage;
    }

    public int getBlastDebuffDuration() {
        return blast_debuff_duration;
    }

    public int getBlastMovementSpeed() {
        return blast_movement_speed;
    }

    public int getBlastRadius() {
        return blast_radius;
    }

    public int getBlastSpeed() {
        return blast_speed;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
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

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShivasGuard))
            return false;
        if (object == this)
            return true;
        ShivasGuard otherObject = (ShivasGuard) object;
        return otherObject.getKey().equals(getKey());
    }

}
