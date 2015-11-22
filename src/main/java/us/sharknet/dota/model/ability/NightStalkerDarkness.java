package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NightStalkerDarkness extends Ability {

    private static NightStalkerDarkness instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] blind_percentage;
    private final int duration;
    private final int fixed_vision;
    private final String localizedName;
    private final String owningHeroShortKey;

    private NightStalkerDarkness() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = new int[]{160,120,80};
        abilityManaCost = new int[]{0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5278;
        key = "night_stalker_darkness";
        blind_percentage = new int[]{-25,-30,-35};
        duration = 5;
        fixed_vision = 675;
        localizedName = "Darkness";
        owningHeroShortKey = "night_stalker";
    }

    public static NightStalkerDarkness instance() {
        if( instance == null ){
            instance = new NightStalkerDarkness();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getBlindPercentage() {
        return blind_percentage;
    }

    public int getDuration() {
        return duration;
    }

    public int getFixedVision() {
        return fixed_vision;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NightStalkerDarkness))
            return false;
        if (object == this)
            return true;
        NightStalkerDarkness otherObject = (NightStalkerDarkness) object;
        return otherObject.getKey().equals(getKey());
    }

}
