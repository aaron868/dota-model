package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class InvisSword extends Item {

    private static InvisSword instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final String localizedName;
    private final int windwalk_bonus_damage;
    private final int windwalk_duration;
    private final double windwalk_fade_time;
    private final int windwalk_movement_speed;

    private InvisSword() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 28;
        abilityManaCost = 75;
        abilitySharedCooldown = "shadow_blade";
        fightRecapLevel = 1;
        iD = 152;
        itemAliases = new String[]{"sb","invis","shadow blade","silver edge"};
        itemCost = 2800;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","attack_speed","movespeed","hard_to_tag"};
        key = "item_invis_sword";
        bonus_attack_speed = 30;
        bonus_damage = 22;
        localizedName = "Shadow Blade";
        windwalk_bonus_damage = 175;
        windwalk_duration = 14;
        windwalk_fade_time = .3;
        windwalk_movement_speed = 20;
    }

    public static InvisSword instance() {
        if( instance == null ){
            instance = new InvisSword();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getWindwalkBonusDamage() {
        return windwalk_bonus_damage;
    }

    public int getWindwalkDuration() {
        return windwalk_duration;
    }

    public double getWindwalkFadeTime() {
        return windwalk_fade_time;
    }

    public int getWindwalkMovementSpeed() {
        return windwalk_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvisSword))
            return false;
        if (object == this)
            return true;
        InvisSword otherObject = (InvisSword) object;
        return otherObject.getKey().equals(getKey());
    }

}
