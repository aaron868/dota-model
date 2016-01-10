package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlueDragonspawnSorcererEvasion extends Ability {

    private static BlueDragonspawnSorcererEvasion instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int evasion_chance_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BlueDragonspawnSorcererEvasion() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5325;
        key = "blue_dragonspawn_sorcerer_evasion";
        evasion_chance_pct = 15;
        localizedName = "Evasion";
        ownerKey = "npc_dota_neutral_blue_dragonspawn_sorcerer";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static BlueDragonspawnSorcererEvasion instance() {
        if( instance == null ){
            instance = new BlueDragonspawnSorcererEvasion();
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

    public int getEvasionChancePct() {
        return evasion_chance_pct;
    }

    public String getLocalizedName() {
        return localizedName;
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
        if (!(object instanceof BlueDragonspawnSorcererEvasion))
            return false;
        if (object == this)
            return true;
        BlueDragonspawnSorcererEvasion otherObject = (BlueDragonspawnSorcererEvasion) object;
        return otherObject.getKey().equals(getKey());
    }

}
