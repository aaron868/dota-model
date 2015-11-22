package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Pipe extends Item {

    private static Pipe instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final int itemAlertable;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int aura_health_regen;
    private final int aura_radius;
    private final int barrier_block;
    private final int barrier_block_creep;
    private final int barrier_debuff_duration;
    private final int barrier_duration;
    private final int barrier_radius;
    private final int bonus_all_stats;
    private final int health_regen;
    private final String localizedName;
    private final int magic_resistance;
    private final int magic_resistance_aura;
    private final int tooltip_resist;

    private Pipe() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 6;
        abilityManaCost = 1;
        fightRecapLevel = 2;
        iD = 9;
        itemAlertable = 1;
        itemAliases = "pipe of insight";
        itemCost = 35;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"regen_health","boost_magic_resist"};
        key = "item_pipe";
        aura_health_regen = 4;
        aura_radius = 9;
        barrier_block = 4;
        barrier_block_creep = 4;
        barrier_debuff_duration = 5;
        barrier_duration = 12;
        barrier_radius = 9;
        bonus_all_stats = 0;
        health_regen = 9;
        localizedName = "Pipe Of Insight";
        magic_resistance = 3;
        magic_resistance_aura = 1;
        tooltip_resist = 3;
    }

    public static Pipe instance() {
        if( instance == null ){
            instance = new Pipe();
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public int getItemAlertable() {
        return itemAlertable;
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

    public int getAuraHealthRegen() {
        return aura_health_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBarrierBlock() {
        return barrier_block;
    }

    public int getBarrierBlockCreep() {
        return barrier_block_creep;
    }

    public int getBarrierDebuffDuration() {
        return barrier_debuff_duration;
    }

    public int getBarrierDuration() {
        return barrier_duration;
    }

    public int getBarrierRadius() {
        return barrier_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getHealthRegen() {
        return health_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMagicResistance() {
        return magic_resistance;
    }

    public int getMagicResistanceAura() {
        return magic_resistance_aura;
    }

    public int getTooltipResist() {
        return tooltip_resist;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Pipe))
            return false;
        if (object == this)
            return true;
        Pipe otherObject = (Pipe) object;
        return otherObject.getKey().equals(getKey());
    }

}
