package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class QuellingBlade extends Item {

    private static QuellingBlade instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final String model;
    private final int sideShop;
    private final int cast_range_ward;
    private final int damage_bonus;
    private final int damage_bonus_ranged;
    private final String localizedName;
    private final int quelling_range_tooltip;

    private QuellingBlade() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 35;
        abilityCooldown = 4;
        abilityManaCost = 0;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        iD = 11;
        itemAliases = "quelling blade";
        itemCost = 225;
        itemQuality = "component";
        itemShopTags = "damage";
        key = "item_quelling_blade";
        model = "models/props_gameplay/quelling_blade.vmdl";
        sideShop = 1;
        cast_range_ward = 45;
        damage_bonus = 14;
        damage_bonus_ranged = 115;
        localizedName = "Quelling Blade";
        quelling_range_tooltip = 35;
    }

    public static QuellingBlade instance() {
        if( instance == null ){
            instance = new QuellingBlade();
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

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
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

    public int getCastRangeWard() {
        return cast_range_ward;
    }

    public int getDamageBonus() {
        return damage_bonus;
    }

    public int getDamageBonusRanged() {
        return damage_bonus_ranged;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getQuellingRangeTooltip() {
        return quelling_range_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof QuellingBlade))
            return false;
        if (object == this)
            return true;
        QuellingBlade otherObject = (QuellingBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
