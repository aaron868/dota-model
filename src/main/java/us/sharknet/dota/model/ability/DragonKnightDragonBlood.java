package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightDragonBlood extends Ability {

    private static DragonKnightDragonBlood instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_armor;
    private final int[] bonus_health_regen;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DragonKnightDragonBlood() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5228;
        key = "dragon_knight_dragon_blood";
        bonus_armor = new int[]{3,6,9,12};
        bonus_health_regen = new int[]{2,3,4,5};
        localizedName = "Dragon Blood";
        owningHeroShortKey = "dragon_knight";
    }

    public static DragonKnightDragonBlood instance() {
        if( instance == null ){
            instance = new DragonKnightDragonBlood();
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

    public int[] getBonusArmor() {
        return bonus_armor;
    }

    public int[] getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonKnightDragonBlood))
            return false;
        if (object == this)
            return true;
        DragonKnightDragonBlood otherObject = (DragonKnightDragonBlood) object;
        return otherObject.getKey().equals(getKey());
    }

}
