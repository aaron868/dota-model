package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkywrathMageAncientSeal extends Ability {

    private static SkywrathMageAncientSeal instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] resist_debuff;
    private final double[] seal_duration;

    private SkywrathMageAncientSeal() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = 7;
        abilityCooldown = 14;
        abilityManaCost = new int[]{80,90,100,110};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5583;
        key = "skywrath_mage_ancient_seal";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Ancient Seal";
        owningHeroShortKey = "skywrath_mage";
        resist_debuff = new int[]{-30,-35,-40,-45};
        seal_duration = new double[]{3.0,4.0,5.0,6.0};
    }

    public static SkywrathMageAncientSeal instance() {
        if( instance == null ){
            instance = new SkywrathMageAncientSeal();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getAbilityManaCost() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getResistDebuff() {
        return resist_debuff;
    }

    public double[] getSealDuration() {
        return seal_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkywrathMageAncientSeal))
            return false;
        if (object == this)
            return true;
        SkywrathMageAncientSeal otherObject = (SkywrathMageAncientSeal) object;
        return otherObject.getKey().equals(getKey());
    }

}
