package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UndyingFleshGolem extends Ability {

    private static UndyingFleshGolem instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int death_heal;
    private final int death_heal_creep;
    private final int duration;
    private final int full_power_radius;
    private final String localizedName;
    private final int[] max_damage_amp;
    private final int max_speed_slow;
    private final int min_damage_amp;
    private final int min_speed_slow;
    private final String owningHeroShortKey;
    private final int radius;

    private UndyingFleshGolem() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{75.0,75.0,75.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5447;
        key = "undying_flesh_golem";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        death_heal = 6;
        death_heal_creep = 2;
        duration = 3;
        full_power_radius = 2;
        localizedName = "Flesh Golem";
        max_damage_amp = new int[]{20,25,30};
        max_speed_slow = 2;
        min_damage_amp = 1;
        min_speed_slow = 1;
        owningHeroShortKey = "undying";
        radius = 75;
    }

    public static UndyingFleshGolem instance() {
        if( instance == null ){
            instance = new UndyingFleshGolem();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int getDeathHeal() {
        return death_heal;
    }

    public int getDeathHealCreep() {
        return death_heal_creep;
    }

    public int getDuration() {
        return duration;
    }

    public int getFullPowerRadius() {
        return full_power_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxDamageAmp() {
        return max_damage_amp;
    }

    public int getMaxSpeedSlow() {
        return max_speed_slow;
    }

    public int getMinDamageAmp() {
        return min_damage_amp;
    }

    public int getMinSpeedSlow() {
        return min_speed_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UndyingFleshGolem))
            return false;
        if (object == this)
            return true;
        UndyingFleshGolem otherObject = (UndyingFleshGolem) object;
        return otherObject.getKey().equals(getKey());
    }

}
