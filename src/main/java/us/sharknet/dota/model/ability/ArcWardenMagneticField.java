package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ArcWardenMagneticField extends Ability {

    private static ArcWardenMagneticField instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_speed_bonus;
    private final double[] duration;
    private final int evasion_chance;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private ArcWardenMagneticField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{50,50,50,50};
        abilityManaCost = new int[]{110,110,110,110};
        iD = 5678;
        key = "arc_warden_magnetic_field";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attack_speed_bonus = new int[]{50,60,70,80};
        duration = new double[]{3.5,4.0,4.5,5.0};
        evasion_chance = 100;
        localizedName = "Magnetic Field";
        ownerKey = "npc_dota_hero_arc_warden";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 275;
    }

    public static ArcWardenMagneticField instance() {
        if( instance == null ){
            instance = new ArcWardenMagneticField();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getAttackSpeedBonus() {
        return attack_speed_bonus;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getEvasionChance() {
        return evasion_chance;
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
        if (!(object instanceof ArcWardenMagneticField))
            return false;
        if (object == this)
            return true;
        ArcWardenMagneticField otherObject = (ArcWardenMagneticField) object;
        return otherObject.getKey().equals(getKey());
    }

}
