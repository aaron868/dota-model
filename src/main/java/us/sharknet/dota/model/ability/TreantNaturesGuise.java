package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantNaturesGuise extends Ability {

    private static TreantNaturesGuise instance;

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
    private final int[] bonus_move_speed;
    private final double[] duration;
    private final int fade_time;
    private final int grace_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final double search_interval;

    private TreantNaturesGuise() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{10.0,8.0,6.0,4.0};
        abilityManaCost = new int[]{60,60,60,60};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5434;
        key = "treant_natures_guise";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        bonus_move_speed = new int[]{10,10,10,10};
        duration = new double[]{15.0,30.0,45.0,60.0};
        fade_time = 2;
        grace_time = 1;
        localizedName = "Natures Guise";
        ownerKey = "npc_dota_hero_treant";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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
