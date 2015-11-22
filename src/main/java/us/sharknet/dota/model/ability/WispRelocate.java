package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispRelocate extends Ability {

    private static WispRelocate instance;

    private final String abilityBehavior;
    private final int[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final double[] cast_delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] return_time;

    private WispRelocate() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = new int[]{0,0,0};
        abilityCooldown = new double[]{90.0,75.0,60.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 1;
        iD = 5488;
        key = "wisp_relocate";
        cast_delay = new double[]{2.5,2.25,2.0};
        localizedName = "Relocate";
        owningHeroShortKey = "wisp";
        return_time = new double[]{12.0,12.0,12.0};
    }

    public static WispRelocate instance() {
        if( instance == null ){
            instance = new WispRelocate();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getCastDelay() {
        return cast_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getReturnTime() {
        return return_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WispRelocate))
            return false;
        if (object == this)
            return true;
        WispRelocate otherObject = (WispRelocate) object;
        return otherObject.getKey().equals(getKey());
    }

}
