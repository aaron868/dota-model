package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Sheepstick extends Item {

    private static Sheepstick instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final int bonus_intellect;
    private final int bonus_mana_regen;
    private final int bonus_strength;
    private final String localizedName;
    private final double sheep_duration;
    private final int sheep_movement_speed;

    private Sheepstick() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 800;
        abilityCooldown = 25;
        abilityManaCost = 100;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 96;
        itemAliases = new String[]{"hex","sheepstick","scythe of vyse"};
        itemCost = 5650;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","regen_mana","agi","hard_to_tag"};
        key = "item_sheepstick";
        bonus_agility = 10;
        bonus_intellect = 35;
        bonus_mana_regen = 150;
        bonus_strength = 10;
        localizedName = "Scythe Of Vyse";
        sheep_duration = 3.5;
        sheep_movement_speed = 14;
    }

    public static Sheepstick instance() {
        if( instance == null ){
            instance = new Sheepstick();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getSheepDuration() {
        return sheep_duration;
    }

    public int getSheepMovementSpeed() {
        return sheep_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Sheepstick))
            return false;
        if (object == this)
            return true;
        Sheepstick otherObject = (Sheepstick) object;
        return otherObject.getKey().equals(getKey());
    }

}
