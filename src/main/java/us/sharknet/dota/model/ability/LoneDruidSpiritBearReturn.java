package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSpiritBearReturn extends Ability {

    private static LoneDruidSpiritBearReturn instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int return_damage_cooldown;

    private LoneDruidSpiritBearReturn() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = 0;
        abilityCooldown = 5;
        abilityManaCost = 0;
        iD = 5418;
        key = "lone_druid_spirit_bear_return";
        localizedName = "Spirit Bear Return";
        owningHeroShortKey = "lone_druid_spirit_bear";
        return_damage_cooldown = 3;
    }

    public static LoneDruidSpiritBearReturn instance() {
        if( instance == null ){
            instance = new LoneDruidSpiritBearReturn();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getReturnDamageCooldown() {
        return return_damage_cooldown;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSpiritBearReturn))
            return false;
        if (object == this)
            return true;
        LoneDruidSpiritBearReturn otherObject = (LoneDruidSpiritBearReturn) object;
        return otherObject.getKey().equals(getKey());
    }

}
