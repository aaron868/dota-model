package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderReturnChakram extends Ability {

    private static ShredderReturnChakram instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ShredderReturnChakram() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{0.0,0.0,0.0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5528;
        key = "shredder_return_chakram";
        localizedName = "Return Chakram";
        owningHeroShortKey = "shredder";
    }

    public static ShredderReturnChakram instance() {
        if( instance == null ){
            instance = new ShredderReturnChakram();
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

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShredderReturnChakram))
            return false;
        if (object == this)
            return true;
        ShredderReturnChakram otherObject = (ShredderReturnChakram) object;
        return otherObject.getKey().equals(getKey());
    }

}
