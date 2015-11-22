package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DeathProphetCarrionSwarm extends Ability {

    private static DeathProphetCarrionSwarm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] end_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] range;
    private final int[] speed;
    private final int[] start_radius;

    private DeathProphetCarrionSwarm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 600;
        abilityCooldown = new double[]{8.0,8.0,8.0,8.0};
        abilityDamage = new int[]{75,150,225,300};
        abilityManaCost = new int[]{105,120,140,165};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5090;
        key = "death_prophet_carrion_swarm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        end_radius = new int[]{300,300,300,300};
        localizedName = "Carrion Swarm";
        owningHeroShortKey = "death_prophet";
        range = new int[]{810,810,810,810};
        speed = new int[]{1100,1100,1100,1100};
        start_radius = new int[]{110,110,110,110};
    }

    public static DeathProphetCarrionSwarm instance() {
        if( instance == null ){
            instance = new DeathProphetCarrionSwarm();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int[] getEndRadius() {
        return end_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRange() {
        return range;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getStartRadius() {
        return start_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DeathProphetCarrionSwarm))
            return false;
        if (object == this)
            return true;
        DeathProphetCarrionSwarm otherObject = (DeathProphetCarrionSwarm) object;
        return otherObject.getKey().equals(getKey());
    }

}
