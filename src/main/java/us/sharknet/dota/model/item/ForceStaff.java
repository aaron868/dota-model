package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ForceStaff extends Item {

    private static ForceStaff instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_health_regen;
    private final int bonus_intellect;
    private final String localizedName;
    private final int push_length;

    private ForceStaff() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 8;
        abilityCooldown = 2;
        abilityManaCost = 25;
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH","DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_CUSTOM"};
        fightRecapLevel = 1;
        iD = 12;
        itemAliases = new String[]{"fs","force staff"};
        itemCost = 225;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","damage","attack_speed","hard_to_tag"};
        key = "item_force_staff";
        bonus_health_regen = 4;
        bonus_intellect = 1;
        localizedName = "Force Staff";
        push_length = 6;
    }

    public static ForceStaff instance() {
        if( instance == null ){
            instance = new ForceStaff();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetTeam() {
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

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getPushLength() {
        return push_length;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ForceStaff))
            return false;
        if (object == this)
            return true;
        ForceStaff otherObject = (ForceStaff) object;
        return otherObject.getKey().equals(getKey());
    }

}
