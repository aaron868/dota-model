package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BloodseekerRupture extends Ability {

    private static BloodseekerRupture instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_range_tooltip;
    private final int damage_cap_amount;
    private final double damage_cap_interval;
    private final int duration;
    private final String localizedName;
    private final int[] movement_damage_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BloodseekerRupture() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.6,.6,.6,.6};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{60,60,60,60};
        abilityManaCost = new int[]{150,200,250};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5018;
        key = "bloodseeker_rupture";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cast_range_tooltip = 1000;
        damage_cap_amount = 200;
        damage_cap_interval = .25;
        duration = 12;
        localizedName = "Rupture";
        movement_damage_pct = new int[]{20,40,60};
        ownerKey = "npc_dota_hero_bloodseeker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static BloodseekerRupture instance() {
        if( instance == null ){
            instance = new BloodseekerRupture();
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

    public String getAbilityType() {
        return abilityType;
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

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public int getDamageCapAmount() {
        return damage_cap_amount;
    }

    public double getDamageCapInterval() {
        return damage_cap_interval;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementDamagePct() {
        return movement_damage_pct;
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
        if (!(object instanceof BloodseekerRupture))
            return false;
        if (object == this)
            return true;
        BloodseekerRupture otherObject = (BloodseekerRupture) object;
        return otherObject.getKey().equals(getKey());
    }

}
