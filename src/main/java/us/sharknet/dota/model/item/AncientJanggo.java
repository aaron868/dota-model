package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class AncientJanggo extends Item {

    private static AncientJanggo instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemDisplayCharges;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed_pct;
    private final int bonus_aura_attack_speed_pct;
    private final int bonus_aura_movement_speed_pct;
    private final int bonus_damage;
    private final int bonus_movement_speed_pct;
    private final int bonus_stats;
    private final int duration;
    private final String localizedName;
    private final int radius;

    private AncientJanggo() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 3;
        fightRecapLevel = 1;
        iD = 185;
        itemAliases = "drum of endurance";
        itemCost = 1850;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisplayCharges = 1;
        itemInitialCharges = 6;
        itemPermanent = 1;
        itemQuality = "rare";
        itemShopTags = new String[]{"str","agi","int","damage","move_speed","attack_speed","hard_to_tag"};
        key = "item_ancient_janggo";
        bonus_attack_speed_pct = 25;
        bonus_aura_attack_speed_pct = 5;
        bonus_aura_movement_speed_pct = 5;
        bonus_damage = 3;
        bonus_movement_speed_pct = 10;
        bonus_stats = 9;
        duration = 6;
        localizedName = "Drum Of Endurance";
        radius = 900;
    }

    public static AncientJanggo instance() {
        if( instance == null ){
            instance = new AncientJanggo();
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

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
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

    public int getBonusAttackSpeedPct() {
        return bonus_attack_speed_pct;
    }

    public int getBonusAuraAttackSpeedPct() {
        return bonus_aura_attack_speed_pct;
    }

    public int getBonusAuraMovementSpeedPct() {
        return bonus_aura_movement_speed_pct;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusMovementSpeedPct() {
        return bonus_movement_speed_pct;
    }

    public int getBonusStats() {
        return bonus_stats;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientJanggo))
            return false;
        if (object == this)
            return true;
        AncientJanggo otherObject = (AncientJanggo) object;
        return otherObject.getKey().equals(getKey());
    }

}
