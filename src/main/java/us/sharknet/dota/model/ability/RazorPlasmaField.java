package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RazorPlasmaField extends Ability {

    private static RazorPlasmaField instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_max;
    private final int[] damage_min;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int speed;

    private RazorPlasmaField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{14,14,14,14};
        abilityManaCost = new int[]{125,125,125,125};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5082;
        key = "razor_plasma_field";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_max = new int[]{160,230,300,370};
        damage_min = new int[]{30,50,70,90};
        localizedName = "Plasma Field";
        ownerKey = "npc_dota_hero_razor";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 700;
        speed = 636;
    }

    public static RazorPlasmaField instance() {
        if( instance == null ){
            instance = new RazorPlasmaField();
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

    public int[] getDamageMax() {
        return damage_max;
    }

    public int[] getDamageMin() {
        return damage_min;
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

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RazorPlasmaField))
            return false;
        if (object == this)
            return true;
        RazorPlasmaField otherObject = (RazorPlasmaField) object;
        return otherObject.getKey().equals(getKey());
    }

}
