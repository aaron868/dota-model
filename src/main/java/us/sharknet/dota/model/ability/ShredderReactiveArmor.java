package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderReactiveArmor extends Ability {

    private static ShredderReactiveArmor instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_armor;
    private final int bonus_hp_regen;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] stack_duration;
    private final int[] stack_limit;

    private ShredderReactiveArmor() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5526;
        key = "shredder_reactive_armor";
        bonus_armor = 1;
        bonus_hp_regen = 1;
        localizedName = "Reactive Armor";
        owningHeroShortKey = "shredder";
        stack_duration = new double[]{14.0,16.0,18.0,20.0};
        stack_limit = new int[]{5,10,15,20};
    }

    public static ShredderReactiveArmor instance() {
        if( instance == null ){
            instance = new ShredderReactiveArmor();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusHpRegen() {
        return bonus_hp_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getStackDuration() {
        return stack_duration;
    }

    public int[] getStackLimit() {
        return stack_limit;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShredderReactiveArmor))
            return false;
        if (object == this)
            return true;
        ShredderReactiveArmor otherObject = (ShredderReactiveArmor) object;
        return otherObject.getKey().equals(getKey());
    }

}
