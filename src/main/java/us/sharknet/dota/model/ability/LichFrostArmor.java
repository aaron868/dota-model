package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LichFrostArmor extends Ability {

    private static LichFrostArmor instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_bonus;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] slow_attack_speed;
    private final double[] slow_duration;
    private final int[] slow_movement_speed;

    private LichFrostArmor() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{5.0,5.0,5.0,5.0};
        abilityDuration = new double[]{40.0,40.0,40.0,40.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityModifierSupportValue = .3;
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_BUILDING"};
        iD = 5135;
        key = "lich_frost_armor";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        armor_bonus = new int[]{3,5,7,9};
        localizedName = "Frost Armor";
        ownerKey = "npc_dota_hero_lich";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_attack_speed = new int[]{-20,-20,-20,-20};
        slow_duration = new double[]{2.0,2.0,2.0,2.0};
        slow_movement_speed = new int[]{-30,-30,-30,-30};
    }

    public static LichFrostArmor instance() {
        if( instance == null ){
            instance = new LichFrostArmor();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getArmorBonus() {
        return armor_bonus;
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

    public int[] getSlowAttackSpeed() {
        return slow_attack_speed;
    }

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public int[] getSlowMovementSpeed() {
        return slow_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LichFrostArmor))
            return false;
        if (object == this)
            return true;
        LichFrostArmor otherObject = (LichFrostArmor) object;
        return otherObject.getKey().equals(getKey());
    }

}
