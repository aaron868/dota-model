package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockUpheaval extends Ability {

    private static WarlockUpheaval instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityChannelTime;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] aoe;
    private final int duration;
    private final String localizedName;
    private final int max_slow;
    private final String owningHeroShortKey;
    private final double[] slow_rate_duration;

    private WarlockUpheaval() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 12;
        abilityChannelTime = 16;
        abilityCooldown = new int[]{50,46,42,38};
        abilityDamage = new int[]{0,0,0,0};
        abilityManaCost = new int[]{100,110,120,130};
        iD = 5164;
        key = "warlock_upheaval";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        aoe = new double[]{650.0,650.0,650.0,650.0};
        duration = 3;
        localizedName = "Upheaval";
        max_slow = 84;
        owningHeroShortKey = "warlock";
        slow_rate_duration = new double[]{12.5,6.5,4.5,3.5};
    }

    public static WarlockUpheaval instance() {
        if( instance == null ){
            instance = new WarlockUpheaval();
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

    public int getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getAoe() {
        return aoe;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxSlow() {
        return max_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getSlowRateDuration() {
        return slow_rate_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WarlockUpheaval))
            return false;
        if (object == this)
            return true;
        WarlockUpheaval otherObject = (WarlockUpheaval) object;
        return otherObject.getKey().equals(getKey());
    }

}
