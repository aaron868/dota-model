package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MantaStyle extends Item {

    private static MantaStyle instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final int bonus_intellect;
    private final int bonus_movement_speed;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int cooldown_melee;
    private final int cooldown_ranged_tooltip;
    private final int images_count;
    private final int images_do_damage_percent_melee;
    private final int images_do_damage_percent_ranged;
    private final int images_take_damage_percent_melee;
    private final int images_take_damage_percent_ranged;
    private final int initialCharges;
    private final double invuln_duration;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final int tooltip_damage_incoming_melee_total_pct;
    private final int tooltip_damage_incoming_ranged_total_pct;
    private final int tooltip_damage_outgoing_melee;
    private final int tooltip_damage_outgoing_ranged;
    private final int tooltip_illusion_duration;
    private final Vendor[] vendorLocations;
    private final int vision_radius;

    private MantaStyle() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCooldown = 45;
        abilityManaCost = 125;
        iD = 147;
        cost = 4950;
        disassemblable = true;
        key = "item_manta";
        bonus_agility = 26;
        bonus_attack_speed = 15;
        bonus_intellect = 10;
        bonus_movement_speed = 10;
        bonus_strength = 10;
        chargeable = false;
        components = new String[]{"item_yasha","item_ultimate_orb","item_recipe_manta"};
        consumable = false;
        cooldown_melee = 30;
        cooldown_ranged_tooltip = 45;
        images_count = 2;
        images_do_damage_percent_melee = -67;
        images_do_damage_percent_ranged = -72;
        images_take_damage_percent_melee = 250;
        images_take_damage_percent_ranged = 300;
        initialCharges = 0;
        invuln_duration = .1;
        localizedName = "Manta Style";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        tooltip_damage_incoming_melee_total_pct = 350;
        tooltip_damage_incoming_ranged_total_pct = 400;
        tooltip_damage_outgoing_melee = 33;
        tooltip_damage_outgoing_ranged = 28;
        tooltip_illusion_duration = 20;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
        vision_radius = 1000;
    }

    public static MantaStyle instance() {
        if( instance == null ){
            instance = new MantaStyle();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
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

    public int getCooldownMelee() {
        return cooldown_melee;
    }

    public int getCooldownRangedTooltip() {
        return cooldown_ranged_tooltip;
    }

    public int getImagesCount() {
        return images_count;
    }

    public int getImagesDoDamagePercentMelee() {
        return images_do_damage_percent_melee;
    }

    public int getImagesDoDamagePercentRanged() {
        return images_do_damage_percent_ranged;
    }

    public int getImagesTakeDamagePercentMelee() {
        return images_take_damage_percent_melee;
    }

    public int getImagesTakeDamagePercentRanged() {
        return images_take_damage_percent_ranged;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public double getInvulnDuration() {
        return invuln_duration;
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

    public int getTooltipDamageIncomingMeleeTotalPct() {
        return tooltip_damage_incoming_melee_total_pct;
    }

    public int getTooltipDamageIncomingRangedTotalPct() {
        return tooltip_damage_incoming_ranged_total_pct;
    }

    public int getTooltipDamageOutgoingMelee() {
        return tooltip_damage_outgoing_melee;
    }

    public int getTooltipDamageOutgoingRanged() {
        return tooltip_damage_outgoing_ranged;
    }

    public int getTooltipIllusionDuration() {
        return tooltip_illusion_duration;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MantaStyle))
            return false;
        if (object == this)
            return true;
        MantaStyle otherObject = (MantaStyle) object;
        return otherObject.getKey().equals(getKey());
    }

}
