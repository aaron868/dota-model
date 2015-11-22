package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpiritBreakerNetherStrike extends Ability {

    private static SpiritBreakerNetherStrike instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCastRangeBuffer;
    private final int[] abilityCooldown;
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
    private final int[] bash_radius_scepter;
    private final int cast_range_scepter;
    private final double[] cooldown_scepter;
    private final int[] damage;
    private final double[] fade_time;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int tooltip_range;

    private SpiritBreakerNetherStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 1.2;
        abilityCastRange = 7;
        abilityCastRangeBuffer = 5;
        abilityCooldown = new int[]{80,70,60};
        abilityManaCost = new int[]{125,150,175};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 5356;
        key = "spirit_breaker_nether_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bash_radius_scepter = new int[]{250,250,250};
        cast_range_scepter = 85;
        cooldown_scepter = new double[]{20.0,20.0,20.0};
        damage = new int[]{150,250,350};
        fade_time = new double[]{1.0,1.0,1.0};
        localizedName = "Nether Strike";
        owningHeroShortKey = "spirit_breaker";
        tooltip_range = 7;
    }

    public static SpiritBreakerNetherStrike instance() {
        if( instance == null ){
            instance = new SpiritBreakerNetherStrike();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCastRangeBuffer() {
        return abilityCastRangeBuffer;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int[] getBashRadiusScepter() {
        return bash_radius_scepter;
    }

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SpiritBreakerNetherStrike))
            return false;
        if (object == this)
            return true;
        SpiritBreakerNetherStrike otherObject = (SpiritBreakerNetherStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
