package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ArcWardenSparkWraith extends Ability {

    private static ArcWardenSparkWraith instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int activation_delay;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] spark_damage;
    private final double think_interval;
    private final int wraith_speed;
    private final double wraith_vision_duration;
    private final int wraith_vision_radius;

    private ArcWardenSparkWraith() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = .3;
        abilityCastRange = 2000;
        abilityCooldown = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5679;
        key = "arc_warden_spark_wraith";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        activation_delay = 3;
        duration = 5;
        localizedName = "Spark Wraith";
        owningHeroShortKey = "arc_warden";
        radius = 375;
        spark_damage = new int[]{150,200,250,300};
        think_interval = .2;
        wraith_speed = 400;
        wraith_vision_duration = 3.34;
        wraith_vision_radius = 300;
    }

    public static ArcWardenSparkWraith instance() {
        if( instance == null ){
            instance = new ArcWardenSparkWraith();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getActivationDelay() {
        return activation_delay;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getSparkDamage() {
        return spark_damage;
    }

    public double getThinkInterval() {
        return think_interval;
    }

    public int getWraithSpeed() {
        return wraith_speed;
    }

    public double getWraithVisionDuration() {
        return wraith_vision_duration;
    }

    public int getWraithVisionRadius() {
        return wraith_vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ArcWardenSparkWraith))
            return false;
        if (object == this)
            return true;
        ArcWardenSparkWraith otherObject = (ArcWardenSparkWraith) object;
        return otherObject.getKey().equals(getKey());
    }

}
