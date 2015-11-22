package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JakiroLiquidFire extends Ability {

    private static JakiroLiquidFire instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final double[] abilityDuration;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] slow_attack_speed_pct;
    private final int[] tooltip_duration;

    private JakiroLiquidFire() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 6;
        abilityCooldown = new int[]{20,15,10,4};
        abilityDuration = new double[]{5.0,5.0,5.0,5.0};
        abilityModifierSupportBonus = 35;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_BUILDING"};
        iD = 5299;
        key = "jakiro_liquid_fire";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage = new int[]{12,16,20,24};
        localizedName = "Liquid Fire";
        owningHeroShortKey = "jakiro";
        radius = new int[]{300,300,300,300};
        slow_attack_speed_pct = new int[]{-20,-30,-40,-50};
        tooltip_duration = new int[]{5,5,5,5};
    }

    public static JakiroLiquidFire instance() {
        if( instance == null ){
            instance = new JakiroLiquidFire();
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int[] getSlowAttackSpeedPct() {
        return slow_attack_speed_pct;
    }

    public int[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof JakiroLiquidFire))
            return false;
        if (object == this)
            return true;
        JakiroLiquidFire otherObject = (JakiroLiquidFire) object;
        return otherObject.getKey().equals(getKey());
    }

}
