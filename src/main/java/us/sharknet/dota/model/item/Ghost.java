package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Ghost extends Item {

    private static Ghost instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final String abilitySharedCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_all_stats;
    private final int duration;
    private final int extra_spell_damage_percent;
    private final String localizedName;

    private Ghost() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 3;
        abilitySharedCooldown = "ethereal";
        fightRecapLevel = 1;
        iD = 37;
        itemAliases = "ghost scepter";
        itemCost = 1500;
        itemQuality = "component";
        itemShopTags = new String[]{"int","agi","str","hard_to_tag"};
        key = "item_ghost";
        bonus_all_stats = 5;
        duration = 4;
        extra_spell_damage_percent = -40;
        localizedName = "Ghost Scepter";
    }

    public static Ghost instance() {
        if( instance == null ){
            instance = new Ghost();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
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

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getDuration() {
        return duration;
    }

    public int getExtraSpellDamagePercent() {
        return extra_spell_damage_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Ghost))
            return false;
        if (object == this)
            return true;
        Ghost otherObject = (Ghost) object;
        return otherObject.getKey().equals(getKey());
    }

}
