package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TidehunterGush extends Ability {

    private static TidehunterGush instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_bonus;
    private final String localizedName;
    private final int[] movement_speed;
    private final String owningHeroShortKey;
    private final int[] projectile_speed;

    private TidehunterGush() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 700;
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityDamage = new int[]{110,160,210,260};
        abilityDuration = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5118;
        key = "tidehunter_gush";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        armor_bonus = new int[]{-3,-4,-5,-6};
        localizedName = "Gush";
        movement_speed = new int[]{-40,-40,-40,-40};
        owningHeroShortKey = "tidehunter";
        projectile_speed = new int[]{4000,4000,4000,4000};
    }

    public static TidehunterGush instance() {
        if( instance == null ){
            instance = new TidehunterGush();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int[] getArmorBonus() {
        return armor_bonus;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeed() {
        return movement_speed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getProjectileSpeed() {
        return projectile_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TidehunterGush))
            return false;
        if (object == this)
            return true;
        TidehunterGush otherObject = (TidehunterGush) object;
        return otherObject.getKey().equals(getKey());
    }

}
