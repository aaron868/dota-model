package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BigThunderLizardFrenzy extends Ability {

    private static BigThunderLizardFrenzy instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int attackspeed_bonus;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BigThunderLizardFrenzy() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 900;
        abilityCooldown = 8;
        abilityManaCost = 50;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5333;
        key = "big_thunder_lizard_frenzy";
        maxLevel = 1;
        attackspeed_bonus = 75;
        duration = 8;
        localizedName = "Frenzy";
        owningHeroShortKey = "big_thunder_lizard";
    }

    public static BigThunderLizardFrenzy instance() {
        if( instance == null ){
            instance = new BigThunderLizardFrenzy();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
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

    public int getAttackspeedBonus() {
        return attackspeed_bonus;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BigThunderLizardFrenzy))
            return false;
        if (object == this)
            return true;
        BigThunderLizardFrenzy otherObject = (BigThunderLizardFrenzy) object;
        return otherObject.getKey().equals(getKey());
    }

}
