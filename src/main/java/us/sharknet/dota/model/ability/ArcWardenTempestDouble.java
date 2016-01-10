package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ArcWardenTempestDouble extends Ability {

    private static ArcWardenTempestDouble instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int duration;
    private final int[] health_cost_pct;
    private final String localizedName;
    private final int[] mana_cost_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ArcWardenTempestDouble() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{65.0,60.0,55.0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5683;
        key = "arc_warden_tempest_double";
        duration = 2;
        health_cost_pct = new int[]{30,15,0};
        localizedName = "Tempest Double";
        mana_cost_pct = new int[]{30,15,0};
        ownerKey = "npc_dota_hero_arc_warden";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ArcWardenTempestDouble instance() {
        if( instance == null ){
            instance = new ArcWardenTempestDouble();
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

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDuration() {
        return duration;
    }

    public int[] getHealthCostPct() {
        return health_cost_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaCostPct() {
        return mana_cost_pct;
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
        if (!(object instanceof ArcWardenTempestDouble))
            return false;
        if (object == this)
            return true;
        ArcWardenTempestDouble otherObject = (ArcWardenTempestDouble) object;
        return otherObject.getKey().equals(getKey());
    }

}
