package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerRage extends Ability {

    private static LifeStealerRage instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] attack_speed_bonus;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LifeStealerRage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = 0;
        abilityCastRange = 0;
        abilityCooldown = 16;
        abilityDuration = new int[]{3,4,5,6};
        abilityManaCost = new int[]{75,75,75,75};
        iD = 5249;
        key = "life_stealer_rage";
        attack_speed_bonus = new int[]{50,60,70,80};
        duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Rage";
        owningHeroShortKey = "life_stealer";
    }

    public static LifeStealerRage instance() {
        if( instance == null ){
            instance = new LifeStealerRage();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getAttackSpeedBonus() {
        return attack_speed_bonus;
    }

    public double[] getDuration() {
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
        if (!(object instanceof LifeStealerRage))
            return false;
        if (object == this)
            return true;
        LifeStealerRage otherObject = (LifeStealerRage) object;
        return otherObject.getKey().equals(getKey());
    }

}
