package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NightStalkerCripplingFear extends Ability {

    private static NightStalkerCripplingFear instance;

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
    private final double[] duration_day;
    private final double[] duration_night;
    private final String localizedName;
    private final int[] miss_rate_day;
    private final int miss_rate_night;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NightStalkerCripplingFear() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = new double[]{12,12,12,12};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5276;
        key = "night_stalker_crippling_fear";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration_day = new double[]{3.0,3.0,3.0,3.0};
        duration_night = new double[]{5.0,6.0,7.0,8.0};
        localizedName = "Crippling Fear";
        miss_rate_day = new int[]{10,10,10,10};
        miss_rate_night = 50;
        ownerKey = "npc_dota_hero_night_stalker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NightStalkerCripplingFear instance() {
        if( instance == null ){
            instance = new NightStalkerCripplingFear();
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

    public double[] getDurationDay() {
        return duration_day;
    }

    public double[] getDurationNight() {
        return duration_night;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMissRateDay() {
        return miss_rate_day;
    }

    public int getMissRateNight() {
        return miss_rate_night;
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
        if (!(object instanceof NightStalkerCripplingFear))
            return false;
        if (object == this)
            return true;
        NightStalkerCripplingFear otherObject = (NightStalkerCripplingFear) object;
        return otherObject.getKey().equals(getKey());
    }

}
