package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RodOfAtos extends Item {

    private static RodOfAtos instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_health;
    private final int bonus_intellect;
    private final int bonus_movement_speed;
    private final int duration;
    private final String localizedName;
    private final int slow;

    private RodOfAtos() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 1200;
        abilityCooldown = 10;
        abilityManaCost = 50;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 206;
        itemAliases = "rod of atos";
        itemCost = 3100;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","regen_health"};
        key = "item_rod_of_atos";
        bonus_attack_speed = 0;
        bonus_damage = 0;
        bonus_health = 350;
        bonus_intellect = 30;
        bonus_movement_speed = 0;
        duration = 4;
        localizedName = "Rod Of Atos";
        slow = 60;
    }

    public static RodOfAtos instance() {
        if( instance == null ){
            instance = new RodOfAtos();
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

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getSlow() {
        return slow;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RodOfAtos))
            return false;
        if (object == this)
            return true;
        RodOfAtos otherObject = (RodOfAtos) object;
        return otherObject.getKey().equals(getKey());
    }

}
