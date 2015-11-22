package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BristlebackViscousNasalGoo extends Ability {

    private static BristlebackViscousNasalGoo instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
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
    private final String owningHeroShortKey;
    private final int stack_limit;

    private BristlebackViscousNasalGoo() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .3;
        abilityCastRange = 6;
        abilityCooldown = new double[]{1.5,1.5,1.5,1.5};
        abilityManaCost = new int[]{30,30,30,30};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5548;
        key = "bristleback_viscous_nasal_goo";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        armor_per_stack = new double[]{1.0,1.4,1.8,2.2};
        base_move_slow = 2;
        goo_duration = 5;
        goo_duration_creep = 1;
        goo_speed = 1;
        localizedName = "Viscous Nasal Goo";
        move_slow_per_stack = new int[]{3,6,9,12};
        owningHeroShortKey = "bristleback";
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

    public double getAbilityCastPoint() {
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
