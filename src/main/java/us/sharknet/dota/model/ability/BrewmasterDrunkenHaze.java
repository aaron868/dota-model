package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterDrunkenHaze extends Ability {

    private static BrewmasterDrunkenHaze instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final double[] duration_creeps;
    private final String localizedName;
    private final int[] miss_chance;
    private final int[] movement_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private BrewmasterDrunkenHaze() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.4,0.4,0.4};
        abilityCastRange = new int[]{850,850,850,850};
        abilityCooldown = new double[]{8,7,6,5};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5401;
        key = "brewmaster_drunken_haze";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{8.0,8.0,8.0,8.0};
        duration_creeps = new double[]{12.0,12.0,12.0,12.0};
        localizedName = "Drunken Haze";
        miss_chance = new int[]{45,55,65,75};
        movement_slow = new int[]{14,18,22,26};
        ownerKey = "npc_dota_hero_brewmaster";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 200;
    }

    public static BrewmasterDrunkenHaze instance() {
        if( instance == null ){
            instance = new BrewmasterDrunkenHaze();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public double[] getDuration() {
        return duration;
    }

    public double[] getDurationCreeps() {
        return duration_creeps;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMissChance() {
        return miss_chance;
    }

    public int[] getMovementSlow() {
        return movement_slow;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterDrunkenHaze))
            return false;
        if (object == this)
            return true;
        BrewmasterDrunkenHaze otherObject = (BrewmasterDrunkenHaze) object;
        return otherObject.getKey().equals(getKey());
    }

}
