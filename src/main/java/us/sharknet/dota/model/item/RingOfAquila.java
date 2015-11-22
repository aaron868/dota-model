package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfAquila extends Item {

    private static RingOfAquila instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String key;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final int aura_bonus_armor;
    private final double aura_mana_regen;
    private final int aura_radius;
    private final int bonus_agility;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int bonus_strength;
    private final String localizedName;

    private RingOfAquila() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE"};
        iD = 212;
        itemAliases = new String[]{"roa","ring of aquila"};
        itemCost = 1010;
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "rare";
        key = "item_ring_of_aquila";
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        aura_bonus_armor = 2;
        aura_mana_regen = .65;
        aura_radius = 900;
        bonus_agility = 9;
        bonus_armor = 1;
        bonus_damage = 9;
        bonus_intellect = 3;
        bonus_strength = 3;
        localizedName = "Ring Of Aquila";
    }

    public static RingOfAquila instance() {
        if( instance == null ){
            instance = new RingOfAquila();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getKey() {
        return key;
    }

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public int getAuraBonusArmor() {
        return aura_bonus_armor;
    }

    public double getAuraManaRegen() {
        return aura_mana_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RingOfAquila))
            return false;
        if (object == this)
            return true;
        RingOfAquila otherObject = (RingOfAquila) object;
        return otherObject.getKey().equals(getKey());
    }

}
