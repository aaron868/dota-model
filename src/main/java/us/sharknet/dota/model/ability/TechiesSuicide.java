package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesSuicide extends Ability {

    private static TechiesSuicide instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int big_radius;
    private final int[] damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] partial_damage;
    private final double respawn_time_percentage;
    private final int respawn_time_percentage_tooltip;
    private final int small_radius;

    private TechiesSuicide() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 1;
        abilityCooldown = new int[]{160,140,120,100};
        abilityManaCost = new int[]{100,125,150,175};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 561;
        key = "techies_suicide";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        big_radius = 5;
        damage = new int[]{500,650,850,1150};
        localizedName = "Suicide Squad, Attack!";
        owningHeroShortKey = "techies";
        partial_damage = new int[]{260,300,340,380};
        respawn_time_percentage = .5;
        respawn_time_percentage_tooltip = 5;
        small_radius = 2;
    }

    public static TechiesSuicide instance() {
        if( instance == null ){
            instance = new TechiesSuicide();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getBigRadius() {
        return big_radius;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPartialDamage() {
        return partial_damage;
    }

    public double getRespawnTimePercentage() {
        return respawn_time_percentage;
    }

    public int getRespawnTimePercentageTooltip() {
        return respawn_time_percentage_tooltip;
    }

    public int getSmallRadius() {
        return small_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesSuicide))
            return false;
        if (object == this)
            return true;
        TechiesSuicide otherObject = (TechiesSuicide) object;
        return otherObject.getKey().equals(getKey());
    }

}
