package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GyrocopterCallDown extends Ability {

    private static GyrocopterCallDown instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_first;
    private final int[] damage_second;
    private final int[] damage_second_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int range_scepter;
    private final int slow_duration_first;
    private final int slow_duration_second;
    private final int slow_first;
    private final int slow_second;

    private GyrocopterCallDown() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = 1000;
        abilityCooldown = new int[]{55,50,45};
        abilityManaCost = new int[]{125,125,125};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5364;
        key = "gyrocopter_call_down";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_first = new int[]{250,300,350};
        damage_second = new int[]{100,150,200};
        damage_second_scepter = new int[]{175,225,275};
        localizedName = "Call Down";
        owningHeroShortKey = "gyrocopter";
        radius = 600;
        range_scepter = 0;
        slow_duration_first = 2;
        slow_duration_second = 4;
        slow_first = 3;
        slow_second = 6;
    }

    public static GyrocopterCallDown instance() {
        if( instance == null ){
            instance = new GyrocopterCallDown();
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getDamageFirst() {
        return damage_first;
    }

    public int[] getDamageSecond() {
        return damage_second;
    }

    public int[] getDamageSecondScepter() {
        return damage_second_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getRangeScepter() {
        return range_scepter;
    }

    public int getSlowDurationFirst() {
        return slow_duration_first;
    }

    public int getSlowDurationSecond() {
        return slow_duration_second;
    }

    public int getSlowFirst() {
        return slow_first;
    }

    public int getSlowSecond() {
        return slow_second;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GyrocopterCallDown))
            return false;
        if (object == this)
            return true;
        GyrocopterCallDown otherObject = (GyrocopterCallDown) object;
        return otherObject.getKey().equals(getKey());
    }

}
