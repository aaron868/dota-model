package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerRage extends Ability {

    private static LifeStealerRage instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] attack_speed_bonus;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LifeStealerRage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{16,16,16,16};
        abilityDuration = new double[]{3,4,5,6};
        abilityManaCost = new int[]{75,75,75,75};
        iD = 5249;
        key = "life_stealer_rage";
        attack_speed_bonus = new int[]{50,60,70,80};
        duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Rage";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
