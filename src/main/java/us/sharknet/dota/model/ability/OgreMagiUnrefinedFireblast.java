package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiUnrefinedFireblast extends Ability {

    private static OgreMagiUnrefinedFireblast instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final int isGrantedByScepter;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final String localizedName;
    private final double multicast_delay;
    private final String owningHeroShortKey;
    private final double scepter_mana;
    private final double stun_duration;

    private OgreMagiUnrefinedFireblast() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .45;
        abilityCastRange = 475;
        abilityCooldown = 6;
        abilityDamage = 275;
        abilityManaCost = 400;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5466;
        isGrantedByScepter = 1;
        key = "ogre_magi_unrefined_fireblast";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Unrefined Fireblast";
        multicast_delay = .4;
        owningHeroShortKey = "ogre_magi";
        scepter_mana = .6;
        stun_duration = 1.5;
    }

    public static OgreMagiUnrefinedFireblast instance() {
        if( instance == null ){
            instance = new OgreMagiUnrefinedFireblast();
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

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityManaCost() {
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

    public int getIsGrantedByScepter() {
        return isGrantedByScepter;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public double getMulticastDelay() {
        return multicast_delay;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getScepterMana() {
        return scepter_mana;
    }

    public double getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiUnrefinedFireblast))
            return false;
        if (object == this)
            return true;
        OgreMagiUnrefinedFireblast otherObject = (OgreMagiUnrefinedFireblast) object;
        return otherObject.getKey().equals(getKey());
    }

}
