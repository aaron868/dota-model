package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VisageSoulAssumption extends Ability {

    private static VisageSoulAssumption instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bolt_speed;
    private final int damage_limit;
    private final int damage_max;
    private final int damage_min;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int soul_base_damage;
    private final int soul_charge_damage;
    private final int stack_duration;
    private final int[] stack_limit;

    private VisageSoulAssumption() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{170,160,150,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5481;
        key = "visage_soul_assumption";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bolt_speed = 1000;
        damage_limit = 110;
        damage_max = 3;
        damage_min = 2;
        localizedName = "Soul Assumption";
        ownerKey = "npc_dota_hero_visage";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 1375;
        soul_base_damage = 20;
        soul_charge_damage = 65;
        stack_duration = 6;
        stack_limit = new int[]{3,4,5,6};
    }

    public static VisageSoulAssumption instance() {
        if( instance == null ){
            instance = new VisageSoulAssumption();
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

    public int getBoltSpeed() {
        return bolt_speed;
    }

    public int getDamageLimit() {
        return damage_limit;
    }

    public int getDamageMax() {
        return damage_max;
    }

    public int getDamageMin() {
        return damage_min;
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

    public int getRadius() {
        return radius;
    }

    public int getSoulBaseDamage() {
        return soul_base_damage;
    }

    public int getSoulChargeDamage() {
        return soul_charge_damage;
    }

    public int getStackDuration() {
        return stack_duration;
    }

    public int[] getStackLimit() {
        return stack_limit;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VisageSoulAssumption))
            return false;
        if (object == this)
            return true;
        VisageSoulAssumption otherObject = (VisageSoulAssumption) object;
        return otherObject.getKey().equals(getKey());
    }

}
