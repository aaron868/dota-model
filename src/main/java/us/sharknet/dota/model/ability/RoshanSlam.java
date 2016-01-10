package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RoshanSlam extends Ability {

    private static RoshanSlam instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int slow_amount;
    private final int slow_duration_hero;
    private final int slow_duration_unit;

    private RoshanSlam() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.47,0.47,0.47,0.47};
        abilityCooldown = new double[]{1,1,1,1};
        abilityManaCost = new int[]{0,0,0,0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5215;
        key = "roshan_slam";
        damage = 70;
        localizedName = "Slam";
        ownerKey = "npc_dota_roshan";
        ownerType = AbilityOwnerType.Roshan;
        passive = false;
        placeholder = false;
        radius = 350;
        slow_amount = 50;
        slow_duration_hero = 2;
        slow_duration_unit = 4;
    }

    public static RoshanSlam instance() {
        if( instance == null ){
            instance = new RoshanSlam();
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

    public int getDamage() {
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

    public int getSlowAmount() {
        return slow_amount;
    }

    public int getSlowDurationHero() {
        return slow_duration_hero;
    }

    public int getSlowDurationUnit() {
        return slow_duration_unit;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RoshanSlam))
            return false;
        if (object == this)
            return true;
        RoshanSlam otherObject = (RoshanSlam) object;
        return otherObject.getKey().equals(getKey());
    }

}
