package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChenHolyPersuasion extends Ability {

    private static ChenHolyPersuasion instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] health_min;
    private final String localizedName;
    private final int[] max_units;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ChenHolyPersuasion() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{30.0,26.0,22.0,18.0};
        abilityManaCost = new int[]{100,100,100,100};
        iD = 5330;
        key = "chen_holy_persuasion";
        health_min = new int[]{700,800,900,1000};
        localizedName = "Holy Persuasion";
        max_units = new int[]{1,2,3,4};
        ownerKey = "npc_dota_hero_chen";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ChenHolyPersuasion instance() {
        if( instance == null ){
            instance = new ChenHolyPersuasion();
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

    public int[] getHealthMin() {
        return health_min;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxUnits() {
        return max_units;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChenHolyPersuasion))
            return false;
        if (object == this)
            return true;
        ChenHolyPersuasion otherObject = (ChenHolyPersuasion) object;
        return otherObject.getKey().equals(getKey());
    }

}
