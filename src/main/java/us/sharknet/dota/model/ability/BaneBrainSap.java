package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BaneBrainSap extends Ability {

    private static BaneBrainSap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] tooltip_brain_sap_heal_amt;

    private BaneBrainSap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{14.0,14.0,14.0,14.0};
        abilityDamage = new int[]{90,160,230,300};
        abilityManaCost = new int[]{70,100,130,160};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5011;
        key = "bane_brain_sap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Brain Sap";
        ownerKey = "npc_dota_hero_bane";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_brain_sap_heal_amt = new int[]{90,160,230,300};
    }

    public static BaneBrainSap instance() {
        if( instance == null ){
            instance = new BaneBrainSap();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
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

    public int[] getTooltipBrainSapHealAmt() {
        return tooltip_brain_sap_heal_amt;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BaneBrainSap))
            return false;
        if (object == this)
            return true;
        BaneBrainSap otherObject = (BaneBrainSap) object;
        return otherObject.getKey().equals(getKey());
    }

}
