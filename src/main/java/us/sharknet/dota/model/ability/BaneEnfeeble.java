package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BaneEnfeeble extends Ability {

    private static BaneEnfeeble instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] enfeeble_attack_reduction;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BaneEnfeeble() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 1;
        abilityCooldown = 8;
        abilityDuration = new double[]{20.0,20.0,20.0,20.0};
        abilityManaCost = new int[]{95,105,115,125};
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 512;
        key = "bane_enfeeble";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        enfeeble_attack_reduction = new int[]{-30,-60,-90,-120};
        localizedName = "Enfeeble";
        owningHeroShortKey = "bane";
    }

    public static BaneEnfeeble instance() {
        if( instance == null ){
            instance = new BaneEnfeeble();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getEnfeebleAttackReduction() {
        return enfeeble_attack_reduction;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BaneEnfeeble))
            return false;
        if (object == this)
            return true;
        BaneEnfeeble otherObject = (BaneEnfeeble) object;
        return otherObject.getKey().equals(getKey());
    }

}
