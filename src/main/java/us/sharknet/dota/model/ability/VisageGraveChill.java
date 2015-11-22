package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VisageGraveChill extends Ability {

    private static VisageGraveChill instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attackspeed_bonus;
    private final double[] chill_duration;
    private final String localizedName;
    private final int[] movespeed_bonus;
    private final String owningHeroShortKey;

    private VisageGraveChill() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{16.0,14.0,12.0,10.0};
        abilityManaCost = 100;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5480;
        key = "visage_grave_chill";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackspeed_bonus = new int[]{64,64,64,64};
        chill_duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Grave Chill";
        movespeed_bonus = new int[]{32,32,32,32};
        owningHeroShortKey = "visage";
    }

    public static VisageGraveChill instance() {
        if( instance == null ){
            instance = new VisageGraveChill();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
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

    public int[] getAttackspeedBonus() {
        return attackspeed_bonus;
    }

    public double[] getChillDuration() {
        return chill_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeedBonus() {
        return movespeed_bonus;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VisageGraveChill))
            return false;
        if (object == this)
            return true;
        VisageGraveChill otherObject = (VisageGraveChill) object;
        return otherObject.getKey().equals(getKey());
    }

}
