package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Satanic extends Item {

    private static Satanic instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_strength;
    private final int lifesteal_percent;
    private final String localizedName;
    private final int unholy_duration;
    private final int unholy_lifesteal_percent;
    private final int unholy_lifesteal_total_tooltip;

    private Satanic() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 35;
        fightRecapLevel = 2;
        iD = 156;
        itemAliases = "satanic";
        itemCost = 59;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","str","armor","unique","hard_to_tag"};
        key = "item_satanic";
        bonus_armor = 5;
        bonus_damage = 2;
        bonus_strength = 25;
        lifesteal_percent = 25;
        localizedName = "Satanic";
        unholy_duration = 4;
        unholy_lifesteal_percent = 175;
        unholy_lifesteal_total_tooltip = 2;
    }

    public static Satanic instance() {
        if( instance == null ){
            instance = new Satanic();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int getBonusStrength() {
        return bonus_strength;
    }

    public int getLifestealPercent() {
        return lifesteal_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getUnholyDuration() {
        return unholy_duration;
    }

    public int getUnholyLifestealPercent() {
        return unholy_lifesteal_percent;
    }

    public int getUnholyLifestealTotalTooltip() {
        return unholy_lifesteal_total_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Satanic))
            return false;
        if (object == this)
            return true;
        Satanic otherObject = (Satanic) object;
        return otherObject.getKey().equals(getKey());
    }

}
