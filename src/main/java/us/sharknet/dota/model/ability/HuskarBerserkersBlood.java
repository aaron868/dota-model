package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class HuskarBerserkersBlood extends Ability {

    private static HuskarBerserkersBlood instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] attack_speed_bonus_per_stack;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] resistance_per_stack;

    private HuskarBerserkersBlood() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5273;
        key = "huskar_berserkers_blood";
        attack_speed_bonus_per_stack = new int[]{14,16,18,20};
        localizedName = "Berserkers Blood";
        owningHeroShortKey = "huskar";
        resistance_per_stack = new int[]{3,4,5,6};
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

    public int[] getAttackSpeedBonusPerStack() {
        return attack_speed_bonus_per_stack;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getResistancePerStack() {
        return resistance_per_stack;
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
