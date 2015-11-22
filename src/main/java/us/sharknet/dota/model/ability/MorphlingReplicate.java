package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingReplicate extends Ability {

    private static MorphlingReplicate instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int[] illusion_damage_in_pct;
    private final double[] illusion_damage_out_pct;
    private final int illusion_damage_out_pct_scepter;
    private final int[] illusion_incoming_dmg_pct_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] tooltip_cast_range;
    private final double[] tooltip_illusion_damage_out_pct;

    private MorphlingReplicate() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .25;
        abilityCastRange = new int[]{700,1100,1500};
        abilityCooldown = new double[]{80.0,80.0,80.0};
        abilityManaCost = new int[]{25,25,25};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 5057;
        key = "morphling_replicate";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{30.0,45.0,60.0};
        illusion_damage_in_pct = new int[]{0,0,0};
        illusion_damage_out_pct = new double[]{50.0,50.0,50.0};
        illusion_damage_out_pct_scepter = 2;
        illusion_incoming_dmg_pct_tooltip = new int[]{100,100,100};
        localizedName = "Replicate";
        owningHeroShortKey = "morphling";
        tooltip_cast_range = new int[]{700,1100,1500};
        tooltip_illusion_damage_out_pct = new double[]{50.0,50.0,50.0};
    }

    public static MorphlingReplicate instance() {
        if( instance == null ){
            instance = new MorphlingReplicate();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
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

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public double[] getDuration() {
        return duration;
    }

    public int[] getIllusionDamageInPct() {
        return illusion_damage_in_pct;
    }

    public double[] getIllusionDamageOutPct() {
        return illusion_damage_out_pct;
    }

    public int getIllusionDamageOutPctScepter() {
        return illusion_damage_out_pct_scepter;
    }

    public int[] getIllusionIncomingDmgPctTooltip() {
        return illusion_incoming_dmg_pct_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getTooltipCastRange() {
        return tooltip_cast_range;
    }

    public double[] getTooltipIllusionDamageOutPct() {
        return tooltip_illusion_damage_out_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MorphlingReplicate))
            return false;
        if (object == this)
            return true;
        MorphlingReplicate otherObject = (MorphlingReplicate) object;
        return otherObject.getKey().equals(getKey());
    }

}
