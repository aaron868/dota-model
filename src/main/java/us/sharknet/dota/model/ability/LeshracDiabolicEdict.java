package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LeshracDiabolicEdict extends Ability {

    private static LeshracDiabolicEdict instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration_tooltip;
    private final String localizedName;
    private final int num_explosions;
    private final String owningHeroShortKey;
    private final int radius;
    private final int tower_bonus;

    private LeshracDiabolicEdict() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .5;
        abilityCooldown = new int[]{22,22,22,22};
        abilityDamage = new int[]{9,18,27,36};
        abilityDuration = 10;
        abilityManaCost = new int[]{95,120,135,155};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_BUILDING"};
        fightRecapLevel = 1;
        iD = 5242;
        key = "leshrac_diabolic_edict";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration_tooltip = 10;
        localizedName = "Diabolic Edict";
        num_explosions = 40;
        owningHeroShortKey = "leshrac";
        radius = 500;
        tower_bonus = 40;
    }

    public static LeshracDiabolicEdict instance() {
        if( instance == null ){
            instance = new LeshracDiabolicEdict();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNumExplosions() {
        return num_explosions;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getTowerBonus() {
        return tower_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LeshracDiabolicEdict))
            return false;
        if (object == this)
            return true;
        LeshracDiabolicEdict otherObject = (LeshracDiabolicEdict) object;
        return otherObject.getKey().equals(getKey());
    }

}
