package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnigmaDemonicConversion extends Ability {

    private static EnigmaDemonicConversion instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int duration_tooltip;
    private final int[] eidolon_dmg_tooltip;
    private final int[] eidolon_hp_tooltip;
    private final double[] life_extension;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] spawn_count;
    private final int[] split_attack_count;

    private EnigmaDemonicConversion() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 7;
        abilityCooldown = new double[]{35.0,35.0,35.0,35.0};
        abilityDuration = new double[]{35.0,35.0,35.0,35.0};
        abilityManaCost = new int[]{170,170,170,170};
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 5147;
        key = "enigma_demonic_conversion";
        duration_tooltip = 35;
        eidolon_dmg_tooltip = new int[]{20,28,38,47};
        eidolon_hp_tooltip = new int[]{180,200,220,240};
        life_extension = new double[]{2.0,2.0,2.0,2.0};
        localizedName = "Demonic Conversion";
        owningHeroShortKey = "enigma";
        spawn_count = new int[]{3,3,3,3};
        split_attack_count = new int[]{6,6,6,6};
    }

    public static EnigmaDemonicConversion instance() {
        if( instance == null ){
            instance = new EnigmaDemonicConversion();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public String getKey() {
        return key;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public int[] getEidolonDmgTooltip() {
        return eidolon_dmg_tooltip;
    }

    public int[] getEidolonHpTooltip() {
        return eidolon_hp_tooltip;
    }

    public double[] getLifeExtension() {
        return life_extension;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSpawnCount() {
        return spawn_count;
    }

    public int[] getSplitAttackCount() {
        return split_attack_count;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnigmaDemonicConversion))
            return false;
        if (object == this)
            return true;
        EnigmaDemonicConversion otherObject = (EnigmaDemonicConversion) object;
        return otherObject.getKey().equals(getKey());
    }

}
