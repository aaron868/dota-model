package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Refresher extends Item {

    private static Refresher instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final int bonus_mana_regen;
    private final String localizedName;

    private Refresher() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = 0;
        abilityCooldown = 195;
        abilityManaCost = 375;
        iD = 110;
        itemAliases = "refresher orb";
        itemCost = 5200;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"regen_health","regen_mana","hard_to_tag"};
        key = "item_refresher";
        bonus_damage = 20;
        bonus_health_regen = 10;
        bonus_mana_regen = 250;
        localizedName = "Refresher Orb";
    }

    public static Refresher instance() {
        if( instance == null ){
            instance = new Refresher();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Refresher))
            return false;
        if (object == this)
            return true;
        Refresher otherObject = (Refresher) object;
        return otherObject.getKey().equals(getKey());
    }

}
