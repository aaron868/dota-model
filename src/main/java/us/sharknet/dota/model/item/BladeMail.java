package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BladeMail extends Item {

    private static BladeMail instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final double duration;
    private final String localizedName;

    private BladeMail() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 13;
        abilityManaCost = 25;
        iD = 127;
        itemAliases = "blade mail";
        itemCost = 2200;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","armor","int","hard_to_tag"};
        key = "item_blade_mail";
        bonus_armor = 6;
        bonus_damage = 22;
        bonus_intellect = 10;
        duration = 4.5;
        localizedName = "Blade Mail";
    }

    public static BladeMail instance() {
        if( instance == null ){
            instance = new BladeMail();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public double getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BladeMail))
            return false;
        if (object == this)
            return true;
        BladeMail otherObject = (BladeMail) object;
        return otherObject.getKey().equals(getKey());
    }

}
