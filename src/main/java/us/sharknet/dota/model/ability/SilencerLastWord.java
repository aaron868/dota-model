package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SilencerLastWord extends Ability {

    private static SilencerLastWord instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int debuff_duration;
    private final int[] duration;
    private final String localizedName;
    private final int[] movespeed;
    private final String owningHeroShortKey;

    private SilencerLastWord() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .3;
        abilityCastRange = 9;
        abilityCooldown = new double[]{30.0,24.0,18.0,12.0};
        abilityManaCost = 115;
        abilityModifierSupportValue = .3;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5379;
        key = "silencer_last_word";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{150,200,250,300};
        debuff_duration = 4;
        duration = new int[]{3,4,5,6};
        localizedName = "Last Word";
        movespeed = new int[]{-14,-16,-18,-20};
        owningHeroShortKey = "silencer";
    }

    public static SilencerLastWord instance() {
        if( instance == null ){
            instance = new SilencerLastWord();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
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

    public int[] getDamage() {
        return damage;
    }

    public int getDebuffDuration() {
        return debuff_duration;
    }

    public int[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeed() {
        return movespeed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SilencerLastWord))
            return false;
        if (object == this)
            return true;
        SilencerLastWord otherObject = (SilencerLastWord) object;
        return otherObject.getKey().equals(getKey());
    }

}
