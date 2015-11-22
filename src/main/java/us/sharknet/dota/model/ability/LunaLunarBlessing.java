package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LunaLunarBlessing extends Ability {

    private static LunaLunarBlessing instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_damage;
    private final int[] bonus_night_vision;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private LunaLunarBlessing() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5224;
        key = "luna_lunar_blessing";
        bonus_damage = new int[]{14,22,30,38};
        bonus_night_vision = new int[]{1000,1000,1000,1000};
        localizedName = "Lunar Blessing";
        owningHeroShortKey = "luna";
        radius = new int[]{900,900,900,900};
    }

    public static LunaLunarBlessing instance() {
        if( instance == null ){
            instance = new LunaLunarBlessing();
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getBonusNightVision() {
        return bonus_night_vision;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LunaLunarBlessing))
            return false;
        if (object == this)
            return true;
        LunaLunarBlessing otherObject = (LunaLunarBlessing) object;
        return otherObject.getKey().equals(getKey());
    }

}
