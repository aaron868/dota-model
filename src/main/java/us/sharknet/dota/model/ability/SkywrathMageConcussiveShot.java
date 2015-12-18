package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkywrathMageConcussiveShot extends Ability {

    private static SkywrathMageConcussiveShot instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int launch_radius;
    private final String localizedName;
    private final int[] movement_speed_pct;
    private final String owningHeroShortKey;
    private final int shot_vision;
    private final int slow_duration;
    private final int slow_radius;
    private final int[] speed;
    private final double vision_duration;

    private SkywrathMageConcussiveShot() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 1600;
        abilityCooldown = new double[]{18.0,16.0,14.0,12.0};
        abilityManaCost = 95;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5582;
        key = "skywrath_mage_concussive_shot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{60,120,180,240};
        launch_radius = 1600;
        localizedName = "Concussive Shot";
        movement_speed_pct = new int[]{30,35,40,45};
        owningHeroShortKey = "skywrath_mage";
        shot_vision = 400;
        slow_duration = 4;
        slow_radius = 200;
        speed = new int[]{800,800,800,800};
        vision_duration = 3.34;
    }

    public static SkywrathMageConcussiveShot instance() {
        if( instance == null ){
            instance = new SkywrathMageConcussiveShot();
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

    public int getAbilityManaCost() {
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

    public int[] getDamage() {
        return damage;
    }

    public int getLaunchRadius() {
        return launch_radius;
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

    public int getShotVision() {
        return shot_vision;
    }

    public int getSlowDuration() {
        return slow_duration;
    }

    public int getSlowRadius() {
        return slow_radius;
    }

    public int[] getSpeed() {
        return speed;
    }

    public double getVisionDuration() {
        return vision_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkywrathMageConcussiveShot))
            return false;
        if (object == this)
            return true;
        SkywrathMageConcussiveShot otherObject = (SkywrathMageConcussiveShot) object;
        return otherObject.getKey().equals(getKey());
    }

}
