package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Assault extends Item {

    private static Assault instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int aura_attack_speed;
    private final int aura_negative_armor;
    private final int aura_positive_armor;
    private final int aura_radius;
    private final int bonus_armor;
    private final int bonus_attack_speed;
    private final String localizedName;

    private Assault() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 112;
        itemAliases = new String[]{"ac","assault cuirass"};
        itemCost = 5250;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"attack_speed","armor","hard_to_tag"};
        key = "item_assault";
        aura_attack_speed = 20;
        aura_negative_armor = -5;
        aura_positive_armor = 5;
        aura_radius = 900;
        bonus_armor = 10;
        bonus_attack_speed = 35;
        localizedName = "Assault Cuirass";
    }

    public static Assault instance() {
        if( instance == null ){
            instance = new Assault();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getAuraAttackSpeed() {
        return aura_attack_speed;
    }

    public int getAuraNegativeArmor() {
        return aura_negative_armor;
    }

    public int getAuraPositiveArmor() {
        return aura_positive_armor;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Assault))
            return false;
        if (object == this)
            return true;
        Assault otherObject = (Assault) object;
        return otherObject.getKey().equals(getKey());
    }

}
