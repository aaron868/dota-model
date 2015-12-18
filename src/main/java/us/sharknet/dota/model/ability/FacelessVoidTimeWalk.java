package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidTimeWalk extends Ability {

    private static FacelessVoidTimeWalk instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int backtrack_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int range;
    private final int speed;

    private FacelessVoidTimeWalk() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_DIRECTIONAL"};
        abilityCastPoint = .2;
        abilityCastRange = 0;
        abilityCooldown = new int[]{24,18,12,6};
        abilityManaCost = 40;
        abilityModifierSupportValue = .25;
        iD = 5182;
        key = "faceless_void_time_walk";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        backtrack_duration = 2;
        localizedName = "Time Walk";
        owningHeroShortKey = "faceless_void";
        radius = 300;
        range = 550;
        speed = 3000;
    }

    public static FacelessVoidTimeWalk instance() {
        if( instance == null ){
            instance = new FacelessVoidTimeWalk();
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

    public int[] getAbilityCooldown() {
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

    public int getBacktrackDuration() {
        return backtrack_duration;
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

    public int getRange() {
        return range;
    }

    public int getSpeed() {
        return speed;
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
