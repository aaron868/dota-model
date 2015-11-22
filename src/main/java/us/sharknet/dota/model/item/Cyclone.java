package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Cyclone extends Item {

    private static Cyclone instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_intellect;
    private final int bonus_mana_regen;
    private final int bonus_movement_speed;
    private final int cast_range_tooltip;
    private final double cyclone_duration;
    private final String localizedName;

    private Cyclone() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 575;
        abilityCooldown = 23;
        abilityManaCost = 175;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        fightRecapLevel = 1;
        iD = 1;
        itemAliases = new String[]{"cyclone euls","eul's scepter of divinity"};
        itemCost = 2825;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","regen_mana","move_speed","hard_to_tag"};
        key = "item_cyclone";
        bonus_intellect = 1;
        bonus_mana_regen = 15;
        bonus_movement_speed = 4;
        cast_range_tooltip = 575;
        cyclone_duration = 2.5;
        localizedName = "Eul's Scepter Of Divinity";
    }

    public static Cyclone instance() {
        if( instance == null ){
            instance = new Cyclone();
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

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double getCycloneDuration() {
        return cyclone_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Cyclone))
            return false;
        if (object == this)
            return true;
        Cyclone otherObject = (Cyclone) object;
        return otherObject.getKey().equals(getKey());
    }

}
