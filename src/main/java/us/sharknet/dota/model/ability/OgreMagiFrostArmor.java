package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiFrostArmor extends Ability {

    private static OgreMagiFrostArmor instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int armor_bonus;
    private final int attackspeed_slow;
    private final int duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final String owningHeroShortKey;
    private final int slow_duration;

    private OgreMagiFrostArmor() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = .56;
        abilityCastRange = 8;
        abilityCooldown = 5;
        abilityManaCost = 4;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 534;
        key = "ogre_magi_frost_armor";
        maxLevel = 1;
        armor_bonus = 8;
        attackspeed_slow = -2;
        duration = 45;
        localizedName = "Frost Armor";
        movespeed_slow = -3;
        owningHeroShortKey = "ogre_magi";
        slow_duration = 5;
    }

    public static OgreMagiFrostArmor instance() {
        if( instance == null ){
            instance = new OgreMagiFrostArmor();
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getArmorBonus() {
        return armor_bonus;
    }

    public int getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiFrostArmor))
            return false;
        if (object == this)
            return true;
        OgreMagiFrostArmor otherObject = (OgreMagiFrostArmor) object;
        return otherObject.getKey().equals(getKey());
    }

}
