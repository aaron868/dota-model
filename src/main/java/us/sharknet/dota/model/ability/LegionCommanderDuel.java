package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LegionCommanderDuel extends Ability {

    private static LegionCommanderDuel instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final double[] duration_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] reward_damage;

    private LegionCommanderDuel() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{50.0,50.0,50.0};
        abilityManaCost = new int[]{75,75,75};
        abilityModifierSupportValue = 3;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5598;
        key = "legion_commander_duel";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{4.0,4.75,5.5};
        duration_scepter = new double[]{4.75,5.5,6.25};
        localizedName = "Duel";
        ownerKey = "npc_dota_hero_legion_commander";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        reward_damage = new int[]{10,14,18};
    }

    public static LegionCommanderDuel instance() {
        if( instance == null ){
            instance = new LegionCommanderDuel();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getDurationScepter() {
        return duration_scepter;
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

    public int[] getRewardDamage() {
        return reward_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LegionCommanderDuel))
            return false;
        if (object == this)
            return true;
        LegionCommanderDuel otherObject = (LegionCommanderDuel) object;
        return otherObject.getKey().equals(getKey());
    }

}
