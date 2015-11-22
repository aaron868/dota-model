package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LeshracLightningStorm extends Ability {

    private static LeshracLightningStorm instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] jump_count;
    private final double[] jump_delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final double[] slow_duration;
    private final int slow_movement_speed;

    private LeshracLightningStorm() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .6;
        abilityCastRange = 8;
        abilityCooldown = 4;
        abilityDamage = new int[]{50,100,150,200};
        abilityManaCost = new int[]{90,100,110,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5243;
        key = "leshrac_lightning_storm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        jump_count = new int[]{4,5,6,7};
        jump_delay = new double[]{0.25,0.25,0.25,0.25};
        localizedName = "Lightning Storm";
        owningHeroShortKey = "leshrac";
        radius = 475;
        slow_duration = new double[]{0.7,0.8,0.9,1.0};
        slow_movement_speed = -75;
    }

    public static LeshracLightningStorm instance() {
        if( instance == null ){
            instance = new LeshracLightningStorm();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getJumpCount() {
        return jump_count;
    }

    public double[] getJumpDelay() {
        return jump_delay;
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

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public int getSlowMovementSpeed() {
        return slow_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LeshracLightningStorm))
            return false;
        if (object == this)
            return true;
        LeshracLightningStorm otherObject = (LeshracLightningStorm) object;
        return otherObject.getKey().equals(getKey());
    }

}
