package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerIceWall extends Ability {

    private static InvokerIceWall instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final double[] damage_per_second;
    private final double[] duration;
    private final String localizedName;
    private final int num_wall_elements;
    private final String owningHeroShortKey;
    private final int[] slow;
    private final int slow_duration;
    private final int wall_element_radius;
    private final int wall_element_spacing;
    private final int wall_place_distance;

    private InvokerIceWall() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCooldown = 25;
        abilityManaCost = 175;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        hotKeyOverride = "G";
        iD = 5389;
        key = "invoker_ice_wall";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_per_second = new double[]{6.0,12.0,18.0,24.0,30.0,36.0,42.0,48.0};
        duration = new double[]{3.0,4.5,6.0,7.5,9.0,10.5,12.0,13.5};
        localizedName = "Ice Wall";
        num_wall_elements = 15;
        owningHeroShortKey = "invoker";
        slow = new int[]{-20,-40,-60,-80,-100,-120,-140,-160};
        slow_duration = 2;
        wall_element_radius = 15;
        wall_element_spacing = 8;
        wall_place_distance = 2;
    }

    public static InvokerIceWall instance() {
        if( instance == null ){
            instance = new InvokerIceWall();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
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

    public String getHotKeyOverride() {
        return hotKeyOverride;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getDamagePerSecond() {
        return damage_per_second;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNumWallElements() {
        return num_wall_elements;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSlow() {
        return slow;
    }

    public int getSlowDuration() {
        return slow_duration;
    }

    public int getWallElementRadius() {
        return wall_element_radius;
    }

    public int getWallElementSpacing() {
        return wall_element_spacing;
    }

    public int getWallPlaceDistance() {
        return wall_place_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerIceWall))
            return false;
        if (object == this)
            return true;
        InvokerIceWall otherObject = (InvokerIceWall) object;
        return otherObject.getKey().equals(getKey());
    }

}
