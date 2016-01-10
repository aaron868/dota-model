package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MudgolemCloakAura extends Ability {

    private static MudgolemCloakAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_magical_armor;
    private final int bonus_magical_armor_creeps;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private MudgolemCloakAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5688;
        key = "mudgolem_cloak_aura";
        bonus_magical_armor = 5;
        bonus_magical_armor_creeps = 20;
        localizedName = "Cloak Aura";
        ownerKey = "npc_dota_neutral_mud_golem";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static MudgolemCloakAura instance() {
        if( instance == null ){
            instance = new MudgolemCloakAura();
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

    public int getBonusMagicalArmor() {
        return bonus_magical_armor;
    }

    public int getBonusMagicalArmorCreeps() {
        return bonus_magical_armor_creeps;
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
        if (!(object instanceof MudgolemCloakAura))
            return false;
        if (object == this)
            return true;
        MudgolemCloakAura otherObject = (MudgolemCloakAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
