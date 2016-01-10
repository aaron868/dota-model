package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PolarFurbolgUrsaWarriorThunderClap extends Ability {

    private static PolarFurbolgUrsaWarriorThunderClap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int attackspeed_slow;
    private final int duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private PolarFurbolgUrsaWarriorThunderClap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCooldown = new double[]{12,12,12,12};
        abilityDamage = new int[]{150,150,150,150};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5302;
        key = "polar_furbolg_ursa_warrior_thunder_clap";
        attackspeed_slow = -25;
        duration = 3;
        localizedName = "Thunder Clap";
        movespeed_slow = -25;
        ownerKey = "npc_dota_neutral_polar_furbolg_ursa_warrior";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 300;
    }

    public static PolarFurbolgUrsaWarriorThunderClap instance() {
        if( instance == null ){
            instance = new PolarFurbolgUrsaWarriorThunderClap();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
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
        if (!(object instanceof PolarFurbolgUrsaWarriorThunderClap))
            return false;
        if (object == this)
            return true;
        PolarFurbolgUrsaWarriorThunderClap otherObject = (PolarFurbolgUrsaWarriorThunderClap) object;
        return otherObject.getKey().equals(getKey());
    }

}
