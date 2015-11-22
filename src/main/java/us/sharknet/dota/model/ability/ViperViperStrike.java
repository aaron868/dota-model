package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ViperViperStrike extends Ability {

    private static ViperViperStrike instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_speed;
    private final int[] bonus_movement_speed;
    private final int cast_range_scepter;
    private final int charge_restore_time;
    private final int cooldown_scepter;
    private final int[] damage;
    private final double[] duration;
    private final String localizedName;
    private final int[] mana_cost_scepter;
    private final int max_charges;
    private final String owningHeroShortKey;
    private final int projectile_speed;

    private ViperViperStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = 500;
        abilityCooldown = new double[]{70.0,50.0,30.0};
        abilityManaCost = new int[]{125,175,250};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 5221;
        key = "viper_viper_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_attack_speed = new int[]{-40,-60,-80};
        bonus_movement_speed = new int[]{-40,-60,-80};
        cast_range_scepter = 900;
        charge_restore_time = 3;
        cooldown_scepter = 12;
        damage = new int[]{60,100,145};
        duration = new double[]{5.1,5.1,5.1};
        localizedName = "Viper Strike";
        mana_cost_scepter = new int[]{125,125,125};
        max_charges = 2;
        owningHeroShortKey = "viper";
        projectile_speed = 1200;
    }

    public static ViperViperStrike instance() {
        if( instance == null ){
            instance = new ViperViperStrike();
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

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaCostScepter() {
        return mana_cost_scepter;
    }

    public int getMaxCharges() {
        return max_charges;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ViperViperStrike))
            return false;
        if (object == this)
            return true;
        ViperViperStrike otherObject = (ViperViperStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
