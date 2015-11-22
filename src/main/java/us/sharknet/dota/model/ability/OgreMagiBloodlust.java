package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiBloodlust extends Ability {

    private static OgreMagiBloodlust instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_speed;
    private final int[] bonus_movement_speed;
    private final int duration;
    private final String localizedName;
    private final int modelscale;
    private final String owningHeroShortKey;

    private OgreMagiBloodlust() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = .45;
        abilityCastRange = 6;
        abilityCooldown = 2;
        abilityManaCost = 75;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_BUILDING"};
        iD = 544;
        key = "ogre_magi_bloodlust";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        bonus_attack_speed = new int[]{30,40,50,60};
        bonus_movement_speed = new int[]{10,12,14,16};
        duration = 3;
        localizedName = "Bloodlust";
        modelscale = 25;
        owningHeroShortKey = "ogre_magi";
    }

    public static OgreMagiBloodlust instance() {
        if( instance == null ){
            instance = new OgreMagiBloodlust();
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

    public int getAbilityCooldown() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getModelscale() {
        return modelscale;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiBloodlust))
            return false;
        if (object == this)
            return true;
        OgreMagiBloodlust otherObject = (OgreMagiBloodlust) object;
        return otherObject.getKey().equals(getKey());
    }

}
