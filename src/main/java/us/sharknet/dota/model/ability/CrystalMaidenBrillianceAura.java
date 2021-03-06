package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CrystalMaidenBrillianceAura extends Ability {

    private static CrystalMaidenBrillianceAura instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final double[] mana_regen;
    private final double[] mana_regen_self;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private CrystalMaidenBrillianceAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        iD = 5128;
        key = "crystal_maiden_brilliance_aura";
        localizedName = "Arcane Aura";
        mana_regen = new double[]{1.0,1.5,2.0,3.0};
        mana_regen_self = new double[]{2.0,3.0,4.0,6.0};
        ownerKey = "npc_dota_hero_crystal_maiden";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static CrystalMaidenBrillianceAura instance() {
        if( instance == null ){
            instance = new CrystalMaidenBrillianceAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public String[] getAbilityUnitTargetTeam() {
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
        if (!(object instanceof CrystalMaidenBrillianceAura))
            return false;
        if (object == this)
            return true;
        CrystalMaidenBrillianceAura otherObject = (CrystalMaidenBrillianceAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
