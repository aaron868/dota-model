package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JakiroDualBreath extends Ability {

    private static JakiroDualBreath instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityDamage;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] burn_damage;
    private final int[] end_radius;
    private final double[] fire_delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] range;
    private final int[] slow_attack_speed_pct;
    private final int[] slow_movement_speed_pct;
    private final int speed;
    private final int speed_fire;
    private final int[] start_radius;
    private final int tooltip_duration;

    private JakiroDualBreath() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.65,0.65,0.65,0.65};
        abilityCastRange = 750;
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityDamage = 0;
        abilityDuration = 5;
        abilityManaCost = new int[]{135,140,155,170};
        abilityModifierSupportValue = .25;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5297;
        key = "jakiro_dual_breath";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_damage = new int[]{20,40,60,80};
        end_radius = new int[]{250,250,250,250};
        fire_delay = new double[]{0.3,0.3,0.3,0.3};
        localizedName = "Dual Breath";
        owningHeroShortKey = "jakiro";
        range = new int[]{750,750,750,750};
        slow_attack_speed_pct = new int[]{-28,-32,-36,-40};
        slow_movement_speed_pct = new int[]{-28,-32,-36,-40};
        speed = 1050;
        speed_fire = 1050;
        start_radius = new int[]{200,200,200,200};
        tooltip_duration = 5;
    }

    public static JakiroDualBreath instance() {
        if( instance == null ){
            instance = new JakiroDualBreath();
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

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityDuration() {
        return abilityDuration;
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

    public int[] getBurnDamage() {
        return burn_damage;
    }

    public int[] getEndRadius() {
        return end_radius;
    }

    public double[] getFireDelay() {
        return fire_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRange() {
        return range;
    }

    public int[] getSlowAttackSpeedPct() {
        return slow_attack_speed_pct;
    }

    public int[] getSlowMovementSpeedPct() {
        return slow_movement_speed_pct;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpeedFire() {
        return speed_fire;
    }

    public int[] getStartRadius() {
        return start_radius;
    }

    public int getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof JakiroDualBreath))
            return false;
        if (object == this)
            return true;
        JakiroDualBreath otherObject = (JakiroDualBreath) object;
        return otherObject.getKey().equals(getKey());
    }

}
