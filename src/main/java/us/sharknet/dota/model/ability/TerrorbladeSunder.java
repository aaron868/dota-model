package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TerrorbladeSunder extends Ability {

    private static TerrorbladeSunder instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int hit_point_minimum_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TerrorbladeSunder() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = .35;
        abilityCastRange = 550;
        abilityCooldown = new double[]{120.0,80.0,40.0};
        abilityManaCost = new int[]{200,100,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO","DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        fightRecapLevel = 2;
        iD = 5622;
        key = "terrorblade_sunder";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        hit_point_minimum_pct = 25;
        localizedName = "Sunder";
        owningHeroShortKey = "terrorblade";
    }

    public static TerrorbladeSunder instance() {
        if( instance == null ){
            instance = new TerrorbladeSunder();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getHitPointMinimumPct() {
        return hit_point_minimum_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TerrorbladeSunder))
            return false;
        if (object == this)
            return true;
        TerrorbladeSunder otherObject = (TerrorbladeSunder) object;
        return otherObject.getKey().equals(getKey());
    }

}
