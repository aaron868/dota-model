package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RattletrapBatteryAssault extends Ability {

    private static RattletrapBatteryAssault instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final double[] interval;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private RattletrapBatteryAssault() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{32.0,28.0,24.0,20.0};
        abilityDamage = new int[]{20,40,60,80};
        abilityManaCost = new int[]{75,75,75,75};
        abilityModifierSupportValue = .2;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5237;
        key = "rattletrap_battery_assault";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{10.5,10.5,10.5,10.5};
        interval = new double[]{0.7,0.7,0.7,0.7};
        localizedName = "Battery Assault";
        ownerKey = "npc_dota_hero_rattletrap";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{275,275,275,275};
    }

    public static RattletrapBatteryAssault instance() {
        if( instance == null ){
            instance = new RattletrapBatteryAssault();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public double[] getDuration() {
        return duration;
    }

    public double[] getInterval() {
        return interval;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RattletrapBatteryAssault))
            return false;
        if (object == this)
            return true;
        RattletrapBatteryAssault otherObject = (RattletrapBatteryAssault) object;
        return otherObject.getKey().equals(getKey());
    }

}
