package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSpiritBearDemolish extends Ability {

    private static LoneDruidSpiritBearDemolish instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_building_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int spell_resistance;

    private LoneDruidSpiritBearDemolish() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 542;
        key = "lone_druid_spirit_bear_demolish";
        bonus_building_damage = 4;
        localizedName = "Spirit Bear Demolish";
        owningHeroShortKey = "lone_druid_spirit_bear";
        spell_resistance = 33;
    }

    public static LoneDruidSpiritBearDemolish instance() {
        if( instance == null ){
            instance = new LoneDruidSpiritBearDemolish();
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

    public int getBonusBuildingDamage() {
        return bonus_building_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
