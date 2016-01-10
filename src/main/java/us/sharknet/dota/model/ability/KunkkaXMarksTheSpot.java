package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaXMarksTheSpot extends Ability {

    private static KunkkaXMarksTheSpot instance;

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
    private final int allied_duration_tooltip;
    private final int duration;
    private final double fow_duration;
    private final int fow_range;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] tooltip_range;

    private KunkkaXMarksTheSpot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{400,600,800,1000};
        abilityCooldown = new double[]{26,20,14,8};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5033;
        key = "kunkka_x_marks_the_spot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        allied_duration_tooltip = 8;
        duration = 4;
        fow_duration = 5.94;
        fow_range = 400;
        localizedName = "X Marks The Spot";
        ownerKey = "npc_dota_hero_kunkka";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_range = new int[]{400,600,800,1000};
    }

    public static KunkkaXMarksTheSpot instance() {
        if( instance == null ){
            instance = new KunkkaXMarksTheSpot();
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

    public int getAlliedDurationTooltip() {
        return allied_duration_tooltip;
    }

    public int getDuration() {
        return duration;
    }

    public double getFowDuration() {
        return fow_duration;
    }

    public int getFowRange() {
        return fow_range;
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

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KunkkaXMarksTheSpot))
            return false;
        if (object == this)
            return true;
        KunkkaXMarksTheSpot otherObject = (KunkkaXMarksTheSpot) object;
        return otherObject.getKey().equals(getKey());
    }

}
