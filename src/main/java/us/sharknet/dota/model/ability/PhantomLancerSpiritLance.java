package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomLancerSpiritLance extends Ability {

    private static PhantomLancerSpiritLance instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double duration;
    private final int fake_lance_distance;
    private final int[] illusion_damage_in_pct;
    private final int[] illusion_damage_out_pct;
    private final double[] illusion_duration;
    private final int[] lance_speed;
    private final String localizedName;
    private final int[] movement_speed_pct;
    private final String owningHeroShortKey;
    private final int[] tooltip_illusion_damage;
    private final int[] tooltip_illusion_total_damage_in_pct;

    private PhantomLancerSpiritLance() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 75;
        abilityCooldown = new double[]{7.0,7.0,7.0,7.0};
        abilityDamage = new int[]{100,150,200,250};
        abilityManaCost = new int[]{125,130,135,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 565;
        key = "phantom_lancer_spirit_lance";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 3.25;
        fake_lance_distance = 675;
        illusion_damage_in_pct = new int[]{300,300,300,300};
        illusion_damage_out_pct = new int[]{-80,-80,-80,-80};
        illusion_duration = new double[]{2.0,4.0,6.0,8.0};
        lance_speed = new int[]{1000,1000,1000,1000};
        localizedName = "Spirit Lance";
        movement_speed_pct = new int[]{-10,-20,-30,-40};
        owningHeroShortKey = "phantom_lancer";
        tooltip_illusion_damage = new int[]{20,20,20,20};
        tooltip_illusion_total_damage_in_pct = new int[]{400,400,400,400};
    }

    public static PhantomLancerSpiritLance instance() {
        if( instance == null ){
            instance = new PhantomLancerSpiritLance();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public double getDuration() {
        return duration;
    }

    public int getFakeLanceDistance() {
        return fake_lance_distance;
    }

    public int[] getIllusionDamageInPct() {
        return illusion_damage_in_pct;
    }

    public int[] getIllusionDamageOutPct() {
        return illusion_damage_out_pct;
    }

    public double[] getIllusionDuration() {
        return illusion_duration;
    }

    public int[] getLanceSpeed() {
        return lance_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeedPct() {
        return movement_speed_pct;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getTooltipIllusionDamage() {
        return tooltip_illusion_damage;
    }

    public int[] getTooltipIllusionTotalDamageInPct() {
        return tooltip_illusion_total_damage_in_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomLancerSpiritLance))
            return false;
        if (object == this)
            return true;
        PhantomLancerSpiritLance otherObject = (PhantomLancerSpiritLance) object;
        return otherObject.getKey().equals(getKey());
    }

}
