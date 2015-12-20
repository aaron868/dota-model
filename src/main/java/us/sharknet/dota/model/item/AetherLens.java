package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class AetherLens extends Item {

    private static AetherLens instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_health_regen;
    private final int bonus_magical_armor;
    private final int bonus_mana;
    private final int cast_range_bonus;
    private final String localizedName;
    private final int spell_amp;

    private AetherLens() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 232;
        itemAliases = "aether lens";
        itemCost = 2350;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","regen_mana","move_speed","hard_to_tag"};
        key = "item_aether_lens";
        bonus_health_regen = 8;
        bonus_magical_armor = 15;
        bonus_mana = 250;
        cast_range_bonus = 200;
        localizedName = " Aether Lens";
        spell_amp = 8;
    }

    public static AetherLens instance() {
        if( instance == null ){
            instance = new AetherLens();
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

    public int getBonusMagicalArmor() {
        return bonus_magical_armor;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getCastRangeBonus() {
        return cast_range_bonus;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getSpellAmp() {
        return spell_amp;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AetherLens))
            return false;
        if (object == this)
            return true;
        AetherLens otherObject = (AetherLens) object;
        return otherObject.getKey().equals(getKey());
    }

}
