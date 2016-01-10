package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecrolyteHeartstopperAura extends Ability {

    private static NecrolyteHeartstopperAura instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] aura_damage;
    private final int aura_radius;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NecrolyteHeartstopperAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        iD = 5159;
        key = "necrolyte_heartstopper_aura";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        aura_damage = new double[]{0.6,0.9,1.2,1.5};
        aura_radius = 1200;
        localizedName = "Heartstopper Aura";
        ownerKey = "npc_dota_hero_necrolyte";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static NecrolyteHeartstopperAura instance() {
        if( instance == null ){
            instance = new NecrolyteHeartstopperAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getAuraDamage() {
        return aura_damage;
    }

    public int getAuraRadius() {
        return aura_radius;
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
        if (!(object instanceof NecrolyteHeartstopperAura))
            return false;
        if (object == this)
            return true;
        NecrolyteHeartstopperAura otherObject = (NecrolyteHeartstopperAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
