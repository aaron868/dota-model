package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UndyingTombstone extends Ability {

    private static UndyingTombstone instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int[] health_threshold;
    private final int[] health_threshold_pct_tooltip;
    private final int[] hits_to_destroy_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] tombstone_health;
    private final int zombie_interval;

    private UndyingTombstone() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.45,0.45,0.45,0.45};
        abilityCastRange = 600;
        abilityCooldown = 70;
        abilityManaCost = new int[]{120,130,140,150};
        fightRecapLevel = 1;
        iD = 5444;
        key = "undying_tombstone";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{15.0,20.0,25.0,30.0};
        health_threshold = new int[]{100,200,300,400};
        health_threshold_pct_tooltip = new int[]{20,25,30,35};
        hits_to_destroy_tooltip = new int[]{3,4,5,7};
        localizedName = "Tombstone";
        owningHeroShortKey = "undying";
        radius = new int[]{600,800,1000,1200};
        tombstone_health = new int[]{6,8,10,14};
        zombie_interval = 3;
    }

    public static UndyingTombstone instance() {
        if( instance == null ){
            instance = new UndyingTombstone();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getHealthThreshold() {
        return health_threshold;
    }

    public int[] getHealthThresholdPctTooltip() {
        return health_threshold_pct_tooltip;
    }

    public int[] getHitsToDestroyTooltip() {
        return hits_to_destroy_tooltip;
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

    public int[] getTombstoneHealth() {
        return tombstone_health;
    }

    public int getZombieInterval() {
        return zombie_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UndyingTombstone))
            return false;
        if (object == this)
            return true;
        UndyingTombstone otherObject = (UndyingTombstone) object;
        return otherObject.getKey().equals(getKey());
    }

}
