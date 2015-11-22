package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LichFrostNova extends Ability {

    private static LichFrostNova instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] aoe_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] slow_attack_speed;
    private final int[] slow_movement_speed;

    private LichFrostNova() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 600;
        abilityCooldown = 8;
        abilityDamage = new int[]{50,100,150,200};
        abilityDuration = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{125,150,170,190};
        abilityModifierSupportValue = .3;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5134;
        key = "lich_frost_nova";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        aoe_damage = new int[]{75,100,125,150};
        localizedName = "Frost Blast";
        owningHeroShortKey = "lich";
        radius = new int[]{200,200,200,200};
        slow_attack_speed = new int[]{-20,-20,-20,-20};
        slow_movement_speed = new int[]{-30,-30,-30,-30};
    }

    public static LichFrostNova instance() {
        if( instance == null ){
            instance = new LichFrostNova();
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

    public int getAbilityCooldown() {
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getAoeDamage() {
        return aoe_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int[] getSlowAttackSpeed() {
        return slow_attack_speed;
    }

    public int[] getSlowMovementSpeed() {
        return slow_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LichFrostNova))
            return false;
        if (object == this)
            return true;
        LichFrostNova otherObject = (LichFrostNova) object;
        return otherObject.getKey().equals(getKey());
    }

}
