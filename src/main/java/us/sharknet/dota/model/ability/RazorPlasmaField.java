package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RazorPlasmaField extends Ability {

    private static RazorPlasmaField instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_max;
    private final int[] damage_min;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int speed;

    private RazorPlasmaField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCastRange = 0;
        abilityCooldown = 14;
        abilityManaCost = new int[]{125,125,125,125};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5082;
        key = "razor_plasma_field";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_max = new int[]{160,230,300,370};
        damage_min = new int[]{30,50,70,90};
        localizedName = "Plasma Field";
        owningHeroShortKey = "razor";
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

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
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

    public int[] getDamageMax() {
        return damage_max;
    }

    public int[] getDamageMin() {
        return damage_min;
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
