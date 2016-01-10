package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ElderTitanEchoStomp extends Ability {

    private static ElderTitanEchoStomp instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double animation_rate;
    private final double cast_time;
    private final double initial_stun_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] sleep_duration;
    private final int[] stomp_damage;

    private ElderTitanEchoStomp() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{500,500,500,500};
        abilityChannelTime = new double[]{1.2,1.2,1.2,1.2};
        abilityCooldown = new double[]{14,13,12,11};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5589;
        key = "elder_titan_echo_stomp";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        animation_rate = 0.0;
        cast_time = 1.6;
        initial_stun_duration = .65;
        localizedName = "Echo Stomp";
        ownerKey = "npc_dota_hero_elder_titan";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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
