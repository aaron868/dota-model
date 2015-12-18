package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HoodOfDefiance extends Item {

    private static HoodOfDefiance instance;

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
    private final int barrier_block;
    private final int barrier_duration;
    private final int bonus_health_regen;
    private final int bonus_spell_resist;
    private final String localizedName;
    private final int tooltip_resist;

    private HoodOfDefiance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 6;
        abilityManaCost = 75;
        iD = 131;
        itemAliases = "hood of defiance";
        itemCost = 2100;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"regen_health","magic_resist"};
        key = "item_hood_of_defiance";
        barrier_block = 325;
        barrier_duration = 12;
        bonus_health_regen = 9;
        bonus_spell_resist = 30;
        localizedName = "Hood Of Defiance";
        tooltip_resist = 30;
    }

    public static HoodOfDefiance instance() {
        if( instance == null ){
            instance = new HoodOfDefiance();
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

    public int getBarrierBlock() {
        return barrier_block;
    }

    public int getBarrierDuration() {
        return barrier_duration;
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
