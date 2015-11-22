package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SniperTakeAim extends Ability {

    private static SniperTakeAim instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_range;
    private final String localizedName;
    private final String owningHeroShortKey;

    private SniperTakeAim() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5156;
        key = "sniper_take_aim";
        bonus_attack_range = new int[]{100,200,300,400};
        localizedName = "Take Aim";
        owningHeroShortKey = "sniper";
    }

    public static SniperTakeAim instance() {
        if( instance == null ){
            instance = new SniperTakeAim();
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

    public int[] getBonusAttackRange() {
        return bonus_attack_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SniperTakeAim))
            return false;
        if (object == this)
            return true;
        SniperTakeAim otherObject = (SniperTakeAim) object;
        return otherObject.getKey().equals(getKey());
    }

}
