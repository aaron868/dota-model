package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CrystalMaidenBrillianceAura extends Ability {

    private static CrystalMaidenBrillianceAura instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final double[] mana_regen;
    private final double[] mana_regen_self;
    private final String owningHeroShortKey;

    private CrystalMaidenBrillianceAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCastPoint = .2;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        iD = 5128;
        key = "crystal_maiden_brilliance_aura";
        localizedName = "Brilliance Aura";
        mana_regen = new double[]{1.0,1.5,2.0,2.5};
        mana_regen_self = new double[]{2.0,3.0,4.0,5.0};
        owningHeroShortKey = "crystal_maiden";
    }

    public static CrystalMaidenBrillianceAura instance() {
        if( instance == null ){
            instance = new CrystalMaidenBrillianceAura();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getManaRegen() {
        return mana_regen;
    }

    public double[] getManaRegenSelf() {
        return mana_regen_self;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CrystalMaidenBrillianceAura))
            return false;
        if (object == this)
            return true;
        CrystalMaidenBrillianceAura otherObject = (CrystalMaidenBrillianceAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
