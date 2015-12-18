package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidRabid extends Ability {

    private static LoneDruidRabid instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed;
    private final int[] bonus_move_speed;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] rabid_duration;

    private LoneDruidRabid() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = 30;
        abilityManaCost = new int[]{50,50,50,50};
        fightRecapLevel = 1;
        iD = 5413;
        key = "lone_druid_rabid";
        bonus_attack_speed = new int[]{10,20,30,40};
        bonus_move_speed = new int[]{10,15,20,25};
        localizedName = "Rabid";
        owningHeroShortKey = "lone_druid";
        rabid_duration = new double[]{18.0,22.0,26.0,30.0};
    }

    public static LoneDruidRabid instance() {
        if( instance == null ){
            instance = new LoneDruidRabid();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusMoveSpeed() {
        return bonus_move_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getRabidDuration() {
        return rabid_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidRabid))
            return false;
        if (object == this)
            return true;
        LoneDruidRabid otherObject = (LoneDruidRabid) object;
        return otherObject.getKey().equals(getKey());
    }

}
