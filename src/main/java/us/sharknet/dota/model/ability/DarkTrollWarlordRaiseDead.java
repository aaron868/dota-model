package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DarkTrollWarlordRaiseDead extends Ability {

    private static DarkTrollWarlordRaiseDead instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DarkTrollWarlordRaiseDead() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .5;
        abilityCooldown = 25;
        abilityManaCost = 50;
        iD = 5306;
        key = "dark_troll_warlord_raise_dead";
        maxLevel = 1;
        duration = 4;
        localizedName = "Raise Dead";
        owningHeroShortKey = "dark_troll_warlord";
    }

    public static DarkTrollWarlordRaiseDead instance() {
        if( instance == null ){
            instance = new DarkTrollWarlordRaiseDead();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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
        if (!(object instanceof DarkTrollWarlordRaiseDead))
            return false;
        if (object == this)
            return true;
        DarkTrollWarlordRaiseDead otherObject = (DarkTrollWarlordRaiseDead) object;
        return otherObject.getKey().equals(getKey());
    }

}
