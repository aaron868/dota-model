package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowDemonDisruption extends Ability {

    private static ShadowDemonDisruption instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] disruption_duration;
    private final double[] illusion_duration;
    private final double[] illusion_incoming_damage;
    private final double[] illusion_outgoing_damage;
    private final double[] illusion_outgoing_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] tooltip_total_illusion_incoming_damage;

    private ShadowDemonDisruption() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{25.0,22.0,19.0,16.0};
        abilityDuration = new double[]{2.5,2.5,2.5,2.5};
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO","DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY","DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5421;
        key = "shadow_demon_disruption";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        disruption_duration = new double[]{2.5,2.5,2.5,2.5};
        illusion_duration = new double[]{6.0,8.0,10.0,12.0};
        illusion_incoming_damage = new double[]{50.0,50.0,50.0,50.0};
        illusion_outgoing_damage = new double[]{70.0,60.0,50.0,40.0};
        illusion_outgoing_tooltip = new double[]{30.0,40.0,50.0,60.0};
        localizedName = "Disruption";
        ownerKey = "npc_dota_hero_shadow_demon";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_total_illusion_incoming_damage = new double[]{150.0,150.0,150.0,150.0};
    }

    public static ShadowDemonDisruption instance() {
        if( instance == null ){
            instance = new ShadowDemonDisruption();
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

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public double[] getDisruptionDuration() {
        return disruption_duration;
    }

    public double[] getIllusionDuration() {
        return illusion_duration;
    }

    public double[] getIllusionIncomingDamage() {
        return illusion_incoming_damage;
    }

    public double[] getIllusionOutgoingDamage() {
        return illusion_outgoing_damage;
    }

    public double[] getIllusionOutgoingTooltip() {
        return illusion_outgoing_tooltip;
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

    public double[] getTooltipTotalIllusionIncomingDamage() {
        return tooltip_total_illusion_incoming_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowDemonDisruption))
            return false;
        if (object == this)
            return true;
        ShadowDemonDisruption otherObject = (ShadowDemonDisruption) object;
        return otherObject.getKey().equals(getKey());
    }

}
