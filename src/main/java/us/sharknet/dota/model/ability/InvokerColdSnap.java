package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerColdSnap extends Ability {

    private static InvokerColdSnap instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int damage_trigger;
    private final double[] duration;
    private final double[] freeze_cooldown;
    private final double[] freeze_damage;
    private final double freeze_duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private InvokerColdSnap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCastRange = 1000;
        abilityCooldown = 20;
        abilityManaCost = 100;
        abilityModifierSupportValue = .15;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        hotKeyOverride = "Y";
        iD = 5376;
        key = "invoker_cold_snap";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_trigger = 1;
        duration = new double[]{3.0,3.5,4.0,4.5,5.0,5.5,6.0,6.5};
        freeze_cooldown = new double[]{0.77,0.74,0.71,0.69,0.66,0.63,0.6,0.57};
        freeze_damage = new double[]{7.0,14.0,21.0,28.0,35.0,42.0,49.0,56.0};
        freeze_duration = .4;
        localizedName = "Cold Snap";
        owningHeroShortKey = "invoker";
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

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public String getHotKeyOverride() {
        return hotKeyOverride;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
