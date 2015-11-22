package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesRemoteMines extends Ability {

    private static TechiesRemoteMines instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int activation_time;
    private final int cast_range_scepter;
    private final int cast_range_tooltip;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int duration;
    private final String localizedName;
    private final int max_mines;
    private final int[] model_scale;
    private final String owningHeroShortKey;
    private final int radius;
    private final int radius_scepter;
    private final int vision_duration;
    private final int vision_radius;

    private TechiesRemoteMines() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN"};
        abilityCastPoint = new double[]{1.5,1.5,1.5};
        abilityCastRange = 5;
        abilityCooldown = new double[]{10.0,10.0,10.0};
        abilityManaCost = new int[]{200,240,300};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 562;
        key = "techies_remote_mines";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        activation_time = 2;
        cast_range_scepter = 7;
        cast_range_tooltip = 5;
        damage = new int[]{300,450,600};
        damage_scepter = new int[]{450,600,750};
        duration = 6;
        localizedName = "Remote Mines";
        max_mines = 21;
        model_scale = new int[]{0,10,20};
        owningHeroShortKey = "techies";
        radius = 425;
        radius_scepter = 425;
        vision_duration = 3;
        vision_radius = 5;
    }

    public static TechiesRemoteMines instance() {
        if( instance == null ){
            instance = new TechiesRemoteMines();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getActivationTime() {
        return activation_time;
    }

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxMines() {
        return max_mines;
    }

    public int[] getModelScale() {
        return model_scale;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getRadiusScepter() {
        return radius_scepter;
    }

    public int getVisionDuration() {
        return vision_duration;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesRemoteMines))
            return false;
        if (object == this)
            return true;
        TechiesRemoteMines otherObject = (TechiesRemoteMines) object;
        return otherObject.getKey().equals(getKey());
    }

}
