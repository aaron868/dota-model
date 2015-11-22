package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Orchid extends Item {

    private static Orchid instance;

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
    private final int bonus_intellect;
    private final int bonus_mana_regen;
    private final String localizedName;
    private final int silence_damage_percent;
    private final int silence_duration;

    private Orchid() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 9;
        abilityCooldown = 18;
        abilityManaCost = 1;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 98;
        itemAliases = "orchid malevolence";
        itemCost = 475;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","attack_speed","damage","regen_mana","damage","hard_to_tag"};
        key = "item_orchid";
        bonus_attack_speed = 3;
        bonus_damage = 3;
        bonus_intellect = 25;
        bonus_mana_regen = 15;
        localizedName = "Orchid Malevolence";
        silence_damage_percent = 3;
        silence_duration = 5;
    }

    public static Orchid instance() {
        if( instance == null ){
            instance = new Orchid();
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

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getSilenceDamagePercent() {
        return silence_damage_percent;
    }

    public int getSilenceDuration() {
        return silence_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Orchid))
            return false;
        if (object == this)
            return true;
        Orchid otherObject = (Orchid) object;
        return otherObject.getKey().equals(getKey());
    }

}
