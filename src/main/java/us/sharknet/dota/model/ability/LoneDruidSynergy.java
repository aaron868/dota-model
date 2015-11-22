package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSynergy extends Ability {

    private static LoneDruidSynergy instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bear_bonus_damage;
    private final int[] bear_bonus_speed;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] rabid_duration_bonus;
    private final int[] true_form_hp_bonus;

    private LoneDruidSynergy() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5414;
        key = "lone_druid_synergy";
        bear_bonus_damage = new int[]{10,20,30,40};
        bear_bonus_speed = new int[]{10,20,30,40};
        localizedName = "Synergy";
        owningHeroShortKey = "lone_druid";
        rabid_duration_bonus = new double[]{10.0,20.0,30.0,40.0};
        true_form_hp_bonus = new int[]{100,200,300,400};
    }

    public static LoneDruidSynergy instance() {
        if( instance == null ){
            instance = new LoneDruidSynergy();
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

    public int[] getBearBonusDamage() {
        return bear_bonus_damage;
    }

    public int[] getBearBonusSpeed() {
        return bear_bonus_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getRabidDurationBonus() {
        return rabid_duration_bonus;
    }

    public int[] getTrueFormHpBonus() {
        return true_form_hp_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSynergy))
            return false;
        if (object == this)
            return true;
        LoneDruidSynergy otherObject = (LoneDruidSynergy) object;
        return otherObject.getKey().equals(getKey());
    }

}
