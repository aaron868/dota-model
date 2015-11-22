package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EmberSpiritFireRemnant extends Ability {

    private static EmberSpiritFireRemnant instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int charge_restore_time;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final int max_charges;
    private final String owningHeroShortKey;
    private final int radius;
    private final int speed_multiplier;

    private EmberSpiritFireRemnant() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = 0;
        abilityCastRange = 1500;
        abilityCooldown = 0;
        abilityManaCost = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5606;
        key = "ember_spirit_fire_remnant";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        charge_restore_time = 35;
        damage = new int[]{100,150,200};
        duration = 45;
        localizedName = "Fire Remnant";
        max_charges = 3;
        owningHeroShortKey = "ember_spirit";
        radius = 450;
        speed_multiplier = 250;
    }

    public static EmberSpiritFireRemnant instance() {
        if( instance == null ){
            instance = new EmberSpiritFireRemnant();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
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

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return max_charges;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getSpeedMultiplier() {
        return speed_multiplier;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EmberSpiritFireRemnant))
            return false;
        if (object == this)
            return true;
        EmberSpiritFireRemnant otherObject = (EmberSpiritFireRemnant) object;
        return otherObject.getKey().equals(getKey());
    }

}
