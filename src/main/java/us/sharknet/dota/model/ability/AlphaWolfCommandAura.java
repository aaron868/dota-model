package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlphaWolfCommandAura extends Ability {

    private static AlphaWolfCommandAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bonus_damage_pct;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private AlphaWolfCommandAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5309;
        key = "alpha_wolf_command_aura";
        maxLevel = 1;
        bonus_damage_pct = 30;
        localizedName = "Command Aura";
        owningHeroShortKey = "alpha_wolf";
        radius = 900;
    }

    public static AlphaWolfCommandAura instance() {
        if( instance == null ){
            instance = new AlphaWolfCommandAura();
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

    public int getBonusDamagePct() {
        return bonus_damage_pct;
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
        if (!(object instanceof AlphaWolfCommandAura))
            return false;
        if (object == this)
            return true;
        AlphaWolfCommandAura otherObject = (AlphaWolfCommandAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
