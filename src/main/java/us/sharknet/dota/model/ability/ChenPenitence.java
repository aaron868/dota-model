package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChenPenitence extends Ability {

    private static ChenPenitence instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage_taken;
    private final int[] bonus_movement_speed;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] speed;

    private ChenPenitence() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 800;
        abilityCooldown = new double[]{14.0,13.0,12.0,11.0};
        abilityManaCost = 70;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5328;
        key = "chen_penitence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage_taken = new int[]{15,20,25,30};
        bonus_movement_speed = new int[]{-15,-20,-25,-30};
        duration = 8;
        localizedName = "Penitence";
        owningHeroShortKey = "chen";
        speed = new int[]{2000,2000,2000,2000};
    }

    public static ChenPenitence instance() {
        if( instance == null ){
            instance = new ChenPenitence();
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

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public int[] getBonusDamageTaken() {
        return bonus_damage_taken;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChenPenitence))
            return false;
        if (object == this)
            return true;
        ChenPenitence otherObject = (ChenPenitence) object;
        return otherObject.getKey().equals(getKey());
    }

}
