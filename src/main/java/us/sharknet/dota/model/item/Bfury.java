package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Bfury extends Item {

    private static Bfury instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final int bonus_mana_regen;
    private final int cast_range_tooltip;
    private final int cast_range_ward;
    private final int cleave_damage_percent;
    private final int cleave_radius;
    private final String localizedName;
    private final int quelling_bonus;
    private final int quelling_bonus_ranged;

    private Bfury() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 350;
        abilityCooldown = 4;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        iD = 145;
        itemAliases = new String[]{"bf","battle fury"};
        itemCost = 4525;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","health_regen","mana_regen","hard_to_tag"};
        key = "item_bfury";
        bonus_damage = 55;
        bonus_health_regen = 6;
        bonus_mana_regen = 150;
        cast_range_tooltip = 350;
        cast_range_ward = 450;
        cleave_damage_percent = 35;
        cleave_radius = 280;
        localizedName = "Battle Fury";
        quelling_bonus = 160;
        quelling_bonus_ranged = 125;
    }

    public static Bfury instance() {
        if( instance == null ){
            instance = new Bfury();
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

    public String[] getAbilityUnitTargetType() {
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

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public int getCastRangeWard() {
        return cast_range_ward;
    }

    public int getCleaveDamagePercent() {
        return cleave_damage_percent;
    }

    public int getCleaveRadius() {
        return cleave_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getQuellingBonus() {
        return quelling_bonus;
    }

    public int getQuellingBonusRanged() {
        return quelling_bonus_ranged;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bfury))
            return false;
        if (object == this)
            return true;
        Bfury otherObject = (Bfury) object;
        return otherObject.getKey().equals(getKey());
    }

}
