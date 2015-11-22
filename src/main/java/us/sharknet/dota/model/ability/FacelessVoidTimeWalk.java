package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidTimeWalk extends Ability {

    private static FacelessVoidTimeWalk instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final int[] movement_speed_pct;
    private final String owningHeroShortKey;
    private final int radius;
    private final int speed;
    private final int[] tooltip_range;

    private FacelessVoidTimeWalk() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = new int[]{700,900,1100,1300};
        abilityCooldown = new double[]{19.0,17.0,15.0,13.0};
        abilityManaCost = 9;
        abilityModifierSupportValue = .25;
        iD = 5182;
        key = "faceless_void_time_walk";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 3;
        localizedName = "Time Walk";
        movement_speed_pct = new int[]{-20,-30,-40,-50};
        owningHeroShortKey = "faceless_void";
        radius = 3;
        speed = 3;
        tooltip_range = new int[]{700,900,1100,1300};
    }

    public static FacelessVoidTimeWalk instance() {
        if( instance == null ){
            instance = new FacelessVoidTimeWalk();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int getDuration() {
        return duration;
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

    public int getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FacelessVoidTimeWalk))
            return false;
        if (object == this)
            return true;
        FacelessVoidTimeWalk otherObject = (FacelessVoidTimeWalk) object;
        return otherObject.getKey().equals(getKey());
    }

}
