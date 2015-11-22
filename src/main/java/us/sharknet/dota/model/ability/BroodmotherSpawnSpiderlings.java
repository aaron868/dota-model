package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpawnSpiderlings extends Ability {

    private static BroodmotherSpawnSpiderlings instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] buff_duration;
    private final int[] count;
    private final int[] damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int projectile_speed;
    private final double[] spiderling_duration;

    private BroodmotherSpawnSpiderlings() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = 7;
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5279;
        key = "broodmother_spawn_spiderlings";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        buff_duration = new double[]{2.0,2.0,2.0,2.0};
        count = new int[]{1,2,3,4};
        damage = new int[]{75,150,225,300};
        localizedName = "Spawn Spiderlings";
        owningHeroShortKey = "broodmother";
        projectile_speed = 12;
        spiderling_duration = new double[]{60.0,60.0,60.0,60.0};
    }

    public static BroodmotherSpawnSpiderlings instance() {
        if( instance == null ){
            instance = new BroodmotherSpawnSpiderlings();
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

    public int getAbilityModifierSupportValue() {
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

    public double[] getBuffDuration() {
        return buff_duration;
    }

    public int[] getCount() {
        return count;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public double[] getSpiderlingDuration() {
        return spiderling_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherSpawnSpiderlings))
            return false;
        if (object == this)
            return true;
        BroodmotherSpawnSpiderlings otherObject = (BroodmotherSpawnSpiderlings) object;
        return otherObject.getKey().equals(getKey());
    }

}
