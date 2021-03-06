package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GraniteGolemHpAura extends Ability {

    private static GraniteGolemHpAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_hp;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private GraniteGolemHpAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5656;
        key = "granite_golem_hp_aura";
        bonus_hp = 15;
        localizedName = "Granite Aura";
        ownerKey = "npc_dota_neutral_granite_golem";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static GraniteGolemHpAura instance() {
        if( instance == null ){
            instance = new GraniteGolemHpAura();
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

    public int getBonusHp() {
        return bonus_hp;
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
        if (!(object instanceof GraniteGolemHpAura))
            return false;
        if (object == this)
            return true;
        GraniteGolemHpAura otherObject = (GraniteGolemHpAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
