package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EmberSpiritActivateFireRemnant extends Ability {

    private static EmberSpiritActivateFireRemnant instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int charge_restore_time;
    private final int[] damage;
    private final String localizedName;
    private final int max_charges;
    private final String owningHeroShortKey;
    private final int radius;
    private final int speed;
    private final int speed_multiplier;

    private EmberSpiritActivateFireRemnant() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = 0;
        abilityCastRange = 99999;
        abilityCooldown = 0;
        abilityManaCost = 150;
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5607;
        key = "ember_spirit_activate_fire_remnant";
        maxLevel = 3;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        charge_restore_time = 35;
        damage = new int[]{100,150,200};
        localizedName = "Activate Fire Remnant";
        max_charges = 3;
        owningHeroShortKey = "ember_spirit";
        radius = 450;
        speed = 1300;
        speed_multiplier = 250;
    }

    public static EmberSpiritActivateFireRemnant instance() {
        if( instance == null ){
            instance = new EmberSpiritActivateFireRemnant();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
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

    public int getSpeed() {
        return speed;
    }

    public int getSpeedMultiplier() {
        return speed_multiplier;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EmberSpiritActivateFireRemnant))
            return false;
        if (object == this)
            return true;
        EmberSpiritActivateFireRemnant otherObject = (EmberSpiritActivateFireRemnant) object;
        return otherObject.getKey().equals(getKey());
    }

}
