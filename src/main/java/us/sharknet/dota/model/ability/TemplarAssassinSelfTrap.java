package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TemplarAssassinSelfTrap extends Ability {

    private static TemplarAssassinSelfTrap instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final double abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final String localizedName;
    private final int movement_speed_bonus;
    private final int movement_speed_bonus_stage;
    private final String owningHeroShortKey;
    private final int trap_duration;
    private final int trap_radius;

    private TemplarAssassinSelfTrap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = .3;
        abilityCooldown = .5;
        abilityManaCost = 0;
        iD = 5199;
        key = "templar_assassin_self_trap";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Self Trap";
        movement_speed_bonus = -3;
        movement_speed_bonus_stage = -5;
        owningHeroShortKey = "templar_assassin";
        trap_duration = 5;
        trap_radius = 4;
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

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
