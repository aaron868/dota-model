package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DisruptorStaticStorm extends Ability {

    private static DisruptorStaticStorm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_max;
    private final int duration;
    private final int duration_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int pulses;
    private final int pulses_scepter;
    private final int radius;

    private DisruptorStaticStorm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.05,0.05,0.05,0.05};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{90,80,70};
        abilityManaCost = new int[]{125,175,225};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5461;
        key = "disruptor_static_storm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_max = new int[]{200,250,300};
        duration = 5;
        duration_scepter = 7;
        localizedName = "Static Storm";
        ownerKey = "npc_dota_hero_disruptor";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        pulses = 20;
        pulses_scepter = 28;
        radius = 450;
    }

    public static DisruptorStaticStorm instance() {
        if( instance == null ){
            instance = new DisruptorStaticStorm();
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

    public String getAbilityType() {
        return abilityType;
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

    public int[] getDamageMax() {
        return damage_max;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationScepter() {
        return duration_scepter;
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

    public int getPulses() {
        return pulses;
    }

    public int getPulsesScepter() {
        return pulses_scepter;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DisruptorStaticStorm))
            return false;
        if (object == this)
            return true;
        DisruptorStaticStorm otherObject = (DisruptorStaticStorm) object;
        return otherObject.getKey().equals(getKey());
    }

}
