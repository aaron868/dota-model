package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BloodseekerBloodrage extends Ability {

    private static BloodseekerBloodrage instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_increase_pct;
    private final double[] duration;
    private final int[] health_bonus_creep_pct;
    private final int[] health_bonus_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BloodseekerBloodrage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{12,10,8,6};
        abilityManaCost = new int[]{0,0,0,0};
        abilityModifierSupportValue = .1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5015;
        key = "bloodseeker_bloodrage";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage_increase_pct = new int[]{25,30,35,40};
        duration = new double[]{9.0,10.0,11.0,12.0};
        health_bonus_creep_pct = new int[]{19,21,23,25};
        health_bonus_pct = new int[]{19,21,23,25};
        localizedName = "Bloodrage";
        ownerKey = "npc_dota_hero_bloodseeker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static BloodseekerBloodrage instance() {
        if( instance == null ){
            instance = new BloodseekerBloodrage();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int[] getDamageIncreasePct() {
        return damage_increase_pct;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getHealthBonusCreepPct() {
        return health_bonus_creep_pct;
    }

    public int[] getHealthBonusPct() {
        return health_bonus_pct;
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
        if (!(object instanceof BloodseekerBloodrage))
            return false;
        if (object == this)
            return true;
        BloodseekerBloodrage otherObject = (BloodseekerBloodrage) object;
        return otherObject.getKey().equals(getKey());
    }

}
