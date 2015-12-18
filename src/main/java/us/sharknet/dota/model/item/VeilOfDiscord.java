package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class VeilOfDiscord extends Item {

    private static VeilOfDiscord instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agi;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final int bonus_int;
    private final int bonus_str;
    private final int debuff_radius;
    private final String localizedName;
    private final int resist_debuff;
    private final int resist_debuff_duration;

    private VeilOfDiscord() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_DONT_CANCEL_MOVEMENT"};
        abilityCastPoint = 0;
        abilityCastRange = 1000;
        abilityCooldown = 20;
        abilityManaCost = 50;
        iD = 190;
        itemAliases = new String[]{"vod","veil of discord"};
        itemCost = 2270;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","armor","regen_health","hard_to_tag"};
        key = "item_veil_of_discord";
        bonus_agi = 6;
        bonus_armor = 6;
        bonus_damage = 6;
        bonus_health_regen = 6;
        bonus_int = 18;
        bonus_str = 6;
        debuff_radius = 600;
        localizedName = "Veil Of Discord";
        resist_debuff = -25;
        resist_debuff_duration = 16;
    }

    public static VeilOfDiscord instance() {
        if( instance == null ){
            instance = new VeilOfDiscord();
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

    public int getBonusAgi() {
        return bonus_agi;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusInt() {
        return bonus_int;
    }

    public int getBonusStr() {
        return bonus_str;
    }

    public int getDebuffRadius() {
        return debuff_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getResistDebuff() {
        return resist_debuff;
    }

    public int getResistDebuffDuration() {
        return resist_debuff_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VeilOfDiscord))
            return false;
        if (object == this)
            return true;
        VeilOfDiscord otherObject = (VeilOfDiscord) object;
        return otherObject.getKey().equals(getKey());
    }

}
