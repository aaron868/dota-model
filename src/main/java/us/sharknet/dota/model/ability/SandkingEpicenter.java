package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SandkingEpicenter extends Ability {

    private static SandkingEpicenter instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] epicenter_damage;
    private final int[] epicenter_pulses;
    private final int[] epicenter_radius;
    private final int[] epicenter_slow;
    private final int epicenter_slow_as;
    private final int epicenter_slow_duration_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SandkingEpicenter() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityChannelTime = new double[]{2.0,2.0,2.0};
        abilityCooldown = new double[]{140.0,120.0,100.0};
        abilityDuration = new double[]{3.0,3.0,3.0};
        abilityManaCost = new int[]{175,250,325};
        abilityModifierSupportValue = .2;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5105;
        key = "sandking_epicenter";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        epicenter_damage = new int[]{110,110,110};
        epicenter_pulses = new int[]{6,8,10};
        epicenter_radius = new int[]{275,325,375,425,475,525,575,650,675,700};
        epicenter_slow = new int[]{-30,-30,-30};
        epicenter_slow_as = -30;
        epicenter_slow_duration_tooltip = 3;
        localizedName = "Epicenter";
        ownerKey = "npc_dota_hero_sand_king";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static SandkingEpicenter instance() {
        if( instance == null ){
            instance = new SandkingEpicenter();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getEpicenterDamage() {
        return epicenter_damage;
    }

    public int[] getEpicenterPulses() {
        return epicenter_pulses;
    }

    public int[] getEpicenterRadius() {
        return epicenter_radius;
    }

    public int[] getEpicenterSlow() {
        return epicenter_slow;
    }

    public int getEpicenterSlowAs() {
        return epicenter_slow_as;
    }

    public int getEpicenterSlowDurationTooltip() {
        return epicenter_slow_duration_tooltip;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SandkingEpicenter))
            return false;
        if (object == this)
            return true;
        SandkingEpicenter otherObject = (SandkingEpicenter) object;
        return otherObject.getKey().equals(getKey());
    }

}
