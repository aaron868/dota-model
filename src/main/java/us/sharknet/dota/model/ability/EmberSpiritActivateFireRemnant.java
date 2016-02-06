package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EmberSpiritActivateFireRemnant extends Ability {

    private static EmberSpiritActivateFireRemnant instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int charge_restore_time;
    private final int[] damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int speed;
    private final int speed_multiplier;

    private EmberSpiritActivateFireRemnant() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{99999,99999,99999,99999};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{150,150,150,150};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5607;
        key = "ember_spirit_activate_fire_remnant";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        charge_restore_time = 35;
        damage = new int[]{100,150,200};
        localizedName = "Activate Fire Remnant";
        ownerKey = "npc_dota_hero_ember_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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
