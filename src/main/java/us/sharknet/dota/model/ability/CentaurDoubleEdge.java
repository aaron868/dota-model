package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurDoubleEdge extends Ability {

    private static CentaurDoubleEdge instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] edge_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private CentaurDoubleEdge() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{8.0,8.0,8.0,8.0};
        abilityManaCost = new int[]{0,0,0,0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5515;
        key = "centaur_double_edge";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        edge_damage = new int[]{175,250,325,400};
        localizedName = "Double Edge";
        owningHeroShortKey = "centaur";
        radius = 190;
    }

    public static CentaurDoubleEdge instance() {
        if( instance == null ){
            instance = new CentaurDoubleEdge();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getEdgeDamage() {
        return edge_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CentaurDoubleEdge))
            return false;
        if (object == this)
            return true;
        CentaurDoubleEdge otherObject = (CentaurDoubleEdge) object;
        return otherObject.getKey().equals(getKey());
    }

}
