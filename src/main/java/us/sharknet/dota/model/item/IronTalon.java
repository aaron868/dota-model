package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class IronTalon extends Item {

    private static IronTalon instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int alternative_cooldown;
    private final int bonus_armor;
    private final int cast_range_ward;
    private final int creep_damage_pct;
    private final int damage_bonus;
    private final int damage_bonus_ranged;
    private final String localizedName;
    private final int quelling_range_tooltip;

    private IronTalon() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 350;
        abilityCooldown = 14;
        abilityManaCost = 0;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_PREFER_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        iD = 239;
        itemAliases = "quelling blade";
        itemCost = 500;
        itemQuality = "common";
        itemShopTags = "damage";
        key = "item_iron_talon";
        alternative_cooldown = 4;
        bonus_armor = 2;
        cast_range_ward = 450;
        creep_damage_pct = 40;
        damage_bonus = 140;
        damage_bonus_ranged = 115;
        localizedName = "Iron Talon";
        quelling_range_tooltip = 350;
    }

    public static IronTalon instance() {
        if( instance == null ){
            instance = new IronTalon();
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getAlternativeCooldown() {
        return alternative_cooldown;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getCastRangeWard() {
        return cast_range_ward;
    }

    public int getCreepDamagePct() {
        return creep_damage_pct;
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
        if (!(object instanceof IronTalon))
            return false;
        if (object == this)
            return true;
        IronTalon otherObject = (IronTalon) object;
        return otherObject.getKey().equals(getKey());
    }

}
