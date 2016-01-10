package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSpiritBearDemolish extends Ability {

    private static LoneDruidSpiritBearDemolish instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_building_damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int spell_resistance;

    private LoneDruidSpiritBearDemolish() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5420;
        key = "lone_druid_spirit_bear_demolish";
        bonus_building_damage = 40;
        localizedName = "Spirit Bear Demolish";
        ownerKey = "npc_dota_lone_druid_bear";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        spell_resistance = 33;
    }

    public static LoneDruidSpiritBearDemolish instance() {
        if( instance == null ){
            instance = new LoneDruidSpiritBearDemolish();
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

    public int getBonusBuildingDamage() {
        return bonus_building_damage;
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

    public int getSpellResistance() {
        return spell_resistance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSpiritBearDemolish))
            return false;
        if (object == this)
            return true;
        LoneDruidSpiritBearDemolish otherObject = (LoneDruidSpiritBearDemolish) object;
        return otherObject.getKey().equals(getKey());
    }

}
