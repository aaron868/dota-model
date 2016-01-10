package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JuggernautBladeFury extends Ability {

    private static JuggernautBladeFury instance;

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
    private final double blade_fury_damage_tick;
    private final int blade_fury_radius;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private JuggernautBladeFury() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{42,34,26,18};
        abilityDamage = new int[]{80,105,130,155};
        abilityDuration = new double[]{5.0,5.0,5.0,5.0};
        abilityManaCost = new int[]{120,110,100,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5028;
        key = "juggernaut_blade_fury";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        blade_fury_damage_tick = .2;
        blade_fury_radius = 250;
        localizedName = "Blade Fury";
        ownerKey = "npc_dota_hero_juggernaut";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static JuggernautBladeFury instance() {
        if( instance == null ){
            instance = new JuggernautBladeFury();
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

    public double getBladeFuryDamageTick() {
        return blade_fury_damage_tick;
    }

    public int getBladeFuryRadius() {
        return blade_fury_radius;
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
        if (!(object instanceof JuggernautBladeFury))
            return false;
        if (object == this)
            return true;
        JuggernautBladeFury otherObject = (JuggernautBladeFury) object;
        return otherObject.getKey().equals(getKey());
    }

}
