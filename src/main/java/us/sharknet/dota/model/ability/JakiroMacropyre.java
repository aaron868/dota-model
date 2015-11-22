package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JakiroMacropyre extends Ability {

    private static JakiroMacropyre instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] burn_interval;
    private final int cast_range;
    private final int cast_range_scepter;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int duration;
    private final int duration_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int path_radius;
    private final int tooltip_duration;

    private JakiroMacropyre() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.65,0.65,0.65,0.65};
        abilityCastRange = 9;
        abilityCooldown = new int[]{60,60,60};
        abilityManaCost = new int[]{220,330,440};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 53;
        key = "jakiro_macropyre";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_interval = new double[]{0.5,0.5,0.5};
        cast_range = 9;
        cast_range_scepter = 18;
        damage = new int[]{100,140,180};
        damage_scepter = new int[]{125,175,225};
        duration = 1;
        duration_scepter = 2;
        localizedName = "Macropyre";
        owningHeroShortKey = "jakiro";
        path_radius = 24;
        tooltip_duration = 1;
    }

    public static JakiroMacropyre instance() {
        if( instance == null ){
            instance = new JakiroMacropyre();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getBurnInterval() {
        return burn_interval;
    }

    public int getCastRange() {
        return cast_range;
    }

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationScepter() {
        return duration_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPathRadius() {
        return path_radius;
    }

    public int getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof JakiroMacropyre))
            return false;
        if (object == this)
            return true;
        JakiroMacropyre otherObject = (JakiroMacropyre) object;
        return otherObject.getKey().equals(getKey());
    }

}
