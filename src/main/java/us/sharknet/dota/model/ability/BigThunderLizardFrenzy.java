package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BigThunderLizardFrenzy extends Ability {

    private static BigThunderLizardFrenzy instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int attackspeed_bonus;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BigThunderLizardFrenzy() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{8,8,8,8};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5333;
        key = "big_thunder_lizard_frenzy";
        attackspeed_bonus = 75;
        duration = 8;
        localizedName = "Frenzy";
        ownerKey = "npc_dota_neutral_big_thunder_lizard";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static BigThunderLizardFrenzy instance() {
        if( instance == null ){
            instance = new BigThunderLizardFrenzy();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetTeam() {
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

    public int getAttackspeedBonus() {
        return attackspeed_bonus;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
