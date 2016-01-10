package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AxeCounterHelix extends Ability {

    private static AxeCounterHelix instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int trigger_chance;

    private AxeCounterHelix() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{0.45,0.4,0.35,0.3};
        abilityDamage = new int[]{100,135,170,205};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5009;
        key = "axe_counter_helix";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown = new double[]{0.45,0.4,0.35,0.3};
        localizedName = "Counter Helix";
        ownerKey = "npc_dota_hero_axe";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = 275;
        trigger_chance = 20;
    }

    public static AxeCounterHelix instance() {
        if( instance == null ){
            instance = new AxeCounterHelix();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public double[] getCooldown() {
        return cooldown;
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

    public int getTriggerChance() {
        return trigger_chance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AxeCounterHelix))
            return false;
        if (object == this)
            return true;
        AxeCounterHelix otherObject = (AxeCounterHelix) object;
        return otherObject.getKey().equals(getKey());
    }

}
