package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnchantressImpetus extends Ability {

    private static EnchantressImpetus instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_range_scepter;
    private final int[] distance_damage_cap;
    private final double[] distance_damage_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private EnchantressImpetus() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0};
        abilityCastRange = 550;
        abilityCooldown = new double[]{0.0,0.0,0.0};
        abilityDuration = new double[]{1.5,1.5,1.5};
        abilityManaCost = new int[]{55,60,65};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5270;
        key = "enchantress_impetus";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_attack_range_scepter = new int[]{190,190,190};
        distance_damage_cap = new int[]{375,500,625};
        distance_damage_pct = new double[]{15.0,20.0,25.0};
        localizedName = "Impetus";
        owningHeroShortKey = "enchantress";
    }

    public static EnchantressImpetus instance() {
        if( instance == null ){
            instance = new EnchantressImpetus();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getBonusAttackRangeScepter() {
        return bonus_attack_range_scepter;
    }

    public int[] getDistanceDamageCap() {
        return distance_damage_cap;
    }

    public double[] getDistanceDamagePct() {
        return distance_damage_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnchantressImpetus))
            return false;
        if (object == this)
            return true;
        EnchantressImpetus otherObject = (EnchantressImpetus) object;
        return otherObject.getKey().equals(getKey());
    }

}
