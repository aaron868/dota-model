package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GnollAssassinEnvenomedWeapon extends Ability {

    private static GnollAssassinEnvenomedWeapon instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int damage_per_second;
    private final int hero_duration;
    private final String localizedName;
    private final int non_hero_duration;
    private final String owningHeroShortKey;

    private GnollAssassinEnvenomedWeapon() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5296;
        key = "gnoll_assassin_envenomed_weapon";
        maxLevel = 1;
        damage_per_second = 2;
        hero_duration = 1;
        localizedName = "Envenomed Weapon";
        non_hero_duration = 2;
        owningHeroShortKey = "gnoll_assassin";
    }

    public static GnollAssassinEnvenomedWeapon instance() {
        if( instance == null ){
            instance = new GnollAssassinEnvenomedWeapon();
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

    public int getDamagePerSecond() {
        return damage_per_second;
    }

    public int getHeroDuration() {
        return hero_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNonHeroDuration() {
        return non_hero_duration;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GnollAssassinEnvenomedWeapon))
            return false;
        if (object == this)
            return true;
        GnollAssassinEnvenomedWeapon otherObject = (GnollAssassinEnvenomedWeapon) object;
        return otherObject.getKey().equals(getKey());
    }

}
