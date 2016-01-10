package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurKhanEnduranceAura extends Ability {

    private static CentaurKhanEnduranceAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_attack_speed;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private CentaurKhanEnduranceAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5294;
        key = "centaur_khan_endurance_aura";
        bonus_attack_speed = 15;
        localizedName = "Endurance Aura";
        ownerKey = "npc_dota_neutral_centaur_khan";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static CentaurKhanEnduranceAura instance() {
        if( instance == null ){
            instance = new CentaurKhanEnduranceAura();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
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
        if (!(object instanceof CentaurKhanEnduranceAura))
            return false;
        if (object == this)
            return true;
        CentaurKhanEnduranceAura otherObject = (CentaurKhanEnduranceAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
