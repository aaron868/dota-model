package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlardarSlithereenCrush extends Ability {

    private static SlardarSlithereenCrush instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int crush_attack_slow_tooltip;
    private final int crush_extra_slow;
    private final int crush_extra_slow_duration;
    private final int crush_radius;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;

    private SlardarSlithereenCrush() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{8.0,8.0,8.0,8.0};
        abilityDamage = new int[]{75,125,175,225};
        abilityDuration = new double[]{1.6,1.9,2.2,2.5};
        abilityManaCost = new int[]{80,95,105,115};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5115;
        key = "slardar_slithereen_crush";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        crush_attack_slow_tooltip = -20;
        crush_extra_slow = -20;
        crush_extra_slow_duration = 2;
        crush_radius = 350;
        localizedName = "Slithereen Crush";
        ownerKey = "npc_dota_hero_slardar";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{1.6,1.9,2.2,2.5};
    }

    public static SlardarSlithereenCrush instance() {
        if( instance == null ){
            instance = new SlardarSlithereenCrush();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getCrushAttackSlowTooltip() {
        return crush_attack_slow_tooltip;
    }

    public int getCrushExtraSlow() {
        return crush_extra_slow;
    }

    public int getCrushExtraSlowDuration() {
        return crush_extra_slow_duration;
    }

    public int getCrushRadius() {
        return crush_radius;
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

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SlardarSlithereenCrush))
            return false;
        if (object == this)
            return true;
        SlardarSlithereenCrush otherObject = (SlardarSlithereenCrush) object;
        return otherObject.getKey().equals(getKey());
    }

}
