package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NightStalkerVoid extends Ability {

    private static NightStalkerVoid instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attackspeed_slow;
    private final double[] duration_day;
    private final double[] duration_night;
    private final String localizedName;
    private final int[] movespeed_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NightStalkerVoid() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{525,525,525,525};
        abilityCooldown = new double[]{8,8,8,8};
        abilityDamage = new int[]{90,160,255,335};
        abilityManaCost = new int[]{80,90,100,110};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5275;
        key = "night_stalker_void";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackspeed_slow = new int[]{-50,-50,-50,-50};
        duration_day = new double[]{2.0,2.0,2.0,2.0};
        duration_night = new double[]{2.5,3.0,3.5,4.0};
        localizedName = "Void";
        movespeed_slow = new int[]{-50,-50,-50,-50};
        ownerKey = "npc_dota_hero_night_stalker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NightStalkerVoid instance() {
        if( instance == null ){
            instance = new NightStalkerVoid();
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

    public int[] getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public double[] getDurationDay() {
        return duration_day;
    }

    public double[] getDurationNight() {
        return duration_night;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeedSlow() {
        return movespeed_slow;
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
        if (!(object instanceof NightStalkerVoid))
            return false;
        if (object == this)
            return true;
        NightStalkerVoid otherObject = (NightStalkerVoid) object;
        return otherObject.getKey().equals(getKey());
    }

}
