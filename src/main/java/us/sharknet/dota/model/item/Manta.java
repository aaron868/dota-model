package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Manta extends Item {

    private static Manta instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final int bonus_intellect;
    private final int bonus_movement_speed;
    private final int bonus_strength;
    private final int cooldown_melee;
    private final int cooldown_ranged_tooltip;
    private final int images_count;
    private final int images_do_damage_percent_melee;
    private final int images_do_damage_percent_ranged;
    private final int images_take_damage_percent_melee;
    private final int images_take_damage_percent_ranged;
    private final double invuln_duration;
    private final String localizedName;
    private final int tooltip_damage_incoming_melee_total_pct;
    private final int tooltip_damage_incoming_ranged_total_pct;
    private final int tooltip_damage_outgoing_melee;
    private final int tooltip_damage_outgoing_ranged;
    private final int tooltip_illusion_duration;
    private final int vision_radius;

    private Manta() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCooldown = 45;
        abilityManaCost = 125;
        iD = 147;
        itemAliases = "manta style";
        itemCost = 495;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "epic";
        itemShopTags = new String[]{"agi","str","int","attack_speed","move_speed","hard_to_tag"};
        key = "item_manta";
        bonus_agility = 26;
        bonus_attack_speed = 15;
        bonus_intellect = 1;
        bonus_movement_speed = 1;
        bonus_strength = 1;
        cooldown_melee = 3;
        cooldown_ranged_tooltip = 45;
        images_count = 2;
        images_do_damage_percent_melee = -67;
        images_do_damage_percent_ranged = -72;
        images_take_damage_percent_melee = 25;
        images_take_damage_percent_ranged = 3;
        invuln_duration = .1;
        localizedName = "Manta Style";
        tooltip_damage_incoming_melee_total_pct = 35;
        tooltip_damage_incoming_ranged_total_pct = 4;
        tooltip_damage_outgoing_melee = 33;
        tooltip_damage_outgoing_ranged = 28;
        tooltip_illusion_duration = 2;
        vision_radius = 1;
    }

    public static Manta instance() {
        if( instance == null ){
            instance = new Manta();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public int getCooldownMelee() {
        return cooldown_melee;
    }

    public int getCooldownRangedTooltip() {
        return cooldown_ranged_tooltip;
    }

    public int getImagesCount() {
        return images_count;
    }

    public int getImagesDoDamagePercentMelee() {
        return images_do_damage_percent_melee;
    }

    public int getImagesDoDamagePercentRanged() {
        return images_do_damage_percent_ranged;
    }

    public int getImagesTakeDamagePercentMelee() {
        return images_take_damage_percent_melee;
    }

    public int getImagesTakeDamagePercentRanged() {
        return images_take_damage_percent_ranged;
    }

    public double getInvulnDuration() {
        return invuln_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTooltipDamageIncomingMeleeTotalPct() {
        return tooltip_damage_incoming_melee_total_pct;
    }

    public int getTooltipDamageIncomingRangedTotalPct() {
        return tooltip_damage_incoming_ranged_total_pct;
    }

    public int getTooltipDamageOutgoingMelee() {
        return tooltip_damage_outgoing_melee;
    }

    public int getTooltipDamageOutgoingRanged() {
        return tooltip_damage_outgoing_ranged;
    }

    public int getTooltipIllusionDuration() {
        return tooltip_illusion_duration;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Manta))
            return false;
        if (object == this)
            return true;
        Manta otherObject = (Manta) object;
        return otherObject.getKey().equals(getKey());
    }

}
