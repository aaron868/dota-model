package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RoshanBash extends Ability {

    private static RoshanBash instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int bash_chance;
    private final int bonus_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double stun_duration;

    private RoshanBash() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5214;
        key = "roshan_bash";
        bash_chance = 15;
        bonus_damage = 50;
        localizedName = "Bash";
        owningHeroShortKey = "roshan";
        stun_duration = 1.65;
    }

    public static RoshanBash instance() {
        if( instance == null ){
            instance = new RoshanBash();
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

    public double getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RoshanBash))
            return false;
        if (object == this)
            return true;
        RoshanBash otherObject = (RoshanBash) object;
        return otherObject.getKey().equals(getKey());
    }

}
