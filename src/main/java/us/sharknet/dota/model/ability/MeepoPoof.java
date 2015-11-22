package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MeepoPoof extends Ability {

    private static MeepoPoof instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityChannelTime;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private MeepoPoof() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT | | DOTA_ABILITY_BEHAVIOR_UNIT_TARGET | DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN | DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING";
        abilityCastPoint = 1.5;
        abilityChannelTime = 0;
        abilityCooldown = new int[]{12,10,8,6};
        abilityDamage = new int[]{80,100,120,140};
        abilityManaCost = 80;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 5431;
        key = "meepo_poof";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Poof";
        owningHeroShortKey = "meepo";
        radius = 375;
    }

    public static MeepoPoof instance() {
        if( instance == null ){
            instance = new MeepoPoof();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MeepoPoof))
            return false;
        if (object == this)
            return true;
        MeepoPoof otherObject = (MeepoPoof) object;
        return otherObject.getKey().equals(getKey());
    }

}
