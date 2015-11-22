package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UndyingTombstoneZombieAura extends Ability {

    private static UndyingTombstoneZombieAura instance;

    private final String[] abilityBehavior;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_speed;
    private final int[] health_threshold;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int zombie_interval;

    private UndyingTombstoneZombieAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        iD = 5445;
        key = "undying_tombstone_zombie_aura";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_speed = 5;
        health_threshold = new int[]{100,200,300,400};
        localizedName = "Tombstone Zombie Aura";
        owningHeroShortKey = "undying";
        radius = new int[]{600,800,1000,1200};
        zombie_interval = 3;
    }

    public static UndyingTombstoneZombieAura instance() {
        if( instance == null ){
            instance = new UndyingTombstoneZombieAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
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

    public int[] getHealthThreshold() {
        return health_threshold;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int getZombieInterval() {
        return zombie_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UndyingTombstoneZombieAura))
            return false;
        if (object == this)
            return true;
        UndyingTombstoneZombieAura otherObject = (UndyingTombstoneZombieAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
