package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerEssenceAura extends Ability {

    private static ObsidianDestroyerEssenceAura instance;

    private final String[] abilityBehavior;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int[] bonus_mana;
    private final int intelligence_bonus;
    private final int intelligence_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] restore_amount;
    private final int restore_chance;

    private ObsidianDestroyerEssenceAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5393;
        key = "obsidian_destroyer_essence_aura";
        bonus_mana = new int[]{75,150,225,300};
        intelligence_bonus = 4;
        intelligence_duration = 30;
        localizedName = "Essence Aura";
        ownerKey = "npc_dota_hero_obsidian_destroyer";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = 900;
        restore_amount = new double[]{10.0,15.0,20.0,25.0};
        restore_chance = 40;
    }

    public static ObsidianDestroyerEssenceAura instance() {
        if( instance == null ){
            instance = new ObsidianDestroyerEssenceAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusMana() {
        return bonus_mana;
    }

    public int getIntelligenceBonus() {
        return intelligence_bonus;
    }

    public int getIntelligenceDuration() {
        return intelligence_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }

    public double[] getRestoreAmount() {
        return restore_amount;
    }

    public int getRestoreChance() {
        return restore_chance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObsidianDestroyerEssenceAura))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyerEssenceAura otherObject = (ObsidianDestroyerEssenceAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
