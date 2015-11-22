package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiMulticast extends Ability {

    private static OgreMagiMulticast instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int bloodlust_aoe;
    private final double[] bloodlust_cooldown;
    private final double[] fireblast_cooldown;
    private final int[] fireblast_mana_cost;
    private final double[] ignite_aoe;
    private final int[] ignite_cast_range;
    private final String localizedName;
    private final double[] multicast_2_times;
    private final double[] multicast_2_times_tooltip;
    private final double[] multicast_3_times;
    private final double[] multicast_3_times_tooltip;
    private final double[] multicast_4_times;
    private final double[] multicast_4_times_tooltip;
    private final String owningHeroShortKey;

    private OgreMagiMulticast() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5441;
        key = "ogre_magi_multicast";
        bloodlust_aoe = 575;
        bloodlust_cooldown = new double[]{5.0,10.0,15.0};
        fireblast_cooldown = new double[]{2.0,4.0,6.0};
        fireblast_mana_cost = new int[]{20,40,60};
        ignite_aoe = new double[]{150.0,300.0,450.0};
        ignite_cast_range = new int[]{150,300,450};
        localizedName = "Multicast";
        multicast_2_times = new double[]{0.4,0.5,0.6};
        multicast_2_times_tooltip = new double[]{40.0,50.0,60.0};
        multicast_3_times = new double[]{0.0,0.2,0.25};
        multicast_3_times_tooltip = new double[]{0.0,20.0,25.0};
        multicast_4_times = new double[]{0.0,0.0,0.125};
        multicast_4_times_tooltip = new double[]{0.0,0.0,12.5};
        owningHeroShortKey = "ogre_magi";
    }

    public static OgreMagiMulticast instance() {
        if( instance == null ){
            instance = new OgreMagiMulticast();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getBloodlustAoe() {
        return bloodlust_aoe;
    }

    public double[] getBloodlustCooldown() {
        return bloodlust_cooldown;
    }

    public double[] getFireblastCooldown() {
        return fireblast_cooldown;
    }

    public int[] getFireblastManaCost() {
        return fireblast_mana_cost;
    }

    public double[] getIgniteAoe() {
        return ignite_aoe;
    }

    public int[] getIgniteCastRange() {
        return ignite_cast_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getMulticast2Times() {
        return multicast_2_times;
    }

    public double[] getMulticast2TimesTooltip() {
        return multicast_2_times_tooltip;
    }

    public double[] getMulticast3Times() {
        return multicast_3_times;
    }

    public double[] getMulticast3TimesTooltip() {
        return multicast_3_times_tooltip;
    }

    public double[] getMulticast4Times() {
        return multicast_4_times;
    }

    public double[] getMulticast4TimesTooltip() {
        return multicast_4_times_tooltip;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiMulticast))
            return false;
        if (object == this)
            return true;
        OgreMagiMulticast otherObject = (OgreMagiMulticast) object;
        return otherObject.getKey().equals(getKey());
    }

}
