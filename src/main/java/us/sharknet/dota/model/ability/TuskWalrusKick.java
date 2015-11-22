package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskWalrusKick extends Ability {

    private static TuskWalrusKick instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final int isGrantedByScepter;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int air_time;
    private final int cooldown_scepter;
    private final int crit_multiplier;
    private final int damage;
    private final String localizedName;
    private final int move_slow;
    private final String owningHeroShortKey;
    private final int push_length;
    private final int slow_duration;

    private TuskWalrusKick() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = .2;
        abilityCastRange = 128;
        abilityCooldown = 12;
        abilityManaCost = 100;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5672;
        isGrantedByScepter = 1;
        key = "tusk_walrus_kick";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        air_time = 1;
        cooldown_scepter = 12;
        crit_multiplier = 0;
        damage = 200;
        localizedName = "Walrus Kick";
        move_slow = 40;
        owningHeroShortKey = "tusk";
        push_length = 900;
        slow_duration = 4;
    }

    public static TuskWalrusKick instance() {
        if( instance == null ){
            instance = new TuskWalrusKick();
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getAirTime() {
        return air_time;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
    }

    public int getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSlow() {
        return move_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPushLength() {
        return push_length;
    }

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TuskWalrusKick))
            return false;
        if (object == this)
            return true;
        TuskWalrusKick otherObject = (TuskWalrusKick) object;
        return otherObject.getKey().equals(getKey());
    }

}
