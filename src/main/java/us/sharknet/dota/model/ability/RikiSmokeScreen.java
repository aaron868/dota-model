package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiSmokeScreen extends Ability {

    private static RikiSmokeScreen instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final int[] miss_rate;
    private final int movement_speed_reduction;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int turn_reduction;

    private RikiSmokeScreen() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{550,550,550,550};
        abilityCooldown = new double[]{11,11,11,11};
        abilityDuration = new double[]{6,6,6,6};
        abilityManaCost = new int[]{75,80,85,90};
        iD = 5142;
        key = "riki_smoke_screen";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 6;
        localizedName = "Smoke Screen";
        miss_rate = new int[]{40,50,60,70};
        movement_speed_reduction = 25;
        ownerKey = "npc_dota_hero_riki";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{250,275,300,325};
        turn_reduction = 0;
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

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
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

    public int getMovementSpeedReduction() {
        return movement_speed_reduction;
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
