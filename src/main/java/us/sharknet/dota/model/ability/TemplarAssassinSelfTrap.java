package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TemplarAssassinSelfTrap extends Ability {

    private static TemplarAssassinSelfTrap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int movement_speed_bonus;
    private final int movement_speed_bonus_stage;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int trap_duration;
    private final int trap_radius;

    private TemplarAssassinSelfTrap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCooldown = new double[]{.5,.5,.5,.5};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5199;
        key = "templar_assassin_self_trap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Self Trap";
        movement_speed_bonus = -30;
        movement_speed_bonus_stage = -5;
        ownerKey = "npc_dota_hero_templar_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        trap_duration = 5;
        trap_radius = 400;
    }

    public static TemplarAssassinSelfTrap instance() {
        if( instance == null ){
            instance = new TemplarAssassinSelfTrap();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSpeedBonus() {
        return movement_speed_bonus;
    }

    public int getMovementSpeedBonusStage() {
        return movement_speed_bonus_stage;
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

    public int getTrapDuration() {
        return trap_duration;
    }

    public int getTrapRadius() {
        return trap_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TemplarAssassinSelfTrap))
            return false;
        if (object == this)
            return true;
        TemplarAssassinSelfTrap otherObject = (TemplarAssassinSelfTrap) object;
        return otherObject.getKey().equals(getKey());
    }

}
