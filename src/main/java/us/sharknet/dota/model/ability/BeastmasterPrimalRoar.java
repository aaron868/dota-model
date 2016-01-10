package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterPrimalRoar extends Ability {

    private static BeastmasterPrimalRoar instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_scepter;
    private final double[] cooldown_scepter;
    private final int[] damage;
    private final int damage_radius;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int push_distance;
    private final double push_duration;
    private final int[] side_damage;
    private final int[] slow_attack_speed_pct;
    private final double[] slow_duration;
    private final int[] slow_movement_speed_pct;

    private BeastmasterPrimalRoar() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{80.0,75.0,70.0};
        abilityManaCost = new int[]{150,175,200};
        abilityModifierSupportValue = .6;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5177;
        key = "beastmaster_primal_roar";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cast_range_scepter = new int[]{950,950,950};
        cooldown_scepter = new double[]{45.0,45.0,45.0};
        damage = new int[]{200,250,300};
        damage_radius = 300;
        duration = new double[]{3.0,3.5,4.0};
        localizedName = "Primal Roar";
        ownerKey = "npc_dota_hero_beastmaster";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        push_distance = 300;
        push_duration = .6;
        side_damage = new int[]{200,250,300};
        slow_attack_speed_pct = new int[]{-50,-50,-50};
        slow_duration = new double[]{2.0,3.0,4.0};
        slow_movement_speed_pct = new int[]{-50,-50,-50};
    }

    public static BeastmasterPrimalRoar instance() {
        if( instance == null ){
            instance = new BeastmasterPrimalRoar();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int[] getCastRangeScepter() {
        return cast_range_scepter;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDamageRadius() {
        return damage_radius;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
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

    public int getPushDistance() {
        return push_distance;
    }

    public double getPushDuration() {
        return push_duration;
    }

    public int[] getSideDamage() {
        return side_damage;
    }

    public int[] getSlowAttackSpeedPct() {
        return slow_attack_speed_pct;
    }

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public int[] getSlowMovementSpeedPct() {
        return slow_movement_speed_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterPrimalRoar))
            return false;
        if (object == this)
            return true;
        BeastmasterPrimalRoar otherObject = (BeastmasterPrimalRoar) object;
        return otherObject.getKey().equals(getKey());
    }

}
