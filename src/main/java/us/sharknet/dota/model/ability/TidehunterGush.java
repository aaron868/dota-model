package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TidehunterGush extends Ability {

    private static TidehunterGush instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int aoe_scepter;
    private final int[] armor_bonus;
    private final int cast_range_scepter;
    private final int cooldown_scepter;
    private final String localizedName;
    private final int[] movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] projectile_speed;
    private final int speed_scepter;

    private TidehunterGush() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{12,12,12,12};
        abilityDamage = new int[]{110,160,210,260};
        abilityDuration = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5118;
        key = "tidehunter_gush";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        aoe_scepter = 240;
        armor_bonus = new int[]{-3,-4,-5,-6};
        cast_range_scepter = 1800;
        cooldown_scepter = 7;
        localizedName = "Gush";
        movement_speed = new int[]{-40,-40,-40,-40};
        ownerKey = "npc_dota_hero_tidehunter";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = new int[]{4000,4000,4000,4000};
        speed_scepter = 1500;
    }

    public static TidehunterGush instance() {
        if( instance == null ){
            instance = new TidehunterGush();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
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

    public String[] getAbilityUnitTargetTeam() {
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

    public int getAoeScepter() {
        return aoe_scepter;
    }

    public int[] getArmorBonus() {
        return armor_bonus;
    }

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeed() {
        return movement_speed;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int[] getProjectileSpeed() {
        return projectile_speed;
    }

    public int getSpeedScepter() {
        return speed_scepter;
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
