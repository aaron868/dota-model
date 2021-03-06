package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UndyingTombstoneZombieDeathstrike extends Ability {

    private static UndyingTombstoneZombieDeathstrike instance;

    private final String[] abilityBehavior;
    private final int abilityModifierSupportBonus;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_speed;
    private final double duration;
    private final int[] health_threshold;
    private final double[] health_threshold_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int slow;

    private UndyingTombstoneZombieDeathstrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityModifierSupportBonus = 5;
        iD = 5446;
        key = "undying_tombstone_zombie_deathstrike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_speed = 50;
        duration = 2.5;
        health_threshold = new int[]{100,200,300,400};
        health_threshold_pct = new double[]{20.0,25.0,30.0,35.0};
        localizedName = "Tombstone Zombie Deathstrike";
        ownerKey = "npc_dota_hero_undying";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 1200;
        slow = -7;
    }

    public static UndyingTombstoneZombieDeathstrike instance() {
        if( instance == null ){
            instance = new UndyingTombstoneZombieDeathstrike();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getBonusSpeed() {
        return bonus_speed;
    }

    public double getDuration() {
        return duration;
    }

    public int[] getHealthThreshold() {
        return health_threshold;
    }

    public double[] getHealthThresholdPct() {
        return health_threshold_pct;
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

    public int getRadius() {
        return radius;
    }

    public int getSlow() {
        return slow;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UndyingTombstoneZombieDeathstrike))
            return false;
        if (object == this)
            return true;
        UndyingTombstoneZombieDeathstrike otherObject = (UndyingTombstoneZombieDeathstrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
