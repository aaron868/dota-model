package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MaskOfMadness extends Item {

    private static MaskOfMadness instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int berserk_bonus_attack_speed;
    private final int berserk_bonus_movement_speed;
    private final int berserk_duration;
    private final int berserk_extra_damage;
    private final int lifesteal_percent;
    private final String localizedName;

    private MaskOfMadness() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 25;
        abilityManaCost = 25;
        fightRecapLevel = 1;
        iD = 172;
        itemAliases = new String[]{"mom","mask of madness"};
        itemCost = 1800;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "artifact";
        itemShopTags = new String[]{"unique","hard_to_tag"};
        key = "item_mask_of_madness";
        berserk_bonus_attack_speed = 100;
        berserk_bonus_movement_speed = 17;
        berserk_duration = 12;
        berserk_extra_damage = 30;
        lifesteal_percent = 20;
        localizedName = "Mask Of Madness";
    }

    public static MaskOfMadness instance() {
        if( instance == null ){
            instance = new MaskOfMadness();
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

    public int getBerserkBonusAttackSpeed() {
        return berserk_bonus_attack_speed;
    }

    public int getBerserkBonusMovementSpeed() {
        return berserk_bonus_movement_speed;
    }

    public int getBerserkDuration() {
        return berserk_duration;
    }

    public int getBerserkExtraDamage() {
        return berserk_extra_damage;
    }

    public int getLifestealPercent() {
        return lifesteal_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MaskOfMadness))
            return false;
        if (object == this)
            return true;
        MaskOfMadness otherObject = (MaskOfMadness) object;
        return otherObject.getKey().equals(getKey());
    }

}
