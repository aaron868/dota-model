package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class StormSpiritBallLightning extends Ability {

    private static StormSpiritBallLightning instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityDamage;
    private final int abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] ball_lightning_aoe;
    private final int ball_lightning_initial_mana_base;
    private final int ball_lightning_initial_mana_percentage;
    private final int[] ball_lightning_move_speed;
    private final int ball_lightning_travel_cost_base;
    private final double ball_lightning_travel_cost_percent;
    private final int ball_lightning_vision_radius;
    private final int blocker_duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private StormSpiritBallLightning() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityDamage = new int[]{8,12,16};
        abilityManaCost = 3;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 511;
        key = "storm_spirit_ball_lightning";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        ball_lightning_aoe = new int[]{125,200,275};
        ball_lightning_initial_mana_base = 3;
        ball_lightning_initial_mana_percentage = 8;
        ball_lightning_move_speed = new int[]{1250,1875,2500};
        ball_lightning_travel_cost_base = 12;
        ball_lightning_travel_cost_percent = .7;
        ball_lightning_vision_radius = 4;
        blocker_duration = 5;
        localizedName = "Ball Lightning";
        owningHeroShortKey = "storm_spirit";
    }

    public static StormSpiritBallLightning instance() {
        if( instance == null ){
            instance = new StormSpiritBallLightning();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityManaCost() {
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

    public int[] getBallLightningAoe() {
        return ball_lightning_aoe;
    }

    public int getBallLightningInitialManaBase() {
        return ball_lightning_initial_mana_base;
    }

    public int getBallLightningInitialManaPercentage() {
        return ball_lightning_initial_mana_percentage;
    }

    public int[] getBallLightningMoveSpeed() {
        return ball_lightning_move_speed;
    }

    public int getBallLightningTravelCostBase() {
        return ball_lightning_travel_cost_base;
    }

    public double getBallLightningTravelCostPercent() {
        return ball_lightning_travel_cost_percent;
    }

    public int getBallLightningVisionRadius() {
        return ball_lightning_vision_radius;
    }

    public int getBlockerDuration() {
        return blocker_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof StormSpiritBallLightning))
            return false;
        if (object == this)
            return true;
        StormSpiritBallLightning otherObject = (StormSpiritBallLightning) object;
        return otherObject.getKey().equals(getKey());
    }

}
