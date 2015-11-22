package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantLeechSeed extends Ability {

    private static TreantLeechSeed instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double damage_interval;
    private final double duration;
    private final int[] leech_damage;
    private final String localizedName;
    private final int movement_slow;
    private final String owningHeroShortKey;
    private final int projectile_speed;
    private final int radius;

    private TreantLeechSeed() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 350;
        abilityCooldown = new double[]{16.0,14.0,12.0,10.0};
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5435;
        key = "treant_leech_seed";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_interval = .75;
        duration = 4.5;
        leech_damage = new int[]{15,30,45,60};
        localizedName = "Leech Seed";
        movement_slow = -28;
        owningHeroShortKey = "treant";
        projectile_speed = 400;
        radius = 500;
    }

    public static TreantLeechSeed instance() {
        if( instance == null ){
            instance = new TreantLeechSeed();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public double getDamageInterval() {
        return damage_interval;
    }

    public double getDuration() {
        return duration;
    }

    public int[] getLeechDamage() {
        return leech_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSlow() {
        return movement_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TreantLeechSeed))
            return false;
        if (object == this)
            return true;
        TreantLeechSeed otherObject = (TreantLeechSeed) object;
        return otherObject.getKey().equals(getKey());
    }

}
