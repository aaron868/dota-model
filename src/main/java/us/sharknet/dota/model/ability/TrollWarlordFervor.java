package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordFervor extends Ability {

    private static TrollWarlordFervor instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] attack_speed;
    private final String localizedName;
    private final int max_stacks;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TrollWarlordFervor() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5511;
        key = "troll_warlord_fervor";
        attack_speed = new int[]{15,20,25,30};
        localizedName = "Fervor";
        max_stacks = 6;
        ownerKey = "npc_dota_hero_troll_warlord";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static TrollWarlordFervor instance() {
        if( instance == null ){
            instance = new TrollWarlordFervor();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
