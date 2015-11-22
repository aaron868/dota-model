package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ElderTitanEchoStomp extends Ability {

    private static ElderTitanEchoStomp instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityChannelTime;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double animation_rate;
    private final double cast_time;
    private final double initial_stun_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final double[] sleep_duration;
    private final int[] stomp_damage;

    private ElderTitanEchoStomp() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 500;
        abilityChannelTime = 1.2;
        abilityCooldown = new int[]{14,13,12,11};
        abilityManaCost = 100;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        fightRecapLevel = 1;
        iD = 5589;
        key = "elder_titan_echo_stomp";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        animation_rate = 0.0;
        cast_time = 1.6;
        initial_stun_duration = .65;
        localizedName = "Echo Stomp";
        owningHeroShortKey = "elder_titan";
        radius = 500;
        sleep_duration = new double[]{2.0,3.0,4.0,5.0};
        stomp_damage = new int[]{80,90,100,110};
    }

    public static ElderTitanEchoStomp instance() {
        if( instance == null ){
            instance = new ElderTitanEchoStomp();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public double getAnimationRate() {
        return animation_rate;
    }

    public double getCastTime() {
        return cast_time;
    }

    public double getInitialStunDuration() {
        return initial_stun_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public double[] getSleepDuration() {
        return sleep_duration;
    }

    public int[] getStompDamage() {
        return stomp_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ElderTitanEchoStomp))
            return false;
        if (object == this)
            return true;
        ElderTitanEchoStomp otherObject = (ElderTitanEchoStomp) object;
        return otherObject.getKey().equals(getKey());
    }

}
