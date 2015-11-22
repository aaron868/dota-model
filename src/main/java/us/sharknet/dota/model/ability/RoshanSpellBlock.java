package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RoshanSpellBlock extends Ability {

    private static RoshanSpellBlock instance;

    private final String abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private RoshanSpellBlock() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 15;
        iD = 5213;
        key = "roshan_spell_block";
        localizedName = "Spell Block";
        owningHeroShortKey = "roshan";
    }

    public static RoshanSpellBlock instance() {
        if( instance == null ){
            instance = new RoshanSpellBlock();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof RoshanSpellBlock))
            return false;
        if (object == this)
            return true;
        RoshanSpellBlock otherObject = (RoshanSpellBlock) object;
        return otherObject.getKey().equals(getKey());
    }

}
