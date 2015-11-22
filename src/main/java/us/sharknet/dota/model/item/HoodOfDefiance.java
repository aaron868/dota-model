package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HoodOfDefiance extends Item {

    private static HoodOfDefiance instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_health_regen;
    private final int bonus_spell_resist;
    private final String localizedName;
    private final int tooltip_resist;

    private HoodOfDefiance() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 131;
        itemAliases = "hood of defiance";
        itemCost = 21;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"regen_health","magic_resist"};
        key = "item_hood_of_defiance";
        bonus_health_regen = 9;
        bonus_spell_resist = 3;
        localizedName = "Hood Of Defiance";
        tooltip_resist = 3;
    }

    public static HoodOfDefiance instance() {
        if( instance == null ){
            instance = new HoodOfDefiance();
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

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusSpellResist() {
        return bonus_spell_resist;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTooltipResist() {
        return tooltip_resist;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HoodOfDefiance))
            return false;
        if (object == this)
            return true;
        HoodOfDefiance otherObject = (HoodOfDefiance) object;
        return otherObject.getKey().equals(getKey());
    }

}
