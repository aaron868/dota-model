package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlphaWolfCommandAura extends Ability {

    private static AlphaWolfCommandAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_damage_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private AlphaWolfCommandAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5309;
        key = "alpha_wolf_command_aura";
        bonus_damage_pct = 30;
        localizedName = "Command Aura";
        ownerKey = "npc_dota_neutral_alpha_wolf";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static AlphaWolfCommandAura instance() {
        if( instance == null ){
            instance = new AlphaWolfCommandAura();
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

    public int getBonusDamagePct() {
        return bonus_damage_pct;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AlphaWolfCommandAura))
            return false;
        if (object == this)
            return true;
        AlphaWolfCommandAura otherObject = (AlphaWolfCommandAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
