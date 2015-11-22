package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordFervor extends Ability {

    private static TrollWarlordFervor instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] attack_speed;
    private final String localizedName;
    private final int max_stacks;
    private final String owningHeroShortKey;

    private TrollWarlordFervor() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5511;
        key = "troll_warlord_fervor";
        attack_speed = new int[]{20,25,30,35};
        localizedName = "Fervor";
        max_stacks = 4;
        owningHeroShortKey = "troll_warlord";
    }

    public static TrollWarlordFervor instance() {
        if( instance == null ){
            instance = new TrollWarlordFervor();
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

    public int[] getAttackSpeed() {
        return attack_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxStacks() {
        return max_stacks;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TrollWarlordFervor))
            return false;
        if (object == this)
            return true;
        TrollWarlordFervor otherObject = (TrollWarlordFervor) object;
        return otherObject.getKey().equals(getKey());
    }

}
