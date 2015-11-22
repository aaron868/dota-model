package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BlackKingBar extends Item {

    private static BlackKingBar instance;

    private final String[] abilityBehavior;
    private final int[] abilityCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final int itemSellable;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int bonus_strength;
    private final double[] duration;
    private final String localizedName;
    private final int max_level;
    private final int model_scale;

    private BlackKingBar() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = new int[]{80,75,70,65,60,55};
        fightRecapLevel = 2;
        iD = 116;
        itemAliases = new String[]{"bkb","black king bar"};
        itemCost = 3975;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemSellable = 1;
        itemShopTags = new String[]{"str","damage","hard_to_tag"};
        key = "item_black_king_bar";
        bonus_damage = 24;
        bonus_strength = 1;
        duration = new double[]{10.0,9.0,8.0,7.0,6.0,5.0};
        localizedName = "Black King Bar";
        max_level = 6;
        model_scale = 3;
    }

    public static BlackKingBar instance() {
        if( instance == null ){
            instance = new BlackKingBar();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int getItemSellable() {
        return itemSellable;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxLevel() {
        return max_level;
    }

    public int getModelScale() {
        return model_scale;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlackKingBar))
            return false;
        if (object == this)
            return true;
        BlackKingBar otherObject = (BlackKingBar) object;
        return otherObject.getKey().equals(getKey());
    }

}
