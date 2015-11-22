package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderReturnChakram2 extends Ability {

    private static ShredderReturnChakram2 instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ShredderReturnChakram2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{0.0,0.0,0.0};
        iD = 5646;
        key = "shredder_return_chakram_2";
        maxLevel = 3;
        localizedName = "Return Chakram 2";
        owningHeroShortKey = "shredder";
    }

    public static ShredderReturnChakram2 instance() {
        if( instance == null ){
            instance = new ShredderReturnChakram2();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof ShredderReturnChakram2))
            return false;
        if (object == this)
            return true;
        ShredderReturnChakram2 otherObject = (ShredderReturnChakram2) object;
        return otherObject.getKey().equals(getKey());
    }

}
