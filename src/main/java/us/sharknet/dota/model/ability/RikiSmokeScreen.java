package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiSmokeScreen extends Ability {

    private static RikiSmokeScreen instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final int[] miss_rate;
    private final int[] movement_speed_reduction;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int turn_reduction;

    private RikiSmokeScreen() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 55;
        abilityCooldown = 11;
        abilityDuration = 6;
        abilityManaCost = new int[]{75,80,85,90};
        iD = 5142;
        key = "riki_smoke_screen";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 6;
        localizedName = "Smoke Screen";
        miss_rate = new int[]{40,50,60,70};
        movement_speed_reduction = new int[]{25,25,25,25};
        owningHeroShortKey = "riki";
        radius = new int[]{250,275,300,325};
        turn_reduction = -3;
    }

    public static RikiSmokeScreen instance() {
        if( instance == null ){
            instance = new RikiSmokeScreen();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getMissRate() {
        return miss_rate;
    }

    public int[] getMovementSpeedReduction() {
        return movement_speed_reduction;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int getTurnReduction() {
        return turn_reduction;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RikiSmokeScreen))
            return false;
        if (object == this)
            return true;
        RikiSmokeScreen otherObject = (RikiSmokeScreen) object;
        return otherObject.getKey().equals(getKey());
    }

}
