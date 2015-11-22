package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GyrocopterFlakCannon extends Ability {

    private static GyrocopterFlakCannon instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int[] abilityCooldown;
    private final int[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int[] max_attacks;
    private final String owningHeroShortKey;
    private final int projectile_speed;
    private final int radius;

    private GyrocopterFlakCannon() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCooldown = new int[]{30,30,30,30};
        abilityDuration = new int[]{15,15,15,15};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        fightRecapLevel = 1;
        iD = 5363;
        key = "gyrocopter_flak_cannon";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Flak Cannon";
        max_attacks = new int[]{3,4,5,6};
        owningHeroShortKey = "gyrocopter";
        projectile_speed = 8;
        radius = 1;
    }

    public static GyrocopterFlakCannon instance() {
        if( instance == null ){
            instance = new GyrocopterFlakCannon();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxAttacks() {
        return max_attacks;
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
        if (!(object instanceof GyrocopterFlakCannon))
            return false;
        if (object == this)
            return true;
        GyrocopterFlakCannon otherObject = (GyrocopterFlakCannon) object;
        return otherObject.getKey().equals(getKey());
    }

}
