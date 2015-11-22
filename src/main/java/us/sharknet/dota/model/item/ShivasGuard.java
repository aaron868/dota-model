package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ShivasGuard extends Item {

    private static ShivasGuard instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int aura_attack_speed;
    private final int aura_radius;
    private final int blast_damage;
    private final int blast_debuff_duration;
    private final int blast_movement_speed;
    private final int blast_radius;
    private final int blast_speed;
    private final int bonus_armor;
    private final int bonus_intellect;
    private final String localizedName;

    private ShivasGuard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 30;
        abilityManaCost = 100;
        fightRecapLevel = 1;
        iD = 119;
        itemAliases = "shiva's guard";
        itemCost = 4700;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "epic";
        itemShopTags = new String[]{"int","armor","hard_to_tag"};
        key = "item_shivas_guard";
        aura_attack_speed = -45;
        aura_radius = 900;
        blast_damage = 200;
        blast_debuff_duration = 4;
        blast_movement_speed = -40;
        blast_radius = 900;
        blast_speed = 350;
        bonus_armor = 15;
        bonus_intellect = 30;
        localizedName = "Shiva's Guard";
    }

    public static ShivasGuard instance() {
        if( instance == null ){
            instance = new ShivasGuard();
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

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
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

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBlastDamage() {
        return blast_damage;
    }

    public int getBlastDebuffDuration() {
        return blast_debuff_duration;
    }

    public int getBlastMovementSpeed() {
        return blast_movement_speed;
    }

    public int getBlastRadius() {
        return blast_radius;
    }

    public int getBlastSpeed() {
        return blast_speed;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShivasGuard))
            return false;
        if (object == this)
            return true;
        ShivasGuard otherObject = (ShivasGuard) object;
        return otherObject.getKey().equals(getKey());
    }

}
