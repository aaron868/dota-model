package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Radiance extends Item {

    private static Radiance instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int aura_damage;
    private final int aura_radius;
    private final int blind_pct;
    private final int bonus_damage;
    private final String localizedName;

    private Radiance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE"};
        iD = 137;
        itemAliases = "radiance";
        itemCost = 515;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = "damage";
        key = "item_radiance";
        aura_damage = 5;
        aura_radius = 7;
        blind_pct = 17;
        bonus_damage = 65;
        localizedName = "Radiance";
    }

    public static Radiance instance() {
        if( instance == null ){
            instance = new Radiance();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getAuraDamage() {
        return aura_damage;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBlindPct() {
        return blind_pct;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Radiance))
            return false;
        if (object == this)
            return true;
        Radiance otherObject = (Radiance) object;
        return otherObject.getKey().equals(getKey());
    }

}
