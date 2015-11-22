package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingHybrid extends Ability {

    private static MorphlingHybrid instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final int isGrantedByScepter;
    private final String key;
    private final int maxLevel;
    private final int duration;
    private final int[] illusion_damage_in_pct;
    private final double[] illusion_damage_out_pct;
    private final int illusion_damage_out_pct_scepter;
    private final int[] illusion_incoming_dmg_pct_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int tooltip_cast_range;
    private final double[] tooltip_illusion_damage_out_pct;

    private MorphlingHybrid() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = .25;
        abilityCastRange = 600;
        abilityCooldown = 140;
        abilityManaCost = 200;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        fightRecapLevel = 1;
        iD = 5674;
        isGrantedByScepter = 1;
        key = "morphling_hybrid";
        maxLevel = 1;
        duration = 2;
        illusion_damage_in_pct = new int[]{0,0,0};
        illusion_damage_out_pct = new double[]{50.0,50.0,50.0};
        illusion_damage_out_pct_scepter = 2;
        illusion_incoming_dmg_pct_tooltip = new int[]{100,100,100};
        localizedName = "Hybrid";
        owningHeroShortKey = "morphling";
        tooltip_cast_range = 600;
        tooltip_illusion_damage_out_pct = new double[]{50.0,50.0,50.0};
    }

    public static MorphlingHybrid instance() {
        if( instance == null ){
            instance = new MorphlingHybrid();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public int getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getDuration() {
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

    public int getTooltipCastRange() {
        return tooltip_cast_range;
    }

    public double[] getTooltipIllusionDamageOutPct() {
        return tooltip_illusion_damage_out_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MorphlingHybrid))
            return false;
        if (object == this)
            return true;
        MorphlingHybrid otherObject = (MorphlingHybrid) object;
        return otherObject.getKey().equals(getKey());
    }

}
