package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbyssalUnderlordPitOfMalice extends Ability {

    private static AbyssalUnderlordPitOfMalice instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final double[] ensnare_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int pit_damage;
    private final int pit_duration;
    private final double pit_interval;
    private final int radius;

    private AbyssalUnderlordPitOfMalice() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = .6;
        abilityCastRange = 750;
        abilityCooldown = new double[]{24.0,21.0,18.0,15.0};
        abilityManaCost = new int[]{100,115,130,145};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5614;
        key = "abyssal_underlord_pit_of_malice";
        ensnare_duration = new double[]{1.0,1.5,2.0,2.5};
        localizedName = "Pit Of Malice";
        owningHeroShortKey = "abyssal_underlord";
        pit_damage = 100;
        pit_duration = 7;
        pit_interval = .5;
        radius = 275;
    }

    public static AbyssalUnderlordPitOfMalice instance() {
        if( instance == null ){
            instance = new AbyssalUnderlordPitOfMalice();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public double[] getEnsnareDuration() {
        return ensnare_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPitDamage() {
        return pit_damage;
    }

    public int getPitDuration() {
        return pit_duration;
    }

    public double getPitInterval() {
        return pit_interval;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbyssalUnderlordPitOfMalice))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlordPitOfMalice otherObject = (AbyssalUnderlordPitOfMalice) object;
        return otherObject.getKey().equals(getKey());
    }

}
