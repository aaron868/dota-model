package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GyrocopterFlakCannon extends Ability {

    private static GyrocopterFlakCannon instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int[] max_attacks;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final int radius;

    private GyrocopterFlakCannon() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{30,30,30,30};
        abilityDuration = new double[]{15,15,15,15};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5363;
        key = "gyrocopter_flak_cannon";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Flak Cannon";
        max_attacks = new int[]{3,4,5,6};
        ownerKey = "npc_dota_hero_gyrocopter";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 800;
        radius = 1000;
    }

    public static GyrocopterFlakCannon instance() {
        if( instance == null ){
            instance = new GyrocopterFlakCannon();
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

    public int[] getMaxAttacks() {
        return max_attacks;
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

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GyrocopterFlakCannon))
            return false;
        if (object == this)
            return true;
        GyrocopterFlakCannon otherObject = (GyrocopterFlakCannon) object;
        return otherObject.getKey().equals(getKey());
    }

}
