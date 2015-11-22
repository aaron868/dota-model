package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MedallionOfCourage extends Item {

    private static MedallionOfCourage instance;

    private final String abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int armor_reduction;
    private final int bonus_armor;
    private final int bonus_mana_regen_pct;
    private final int duration;
    private final String localizedName;
    private final int valor_cast_range_tooltip;

    private MedallionOfCourage() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastRange = 1;
        abilityCooldown = 7;
        abilitySharedCooldown = "medallion";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 187;
        itemAliases = "medallion of courage";
        itemCost = 12;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"armor","regen_mana","hard_to_tag"};
        key = "item_medallion_of_courage";
        armor_reduction = -7;
        bonus_armor = 7;
        bonus_mana_regen_pct = 5;
        duration = 7;
        localizedName = "Medallion Of Courage";
        valor_cast_range_tooltip = 1;
    }

    public static MedallionOfCourage instance() {
        if( instance == null ){
            instance = new MedallionOfCourage();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getArmorReduction() {
        return armor_reduction;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusManaRegenPct() {
        return bonus_mana_regen_pct;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getValorCastRangeTooltip() {
        return valor_cast_range_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MedallionOfCourage))
            return false;
        if (object == this)
            return true;
        MedallionOfCourage otherObject = (MedallionOfCourage) object;
        return otherObject.getKey().equals(getKey());
    }

}
