package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerAlacrity extends Ability {

    private static InvokerAlacrity instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_speed;
    private final int[] bonus_damage;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerAlacrity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{650,650,650,650};
        abilityCooldown = new double[]{15,15,15,15};
        abilityManaCost = new int[]{45,45,45,45};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5384;
        key = "invoker_alacrity";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        bonus_attack_speed = new int[]{10,25,40,55,70,85,100,115};
        bonus_damage = new int[]{10,25,40,55,70,85,100,115};
        duration = 9;
        localizedName = "Alacrity";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerAlacrity instance() {
        if( instance == null ){
            instance = new InvokerAlacrity();
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerAlacrity))
            return false;
        if (object == this)
            return true;
        InvokerAlacrity otherObject = (InvokerAlacrity) object;
        return otherObject.getKey().equals(getKey());
    }

}
