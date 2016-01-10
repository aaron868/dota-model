package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerOpenWounds extends Ability {

    private static LifeStealerOpenWounds instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final int heal_percent;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] slow_steps;
    private final int slow_tooltip;
    private final int[] tooltip_range;

    private LifeStealerOpenWounds() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{200,300,400,500};
        abilityCooldown = new double[]{24,20,16,12};
        abilityDuration = new double[]{8,8,8,8};
        abilityManaCost = new int[]{110,110,110,110};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5251;
        key = "life_stealer_open_wounds";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 8;
        heal_percent = 50;
        localizedName = "Open Wounds";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_steps = new int[]{-70,-70,-60,-50,-30,-10,-10,-10};
        slow_tooltip = 70;
        tooltip_range = new int[]{200,300,400,500};
    }

    public static LifeStealerOpenWounds instance() {
        if( instance == null ){
            instance = new LifeStealerOpenWounds();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int getDuration() {
        return duration;
    }

    public int getHealPercent() {
        return heal_percent;
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

    public int[] getSlowSteps() {
        return slow_steps;
    }

    public int getSlowTooltip() {
        return slow_tooltip;
    }

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerOpenWounds))
            return false;
        if (object == this)
            return true;
        LifeStealerOpenWounds otherObject = (LifeStealerOpenWounds) object;
        return otherObject.getKey().equals(getKey());
    }

}
