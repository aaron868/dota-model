package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LinaLightStrikeArray extends Ability {

    private static LinaLightStrikeArray instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int light_strike_array_aoe;
    private final double light_strike_array_delay_time;
    private final double[] light_strike_array_stun_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LinaLightStrikeArray() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.45,0.45,0.45,0.45};
        abilityCastRange = new int[]{625,625,625,625};
        abilityCooldown = new double[]{7.0,7.0,7.0,7.0};
        abilityDamage = new int[]{80,120,160,200};
        abilityDuration = new double[]{1.6,1.9,2.2,2.5};
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5041;
        key = "lina_light_strike_array";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        light_strike_array_aoe = 225;
        light_strike_array_delay_time = .5;
        light_strike_array_stun_duration = new double[]{1.6,1.9,2.2,2.5};
        localizedName = "Light Strike Array";
        ownerKey = "npc_dota_hero_lina";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static LinaLightStrikeArray instance() {
        if( instance == null ){
            instance = new LinaLightStrikeArray();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int getLightStrikeArrayAoe() {
        return light_strike_array_aoe;
    }

    public double getLightStrikeArrayDelayTime() {
        return light_strike_array_delay_time;
    }

    public double[] getLightStrikeArrayStunDuration() {
        return light_strike_array_stun_duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LinaLightStrikeArray))
            return false;
        if (object == this)
            return true;
        LinaLightStrikeArray otherObject = (LinaLightStrikeArray) object;
        return otherObject.getKey().equals(getKey());
    }

}
