package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BristlebackViscousNasalGoo extends Ability {

    private static BristlebackViscousNasalGoo instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] armor_per_stack;
    private final int base_move_slow;
    private final int goo_duration;
    private final int goo_duration_creep;
    private final int goo_speed;
    private final String localizedName;
    private final int[] move_slow_per_stack;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int stack_limit;

    private BristlebackViscousNasalGoo() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{1.5,1.5,1.5,1.5};
        abilityManaCost = new int[]{25,25,25,25};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5548;
        key = "bristleback_viscous_nasal_goo";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        armor_per_stack = new double[]{1.0,1.4,1.8,2.2};
        base_move_slow = 20;
        goo_duration = 5;
        goo_duration_creep = 1;
        goo_speed = 1000;
        localizedName = "Viscous Nasal Goo";
        move_slow_per_stack = new int[]{3,6,9,12};
        ownerKey = "npc_dota_hero_bristleback";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 600;
        stack_limit = 4;
    }

    public static BristlebackViscousNasalGoo instance() {
        if( instance == null ){
            instance = new BristlebackViscousNasalGoo();
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

    public double[] getArmorPerStack() {
        return armor_per_stack;
    }

    public int getBaseMoveSlow() {
        return base_move_slow;
    }

    public int getGooDuration() {
        return goo_duration;
    }

    public int getGooDurationCreep() {
        return goo_duration_creep;
    }

    public int getGooSpeed() {
        return goo_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMoveSlowPerStack() {
        return move_slow_per_stack;
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

    public int getStackLimit() {
        return stack_limit;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BristlebackViscousNasalGoo))
            return false;
        if (object == this)
            return true;
        BristlebackViscousNasalGoo otherObject = (BristlebackViscousNasalGoo) object;
        return otherObject.getKey().equals(getKey());
    }

}
