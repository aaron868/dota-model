package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnigmaMidnightPulse extends Ability {

    private static EnigmaMidnightPulse instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] damage_percent;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private EnigmaMidnightPulse() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{35,35,35,35};
        abilityManaCost = new int[]{95,110,125,140};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5148;
        key = "enigma_midnight_pulse";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage_percent = new double[]{3.0,3.75,4.5,5.25};
        duration = 11;
        localizedName = "Midnight Pulse";
        ownerKey = "npc_dota_hero_enigma";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 550;
    }

    public static EnigmaMidnightPulse instance() {
        if( instance == null ){
            instance = new EnigmaMidnightPulse();
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

    public double[] getDamagePercent() {
        return damage_percent;
    }

    public int getDuration() {
        return duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnigmaMidnightPulse))
            return false;
        if (object == this)
            return true;
        EnigmaMidnightPulse otherObject = (EnigmaMidnightPulse) object;
        return otherObject.getKey().equals(getKey());
    }

}
