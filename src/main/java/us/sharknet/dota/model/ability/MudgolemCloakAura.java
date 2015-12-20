package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MudgolemCloakAura extends Ability {

    private static MudgolemCloakAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bonus_magical_armor;
    private final int bonus_magical_armor_creeps;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private MudgolemCloakAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5688;
        key = "mudgolem_cloak_aura";
        maxLevel = 1;
        bonus_magical_armor = 5;
        bonus_magical_armor_creeps = 20;
        localizedName = "Cloak Aura";
        owningHeroShortKey = "mud_golem";
        radius = 900;
    }

    public static MudgolemCloakAura instance() {
        if( instance == null ){
            instance = new MudgolemCloakAura();
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

    public int getMaxLevel() {
        return maxLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
