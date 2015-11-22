package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockFatalBonds extends Ability {

    private static WarlockFatalBonds instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] count;
    private final int damage_share_percentage;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int search_aoe;

    private WarlockFatalBonds() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .2;
        abilityCastRange = 1000;
        abilityCooldown = new double[]{25.0,25.0,25.0,25.0};
        abilityDamage = new int[]{0,0,0,0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = 0;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5162;
        key = "warlock_fatal_bonds";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        count = new int[]{3,4,5,6};
        damage_share_percentage = 25;
        duration = 25;
        localizedName = "Fatal Bonds";
        owningHeroShortKey = "warlock";
        search_aoe = 7;
    }

    public static WarlockFatalBonds instance() {
        if( instance == null ){
            instance = new WarlockFatalBonds();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getCount() {
        return count;
    }

    public int getDamageSharePercentage() {
        return damage_share_percentage;
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

    public int getSearchAoe() {
        return search_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WarlockFatalBonds))
            return false;
        if (object == this)
            return true;
        WarlockFatalBonds otherObject = (WarlockFatalBonds) object;
        return otherObject.getKey().equals(getKey());
    }

}
