package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class UrnOfShadows extends Item {

    private static UrnOfShadows instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemDisplayCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final int itemRequiresCharges;
    private final String[] itemShopTags;
    private final int itemStackable;
    private final String key;
    private final int bonus_strength;
    private final String localizedName;
    private final int mana_regen;
    private final int soul_additional_charges;
    private final int soul_damage_amount;
    private final int soul_damage_duration;
    private final int soul_heal_amount;
    private final int soul_heal_duration;
    private final double soul_heal_interval;
    private final int soul_initial_charge;
    private final int soul_radius;
    private final int soul_release_range_tooltip;

    private UrnOfShadows() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 95;
        abilityCooldown = 7;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 92;
        itemAliases = "urn of shadows";
        itemCost = 875;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisplayCharges = 1;
        itemPermanent = 1;
        itemQuality = "rare";
        itemRequiresCharges = 1;
        itemShopTags = new String[]{"regen_mana","str","boost_health"};
        itemStackable = 0;
        key = "item_urn_of_shadows";
        bonus_strength = 6;
        localizedName = "Urn Of Shadows";
        mana_regen = 5;
        soul_additional_charges = 1;
        soul_damage_amount = 15;
        soul_damage_duration = 8;
        soul_heal_amount = 4;
        soul_heal_duration = 8;
        soul_heal_interval = .25;
        soul_initial_charge = 2;
        soul_radius = 14;
        soul_release_range_tooltip = 95;
    }

    public static UrnOfShadows instance() {
        if( instance == null ){
            instance = new UrnOfShadows();
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
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

    public int getItemStackable() {
        return itemStackable;
    }

    public String getKey() {
        return key;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRegen() {
        return mana_regen;
    }

    public int getSoulAdditionalCharges() {
        return soul_additional_charges;
    }

    public int getSoulDamageAmount() {
        return soul_damage_amount;
    }

    public int getSoulDamageDuration() {
        return soul_damage_duration;
    }

    public int getSoulHealAmount() {
        return soul_heal_amount;
    }

    public int getSoulHealDuration() {
        return soul_heal_duration;
    }

    public double getSoulHealInterval() {
        return soul_heal_interval;
    }

    public int getSoulInitialCharge() {
        return soul_initial_charge;
    }

    public int getSoulRadius() {
        return soul_radius;
    }

    public int getSoulReleaseRangeTooltip() {
        return soul_release_range_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UrnOfShadows))
            return false;
        if (object == this)
            return true;
        UrnOfShadows otherObject = (UrnOfShadows) object;
        return otherObject.getKey().equals(getKey());
    }

}
