package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerColdSnap extends Ability {

    private static InvokerColdSnap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage_trigger;
    private final double[] duration;
    private final double[] freeze_cooldown;
    private final double[] freeze_damage;
    private final double freeze_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerColdSnap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{20,20,20,20};
        abilityManaCost = new int[]{100,100,100,100};
        abilityModifierSupportValue = .15;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5376;
        key = "invoker_cold_snap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_trigger = 1;
        duration = new double[]{3.0,3.5,4.0,4.5,5.0,5.5,6.0,6.5};
        freeze_cooldown = new double[]{0.77,0.74,0.71,0.69,0.66,0.63,0.6,0.57};
        freeze_damage = new double[]{7.0,14.0,21.0,28.0,35.0,42.0,49.0,56.0};
        freeze_duration = .4;
        localizedName = "Cold Snap";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerColdSnap instance() {
        if( instance == null ){
            instance = new InvokerColdSnap();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getDamageTrigger() {
        return damage_trigger;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getFreezeCooldown() {
        return freeze_cooldown;
    }

    public double[] getFreezeDamage() {
        return freeze_damage;
    }

    public double getFreezeDuration() {
        return freeze_duration;
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
        if (!(object instanceof InvokerColdSnap))
            return false;
        if (object == this)
            return true;
        InvokerColdSnap otherObject = (InvokerColdSnap) object;
        return otherObject.getKey().equals(getKey());
    }

}
