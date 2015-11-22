package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesFocusedDetonate extends Ability {

    private static TechiesFocusedDetonate instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private TechiesFocusedDetonate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_UNRESTRICTED","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastRange = 0;
        abilityCooldown = new double[]{1.0,1.0,1.0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5635;
        key = "techies_focused_detonate";
        maxLevel = 1;
        localizedName = "Focused Detonate";
        owningHeroShortKey = "techies";
        radius = 7;
    }

    public static TechiesFocusedDetonate instance() {
        if( instance == null ){
            instance = new TechiesFocusedDetonate();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof TechiesFocusedDetonate))
            return false;
        if (object == this)
            return true;
        TechiesFocusedDetonate otherObject = (TechiesFocusedDetonate) object;
        return otherObject.getKey().equals(getKey());
    }

}
