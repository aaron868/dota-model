package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ClinkzStrafe extends Ability {

    private static ClinkzStrafe instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int attack_speed_bonus_pct;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ClinkzStrafe() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{40.0,35.0,30.0,25.0};
        abilityManaCost = new int[]{90,90,90,90};
        fightRecapLevel = 1;
        iD = 5259;
        key = "clinkz_strafe";
        attack_speed_bonus_pct = 13;
        duration = new double[]{4.0,6.0,8.0,10.0};
        localizedName = "Strafe";
        owningHeroShortKey = "clinkz";
    }

    public static ClinkzStrafe instance() {
        if( instance == null ){
            instance = new ClinkzStrafe();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getAttackSpeedBonusPct() {
        return attack_speed_bonus_pct;
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
        if (!(object instanceof ClinkzStrafe))
            return false;
        if (object == this)
            return true;
        ClinkzStrafe otherObject = (ClinkzStrafe) object;
        return otherObject.getKey().equals(getKey());
    }

}
