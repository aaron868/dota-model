package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesMinefieldSign extends Ability {

    private static TechiesMinefieldSign instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int aura_radius;
    private final int lifetime;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TechiesMinefieldSign() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 1;
        abilityCooldown = 36;
        abilityManaCost = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_NONE";
        iD = 5644;
        key = "techies_minefield_sign";
        maxLevel = 1;
        aura_radius = 125;
        lifetime = 18;
        localizedName = "Minefield Sign";
        owningHeroShortKey = "techies";
    }

    public static TechiesMinefieldSign instance() {
        if( instance == null ){
            instance = new TechiesMinefieldSign();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
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

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesMinefieldSign))
            return false;
        if (object == this)
            return true;
        TechiesMinefieldSign otherObject = (TechiesMinefieldSign) object;
        return otherObject.getKey().equals(getKey());
    }

}
