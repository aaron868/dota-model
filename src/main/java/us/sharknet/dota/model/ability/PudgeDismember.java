package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PudgeDismember extends Ability {

    private static PudgeDismember instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] dismember_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] strength_damage;

    private PudgeDismember() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = 160;
        abilityChannelTime = new double[]{2.95,2.95,2.95};
        abilityCooldown = new double[]{30.0,30.0,30.0};
        abilityManaCost = new int[]{100,130,170};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 5077;
        key = "pudge_dismember";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        dismember_damage = new int[]{60,90,120};
        localizedName = "Dismember";
        owningHeroShortKey = "pudge";
        strength_damage = new double[]{0.3,0.4,0.5};
    }

    public static PudgeDismember instance() {
        if( instance == null ){
            instance = new PudgeDismember();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getDismemberDamage() {
        return dismember_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getStrengthDamage() {
        return strength_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PudgeDismember))
            return false;
        if (object == this)
            return true;
        PudgeDismember otherObject = (PudgeDismember) object;
        return otherObject.getKey().equals(getKey());
    }

}
