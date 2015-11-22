package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Armlet extends Item {

    private static Armlet instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_armor;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final String localizedName;
    private final double toggle_cooldown;
    private final int unholy_bonus_attack_speed;
    private final int unholy_bonus_damage;
    private final int unholy_bonus_strength;
    private final int unholy_health_drain_per_second_tooltip;
    private final int unholy_health_drain_per_tick;

    private Armlet() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 0;
        iD = 151;
        itemAliases = "armlet of mordiggian";
        itemCost = 232;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","attack_speed","armor","regen_health","hard_to_tag"};
        key = "item_armlet";
        bonus_armor = 5;
        bonus_attack_speed = 25;
        bonus_damage = 9;
        bonus_health_regen = 7;
        localizedName = "Armlet Of Mordiggian";
        toggle_cooldown = .36;
        unholy_bonus_attack_speed = 0;
        unholy_bonus_damage = 31;
        unholy_bonus_strength = 25;
        unholy_health_drain_per_second_tooltip = 4;
        unholy_health_drain_per_tick = 4;
    }

    public static Armlet instance() {
        if( instance == null ){
            instance = new Armlet();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getToggleCooldown() {
        return toggle_cooldown;
    }

    public int getUnholyBonusAttackSpeed() {
        return unholy_bonus_attack_speed;
    }

    public int getUnholyBonusDamage() {
        return unholy_bonus_damage;
    }

    public int getUnholyBonusStrength() {
        return unholy_bonus_strength;
    }

    public int getUnholyHealthDrainPerSecondTooltip() {
        return unholy_health_drain_per_second_tooltip;
    }

    public int getUnholyHealthDrainPerTick() {
        return unholy_health_drain_per_tick;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Armlet))
            return false;
        if (object == this)
            return true;
        Armlet otherObject = (Armlet) object;
        return otherObject.getKey().equals(getKey());
    }

}
