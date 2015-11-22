package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnragedWildkinTornado extends Ability {

    private static EnragedWildkinTornado instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityChannelTime;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private EnragedWildkinTornado() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = .75;
        abilityCastRange = 500;
        abilityChannelTime = 4;
        abilityCooldown = 7;
        abilityManaCost = 200;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5312;
        key = "enraged_wildkin_tornado";
        maxLevel = 1;
        duration = 4;
        localizedName = "Tornado";
        owningHeroShortKey = "enraged_wildkin";
    }

    public static EnragedWildkinTornado instance() {
        if( instance == null ){
            instance = new EnragedWildkinTornado();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnragedWildkinTornado))
            return false;
        if (object == this)
            return true;
        EnragedWildkinTornado otherObject = (EnragedWildkinTornado) object;
        return otherObject.getKey().equals(getKey());
    }

}
