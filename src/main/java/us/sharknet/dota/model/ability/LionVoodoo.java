package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LionVoodoo extends Ability {

    private static LionVoodoo instance;

    private final String abilityBehavior;
    private final int[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final int movespeed;
    private final String owningHeroShortKey;

    private LionVoodoo() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCastRange = 5;
        abilityCooldown = new double[]{30.0,24.0,18.0,12.0};
        abilityManaCost = new int[]{125,150,175,200};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 545;
        key = "lion_voodoo";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{2.5,3.0,3.5,4.0};
        localizedName = "Voodoo";
        movespeed = 14;
        owningHeroShortKey = "lion";
    }

    public static LionVoodoo instance() {
        if( instance == null ){
            instance = new LionVoodoo();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LionVoodoo))
            return false;
        if (object == this)
            return true;
        LionVoodoo otherObject = (LionVoodoo) object;
        return otherObject.getKey().equals(getKey());
    }

}
