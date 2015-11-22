package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BloodseekerRupture extends Ability {

    private static BloodseekerRupture instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_range_tooltip;
    private final int damage_cap_amount;
    private final double damage_cap_interval;
    private final int duration;
    private final String localizedName;
    private final int[] movement_damage_pct;
    private final String owningHeroShortKey;

    private BloodseekerRupture() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .6;
        abilityCastRange = 1;
        abilityCooldown = 6;
        abilityManaCost = new int[]{150,200,250};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 518;
        key = "bloodseeker_rupture";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cast_range_tooltip = 1;
        damage_cap_amount = 2;
        damage_cap_interval = .25;
        duration = 12;
        localizedName = "Rupture";
        movement_damage_pct = new int[]{20,40,60};
        owningHeroShortKey = "bloodseeker";
    }

    public static BloodseekerRupture instance() {
        if( instance == null ){
            instance = new BloodseekerRupture();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
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

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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