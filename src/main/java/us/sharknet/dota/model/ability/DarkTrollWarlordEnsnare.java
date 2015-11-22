package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DarkTrollWarlordEnsnare extends Ability {

    private static DarkTrollWarlordEnsnare instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final double duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DarkTrollWarlordEnsnare() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .5;
        abilityCastRange = 550;
        abilityCooldown = 2;
        abilityManaCost = 150;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5305;
        key = "dark_troll_warlord_ensnare";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = 1.75;
        localizedName = "Ensnare";
        owningHeroShortKey = "dark_troll_warlord";
    }

    public static DarkTrollWarlordEnsnare instance() {
        if( instance == null ){
            instance = new DarkTrollWarlordEnsnare();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DarkTrollWarlordEnsnare))
            return false;
        if (object == this)
            return true;
        DarkTrollWarlordEnsnare otherObject = (DarkTrollWarlordEnsnare) object;
        return otherObject.getKey().equals(getKey());
    }

}
