package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Basher extends Item {

    private static Basher instance;

    private final String abilityBehavior;
    private final double abilityCooldown;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bash_chance_melee;
    private final int bash_chance_ranged;
    private final double bash_cooldown;
    private final double bash_duration;
    private final int bonus_chance_damage;
    private final int bonus_damage;
    private final int bonus_strength;
    private final String localizedName;

    private Basher() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 2.3;
        iD = 143;
        itemAliases = "skull basher";
        itemCost = 2950;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","str","hard_to_tag"};
        key = "item_basher";
        bash_chance_melee = 25;
        bash_chance_ranged = 10;
        bash_cooldown = 2.3;
        bash_duration = 1.4;
        bonus_chance_damage = 60;
        bonus_damage = 25;
        bonus_strength = 8;
        localizedName = "Skull Basher";
    }

    public static Basher instance() {
        if( instance == null ){
            instance = new Basher();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
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

    public int getBashChanceMelee() {
        return bash_chance_melee;
    }

    public int getBashChanceRanged() {
        return bash_chance_ranged;
    }

    public double getBashCooldown() {
        return bash_cooldown;
    }

    public double getBashDuration() {
        return bash_duration;
    }

    public int getBonusChanceDamage() {
        return bonus_chance_damage;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Basher))
            return false;
        if (object == this)
            return true;
        Basher otherObject = (Basher) object;
        return otherObject.getKey().equals(getKey());
    }

}
