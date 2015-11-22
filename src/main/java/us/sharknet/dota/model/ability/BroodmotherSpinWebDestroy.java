package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpinWebDestroy extends Ability {

    private static BroodmotherSpinWebDestroy instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BroodmotherSpinWebDestroy() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = 0;
        abilityCooldown = 0;
        abilityManaCost = 0;
        iD = 5643;
        key = "broodmother_spin_web_destroy";
        maxLevel = 1;
        localizedName = "Spin Web Detroy";
        owningHeroShortKey = "broodmother";
    }

    public static BroodmotherSpinWebDestroy instance() {
        if( instance == null ){
            instance = new BroodmotherSpinWebDestroy();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherSpinWebDestroy))
            return false;
        if (object == this)
            return true;
        BroodmotherSpinWebDestroy otherObject = (BroodmotherSpinWebDestroy) object;
        return otherObject.getKey().equals(getKey());
    }

}
