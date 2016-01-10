package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlardarSprint extends Ability {

    private static SlardarSprint instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final int bonus_damage;
    private final int[] bonus_speed;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SlardarSprint() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{17,17,17,17};
        iD = 5114;
        key = "slardar_sprint";
        bonus_damage = 15;
        bonus_speed = new int[]{20,28,36,44};
        duration = 12;
        localizedName = "Sprint";
        ownerKey = "npc_dota_hero_slardar";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static SlardarSprint instance() {
        if( instance == null ){
            instance = new SlardarSprint();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int[] getBonusSpeed() {
        return bonus_speed;
    }

    public int getDuration() {
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
        if (!(object instanceof SlardarSprint))
            return false;
        if (object == this)
            return true;
        SlardarSprint otherObject = (SlardarSprint) object;
        return otherObject.getKey().equals(getKey());
    }

}
