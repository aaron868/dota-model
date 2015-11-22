package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BigThunderLizardWardrumsAura extends Ability {

    private static BigThunderLizardWardrumsAura instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int damage_bonus;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int speed_bonus;

    private BigThunderLizardWardrumsAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5682;
        key = "big_thunder_lizard_wardrums_aura";
        damage_bonus = 15;
        localizedName = "Wardrums Aura";
        owningHeroShortKey = "big_thunder_lizard";
        radius = 900;
        speed_bonus = 15;
    }

    public static BigThunderLizardWardrumsAura instance() {
        if( instance == null ){
            instance = new BigThunderLizardWardrumsAura();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDamageBonus() {
        return damage_bonus;
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

    public int getSpeedBonus() {
        return speed_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BigThunderLizardWardrumsAura))
            return false;
        if (object == this)
            return true;
        BigThunderLizardWardrumsAura otherObject = (BigThunderLizardWardrumsAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
