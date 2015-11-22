package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecronomiconWarriorManaBurn extends Ability {

    private static NecronomiconWarriorManaBurn instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int[] burn_amount;
    private final int burn_damage_conversion;
    private final String localizedName;
    private final String owningHeroShortKey;

    private NecronomiconWarriorManaBurn() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5202;
        key = "necronomicon_warrior_mana_burn";
        burn_amount = new int[]{25,50,75};
        burn_damage_conversion = 60;
        localizedName = "Mana Burn";
        owningHeroShortKey = "necronomicon_warrior";
    }

    public static NecronomiconWarriorManaBurn instance() {
        if( instance == null ){
            instance = new NecronomiconWarriorManaBurn();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBurnAmount() {
        return burn_amount;
    }

    public int getBurnDamageConversion() {
        return burn_damage_conversion;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecronomiconWarriorManaBurn))
            return false;
        if (object == this)
            return true;
        NecronomiconWarriorManaBurn otherObject = (NecronomiconWarriorManaBurn) object;
        return otherObject.getKey().equals(getKey());
    }

}
