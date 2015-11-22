package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GraniteGolemBash extends Ability {

    private static GraniteGolemBash instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bash_chance;
    private final int bonus_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int stun_duration;

    private GraniteGolemBash() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5680;
        key = "granite_golem_bash";
        maxLevel = 1;
        bash_chance = 7;
        bonus_damage = 25;
        localizedName = "Bash";
        owningHeroShortKey = "granite_golem";
        stun_duration = 1;
    }

    public static GraniteGolemBash instance() {
        if( instance == null ){
            instance = new GraniteGolemBash();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getBashChance() {
        return bash_chance;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GraniteGolemBash))
            return false;
        if (object == this)
            return true;
        GraniteGolemBash otherObject = (GraniteGolemBash) object;
        return otherObject.getKey().equals(getKey());
    }

}
