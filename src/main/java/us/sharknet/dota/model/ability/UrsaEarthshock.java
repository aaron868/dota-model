package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UrsaEarthshock extends Ability {

    private static UrsaEarthshock instance;

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
    private final String localizedName;
    private final int[] movement_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int shock_radius;

    private UrsaEarthshock() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{5,5,5,5};
        abilityDamage = new int[]{90,140,190,240};
        abilityDuration = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5357;
        key = "ursa_earthshock";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Earthshock";
        movement_slow = new int[]{-25,-35,-45,-55};
        ownerKey = "npc_dota_hero_ursa";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        shock_radius = 385;
    }

    public static UrsaEarthshock instance() {
        if( instance == null ){
            instance = new UrsaEarthshock();
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSlow() {
        return movement_slow;
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

    public int getShockRadius() {
        return shock_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UrsaEarthshock))
            return false;
        if (object == this)
            return true;
        UrsaEarthshock otherObject = (UrsaEarthshock) object;
        return otherObject.getKey().equals(getKey());
    }

}
