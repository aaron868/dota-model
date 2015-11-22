package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesRemoteMinesSelfDetonate extends Ability {

    private static TechiesRemoteMinesSelfDetonate instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private TechiesRemoteMinesSelfDetonate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastRange = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5636;
        key = "techies_remote_mines_self_detonate";
        maxLevel = 1;
        localizedName = "Remote Mines Self Detonate";
        owningHeroShortKey = "techies";
        radius = new int[]{400,410,425};
    }

    public static TechiesRemoteMinesSelfDetonate instance() {
        if( instance == null ){
            instance = new TechiesRemoteMinesSelfDetonate();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesRemoteMinesSelfDetonate))
            return false;
        if (object == this)
            return true;
        TechiesRemoteMinesSelfDetonate otherObject = (TechiesRemoteMinesSelfDetonate) object;
        return otherObject.getKey().equals(getKey());
    }

}
