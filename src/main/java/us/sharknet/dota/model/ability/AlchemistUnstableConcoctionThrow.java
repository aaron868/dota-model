package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlchemistUnstableConcoctionThrow extends Ability {

    private static AlchemistUnstableConcoctionThrow instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int brew_explosion;
    private final int brew_time;
    private final String localizedName;
    private final int[] max_damage;
    private final double[] max_stun;
    private final int midair_explosion_radius;
    private final int min_damage;
    private final double min_stun;
    private final int movement_speed;
    private final String owningHeroShortKey;
    private final int vision_range;

    private AlchemistUnstableConcoctionThrow() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = .2;
        abilityCastRange = 775;
        abilityModifierSupportBonus = 12;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 5367;
        key = "alchemist_unstable_concoction_throw";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        brew_explosion = 7;
        brew_time = 5;
        localizedName = "Unstable Concoction Throw";
        max_damage = new int[]{150,220,290,360};
        max_stun = new double[]{1.75,2.5,3.25,4.0};
        midair_explosion_radius = 175;
        min_damage = 0;
        min_stun = .25;
        movement_speed = 9;
        owningHeroShortKey = "alchemist";
        vision_range = 4;
    }

    public static AlchemistUnstableConcoctionThrow instance() {
        if( instance == null ){
            instance = new AlchemistUnstableConcoctionThrow();
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

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getBrewExplosion() {
        return brew_explosion;
    }

    public int getBrewTime() {
        return brew_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxDamage() {
        return max_damage;
    }

    public double[] getMaxStun() {
        return max_stun;
    }

    public int getMidairExplosionRadius() {
        return midair_explosion_radius;
    }

    public int getMinDamage() {
        return min_damage;
    }

    public double getMinStun() {
        return min_stun;
    }

    public int getMovementSpeed() {
        return movement_speed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getVisionRange() {
        return vision_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AlchemistUnstableConcoctionThrow))
            return false;
        if (object == this)
            return true;
        AlchemistUnstableConcoctionThrow otherObject = (AlchemistUnstableConcoctionThrow) object;
        return otherObject.getKey().equals(getKey());
    }

}
