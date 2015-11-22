package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LeshracSplitEarth extends Ability {

    private static LeshracSplitEarth instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double delay;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private LeshracSplitEarth() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.7,0.7,0.7,0.7};
        abilityCastRange = 75;
        abilityCooldown = new int[]{9,9,9,9};
        abilityDamage = new int[]{120,180,240,300};
        abilityDuration = new int[]{2,2,2,2};
        abilityManaCost = new int[]{100,125,140,160};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5241;
        key = "leshrac_split_earth";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        delay = .35;
        duration = 2;
        localizedName = "Split Earth";
        owningHeroShortKey = "leshrac";
        radius = new int[]{150,175,200,225};
    }

    public static LeshracSplitEarth instance() {
        if( instance == null ){
            instance = new LeshracSplitEarth();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public double getDelay() {
        return delay;
    }

    public int getDuration() {
        return duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LeshracSplitEarth))
            return false;
        if (object == this)
            return true;
        LeshracSplitEarth otherObject = (LeshracSplitEarth) object;
        return otherObject.getKey().equals(getKey());
    }

}
