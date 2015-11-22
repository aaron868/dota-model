package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HelmOfTheDominator extends Item {

    private static HelmOfTheDominator instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_regen;
    private final int dominate_duration;
    private final int health_min;
    private final int lifesteal_percent;
    private final String localizedName;

    private HelmOfTheDominator() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 700;
        abilityCooldown = 6;
        abilityManaCost = 75;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS","DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CREEP";
        iD = 164;
        itemAliases = new String[]{"hotd","helm of the dominator"};
        itemCost = 1800;
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","armor","unique","hard_to_tag"};
        key = "item_helm_of_the_dominator";
        bonus_armor = 5;
        bonus_damage = 20;
        bonus_regen = 3;
        dominate_duration = 12;
        health_min = 1400;
        lifesteal_percent = 15;
        localizedName = "Helm Of The Dominator";
    }

    public static HelmOfTheDominator instance() {
        if( instance == null ){
            instance = new HelmOfTheDominator();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetFlags() {
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusRegen() {
        return bonus_regen;
    }

    public int getDominateDuration() {
        return dominate_duration;
    }

    public int getHealthMin() {
        return health_min;
    }

    public int getLifestealPercent() {
        return lifesteal_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HelmOfTheDominator))
            return false;
        if (object == this)
            return true;
        HelmOfTheDominator otherObject = (HelmOfTheDominator) object;
        return otherObject.getKey().equals(getKey());
    }

}
