package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Maelstrom extends Item {

    private static Maelstrom instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int chain_chance;
    private final double chain_cooldown;
    private final int chain_damage;
    private final double chain_delay;
    private final int chain_radius;
    private final int chain_strikes;
    private final String localizedName;

    private Maelstrom() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 166;
        itemAliases = "maelstrom";
        itemCost = 28;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","attack_speed","unique"};
        key = "item_maelstrom";
        bonus_attack_speed = 25;
        bonus_damage = 24;
        chain_chance = 25;
        chain_cooldown = 0.0;
        chain_damage = 12;
        chain_delay = .25;
        chain_radius = 9;
        chain_strikes = 4;
        localizedName = "Maelstrom";
    }

    public static Maelstrom instance() {
        if( instance == null ){
            instance = new Maelstrom();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getChainChance() {
        return chain_chance;
    }

    public double getChainCooldown() {
        return chain_cooldown;
    }

    public int getChainDamage() {
        return chain_damage;
    }

    public double getChainDelay() {
        return chain_delay;
    }

    public int getChainRadius() {
        return chain_radius;
    }

    public int getChainStrikes() {
        return chain_strikes;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Maelstrom))
            return false;
        if (object == this)
            return true;
        Maelstrom otherObject = (Maelstrom) object;
        return otherObject.getKey().equals(getKey());
    }

}
