package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AxeBattleHunger extends Ability {

    private static AxeBattleHunger instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int slow;
    private final int speed_bonus;

    private AxeBattleHunger() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{750,750,750,750};
        abilityCooldown = new double[]{20.0,15.0,10.0,5.0};
        abilityDamage = new int[]{16,24,32,40};
        abilityManaCost = new int[]{75,75,75,75};
        abilityModifierSupportValue = .1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5008;
        key = "axe_battle_hunger";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 1;
        localizedName = "Battle Hunger";
        ownerKey = "npc_dota_hero_axe";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow = -12;
        speed_bonus = 12;
    }

    public static AxeBattleHunger instance() {
        if( instance == null ){
            instance = new AxeBattleHunger();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getDuration() {
        return duration;
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

    public int getSlow() {
        return slow;
    }

    public int getSpeedBonus() {
        return speed_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AxeBattleHunger))
            return false;
        if (object == this)
            return true;
        AxeBattleHunger otherObject = (AxeBattleHunger) object;
        return otherObject.getKey().equals(getKey());
    }

}
