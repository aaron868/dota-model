package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class UltimateScepter extends Item {

    private static UltimateScepter instance;

    private final String abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_health;
    private final int bonus_mana;
    private final String localizedName;

    private UltimateScepter() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCastRange = 6;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 18;
        itemAliases = new String[]{"ultimate","aghanim's scepter"};
        itemCost = 42;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","str","agi","mana_pool","health_pool","hard_to_tag"};
        key = "item_ultimate_scepter";
        bonus_all_stats = 1;
        bonus_health = 2;
        bonus_mana = 15;
        localizedName = "Aghanim's Scepter";
    }

    public static UltimateScepter instance() {
        if( instance == null ){
            instance = new UltimateScepter();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UltimateScepter))
            return false;
        if (object == this)
            return true;
        UltimateScepter otherObject = (UltimateScepter) object;
        return otherObject.getKey().equals(getKey());
    }

}
