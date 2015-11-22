package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantNaturesGuise extends Ability {

    private static TreantNaturesGuise instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_move_speed;
    private final double[] duration;
    private final int fade_time;
    private final int grace_time;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double search_interval;

    private TreantNaturesGuise() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = .3;
        abilityCastRange = 6;
        abilityCooldown = new double[]{10.0,8.0,6.0,4.0};
        abilityManaCost = 6;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5434;
        key = "treant_natures_guise";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        bonus_move_speed = new int[]{10,10,10,10};
        duration = new double[]{15.0,30.0,45.0,60.0};
        fade_time = 2;
        grace_time = 1;
        localizedName = "Natures Guise";
        owningHeroShortKey = "treant";
        radius = new int[]{375,375,375,375};
        search_interval = .1;
    }

    public static TreantNaturesGuise instance() {
        if( instance == null ){
            instance = new TreantNaturesGuise();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int[] getBonusMoveSpeed() {
        return bonus_move_speed;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getFadeTime() {
        return fade_time;
    }

    public int getGraceTime() {
        return grace_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public double getSearchInterval() {
        return search_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TreantNaturesGuise))
            return false;
        if (object == this)
            return true;
        TreantNaturesGuise otherObject = (TreantNaturesGuise) object;
        return otherObject.getKey().equals(getKey());
    }

}
