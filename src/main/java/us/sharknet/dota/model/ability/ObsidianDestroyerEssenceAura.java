package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerEssenceAura extends Ability {

    private static ObsidianDestroyerEssenceAura instance;

    private final String[] abilityBehavior;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int[] bonus_mana;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double[] restore_amount;
    private final int restore_chance;

    private ObsidianDestroyerEssenceAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 5393;
        key = "obsidian_destroyer_essence_aura";
        bonus_mana = new int[]{75,150,225,300};
        localizedName = "Essence Aura";
        owningHeroShortKey = "obsidian_destroyer";
        radius = new int[]{1000,1000,1000,1000};
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
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
