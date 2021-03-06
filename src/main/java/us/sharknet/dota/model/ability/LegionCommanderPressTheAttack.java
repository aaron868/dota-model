package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LegionCommanderPressTheAttack extends Ability {

    private static LegionCommanderPressTheAttack instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_speed;
    private final int duration;
    private final int[] hp_regen;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LegionCommanderPressTheAttack() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{16.0,15.0,14.0,13.0};
        abilityManaCost = new int[]{110,110,110,110};
        abilityModifierSupportValue = 3;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5596;
        key = "legion_commander_press_the_attack";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        attack_speed = new int[]{60,80,100,120};
        duration = 5;
        hp_regen = new int[]{30,40,50,60};
        localizedName = "Press The Attack";
        ownerKey = "npc_dota_hero_legion_commander";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static LegionCommanderPressTheAttack instance() {
        if( instance == null ){
            instance = new LegionCommanderPressTheAttack();
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

    public int[] getAttackSpeed() {
        return attack_speed;
    }

    public int getDuration() {
        return duration;
    }

    public int[] getHpRegen() {
        return hp_regen;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LegionCommanderPressTheAttack))
            return false;
        if (object == this)
            return true;
        LegionCommanderPressTheAttack otherObject = (LegionCommanderPressTheAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
