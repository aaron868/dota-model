package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightDragonTail extends Ability {

    private static DragonKnightDragonTail instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int dragon_cast_range;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] stun_duration;

    private DragonKnightDragonTail() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 150;
        abilityCooldown = new int[]{12,11,10,9};
        abilityDamage = new int[]{25,50,75,100};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5227;
        key = "dragon_knight_dragon_tail";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        dragon_cast_range = 400;
        localizedName = "Dragon Tail";
        owningHeroShortKey = "dragon_knight";
        stun_duration = new double[]{2.5,2.75,3.0,3.25};
    }

    public static DragonKnightDragonTail instance() {
        if( instance == null ){
            instance = new DragonKnightDragonTail();
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

    public int[] getAbilityCooldown() {
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

    public int getDragonCastRange() {
        return dragon_cast_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonKnightDragonTail))
            return false;
        if (object == this)
            return true;
        DragonKnightDragonTail otherObject = (DragonKnightDragonTail) object;
        return otherObject.getKey().equals(getKey());
    }

}
