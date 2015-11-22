package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Tpscroll extends Item {

    private static Tpscroll instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityChannelTime;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShareability;
    private final String[] itemShopTags;
    private final int itemStackable;
    private final String key;
    private final String model;
    private final int sideShop;
    private final String localizedName;
    private final int maximum_distance;
    private final int minimun_distance;
    private final int vision_radius;

    private Tpscroll() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_NOASSIST","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 0;
        abilityChannelTime = 3;
        abilityCooldown = 7;
        abilityManaCost = 75;
        abilitySharedCooldown = "teleport";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_INVULNERABLE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_BUILDING";
        iD = 46;
        itemAliases = new String[]{"tp","town portal scroll"};
        itemCost = 75;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = new String[]{"consumable","tutorial"};
        itemStackable = 1;
        key = "item_tpscroll";
        model = "models/props_gameplay/tpscroll01.vmdl";
        sideShop = 1;
        localizedName = "Town Portal Scroll";
        maximum_distance = 575;
        minimun_distance = 70;
        vision_radius = 200;
    }

    public static Tpscroll instance() {
        if( instance == null ){
            instance = new Tpscroll();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityChannelTime() {
        return abilityChannelTime;
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShareability() {
        return itemShareability;
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

    public String getModel() {
        return model;
    }

    public int getSideShop() {
        return sideShop;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaximumDistance() {
        return maximum_distance;
    }

    public int getMinimunDistance() {
        return minimun_distance;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Tpscroll))
            return false;
        if (object == this)
            return true;
        Tpscroll otherObject = (Tpscroll) object;
        return otherObject.getKey().equals(getKey());
    }

}
