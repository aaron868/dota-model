package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DefaultAttack extends Ability {

    private static DefaultAttack instance;

    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DefaultAttack() {
        iD = 5001;
        key = "default_attack";
        localizedName = "Default Attack";
        owningHeroShortKey = "default";
    }

    public static DefaultAttack instance() {
        if( instance == null ){
            instance = new DefaultAttack();
        }
        return instance;
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
        if (!(object instanceof DefaultAttack))
            return false;
        if (object == this)
            return true;
        DefaultAttack otherObject = (DefaultAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
