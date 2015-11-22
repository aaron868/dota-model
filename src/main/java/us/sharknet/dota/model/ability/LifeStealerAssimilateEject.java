package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerAssimilateEject extends Ability {

    private static LifeStealerAssimilateEject instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int damage_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius_tooltip;

    private LifeStealerAssimilateEject() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        fightRecapLevel = 1;
        iD = 5675;
        key = "life_stealer_assimilate_eject";
        maxLevel = 1;
        damage_tooltip = 300;
        localizedName = "Eject";
        owningHeroShortKey = "life_stealer";
        radius_tooltip = new int[]{700,700,700};
    }

    public static LifeStealerAssimilateEject instance() {
        if( instance == null ){
            instance = new LifeStealerAssimilateEject();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int getDamageTooltip() {
        return damage_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadiusTooltip() {
        return radius_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerAssimilateEject))
            return false;
        if (object == this)
            return true;
        LifeStealerAssimilateEject otherObject = (LifeStealerAssimilateEject) object;
        return otherObject.getKey().equals(getKey());
    }

}
