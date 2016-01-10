package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidRabid extends Ability {

    private static LoneDruidRabid instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed;
    private final int[] bonus_move_speed;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] rabid_duration;

    private LoneDruidRabid() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = new double[]{30,30,30,30};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5413;
        key = "lone_druid_rabid";
        bonus_attack_speed = new int[]{10,20,30,40};
        bonus_move_speed = new int[]{10,15,20,25};
        localizedName = "Rabid";
        ownerKey = "npc_dota_hero_lone_druid";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusMoveSpeed() {
        return bonus_move_speed;
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
