package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class HuskarBerserkersBlood extends Ability {

    private static HuskarBerserkersBlood instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int hp_threshold_max;
    private final String localizedName;
    private final int[] maximum_attack_speed;
    private final int[] maximum_resistance;
    private final String owningHeroShortKey;

    private HuskarBerserkersBlood() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5273;
        key = "huskar_berserkers_blood";
        hp_threshold_max = 10;
        localizedName = "Berserkers Blood";
        maximum_attack_speed = new int[]{196,224,252,280};
        maximum_resistance = new int[]{20,30,40,50};
        owningHeroShortKey = "huskar";
    }

    public static HuskarBerserkersBlood instance() {
        if( instance == null ){
            instance = new HuskarBerserkersBlood();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getHpThresholdMax() {
        return hp_threshold_max;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaximumAttackSpeed() {
        return maximum_attack_speed;
    }

    public int[] getMaximumResistance() {
        return maximum_resistance;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HuskarBerserkersBlood))
            return false;
        if (object == this)
            return true;
        HuskarBerserkersBlood otherObject = (HuskarBerserkersBlood) object;
        return otherObject.getKey().equals(getKey());
    }

}
