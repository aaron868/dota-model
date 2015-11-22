package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChaosKnightChaosBolt extends Ability {

    private static ChaosKnightChaosBolt instance;

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
    private final int chaos_bolt_speed;
    private final int[] damage_max;
    private final int[] damage_min;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] stun_max;
    private final int[] stun_min;

    private ChaosKnightChaosBolt() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 500;
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = new int[]{140,140,140,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5426;
        key = "chaos_knight_chaos_bolt";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        chaos_bolt_speed = 1000;
        damage_max = new int[]{200,225,250,275};
        damage_min = new int[]{75,100,125,150};
        localizedName = "Chaos Bolt";
        owningHeroShortKey = "chaos_knight";
        stun_max = new int[]{2,3,4,4};
        stun_min = new int[]{1,1,1,2};
    }

    public static ChaosKnightChaosBolt instance() {
        if( instance == null ){
            instance = new ChaosKnightChaosBolt();
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

    public int getChaosBoltSpeed() {
        return chaos_bolt_speed;
    }

    public int[] getDamageMax() {
        return damage_max;
    }

    public int[] getDamageMin() {
        return damage_min;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getStunMax() {
        return stun_max;
    }

    public int[] getStunMin() {
        return stun_min;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChaosKnightChaosBolt))
            return false;
        if (object == this)
            return true;
        ChaosKnightChaosBolt otherObject = (ChaosKnightChaosBolt) object;
        return otherObject.getKey().equals(getKey());
    }

}
