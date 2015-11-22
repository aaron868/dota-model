package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DisruptorKineticField extends Ability {

    private static DisruptorKineticField instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final double[] formation_time;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private DisruptorKineticField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.05,0.05,0.05,0.05};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new int[]{13,12,11,10};
        abilityManaCost = new int[]{70,70,70,70};
        fightRecapLevel = 1;
        iD = 5460;
        key = "disruptor_kinetic_field";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{2.6,3.2,3.8,4.4};
        formation_time = new double[]{1.2,1.2,1.2,1.2};
        localizedName = "Kinetic Field";
        owningHeroShortKey = "disruptor";
        radius = 325;
    }

    public static DisruptorKineticField instance() {
        if( instance == null ){
            instance = new DisruptorKineticField();
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public double[] getDuration() {
        return duration;
    }

    public double[] getFormationTime() {
        return formation_time;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DisruptorKineticField))
            return false;
        if (object == this)
            return true;
        DisruptorKineticField otherObject = (DisruptorKineticField) object;
        return otherObject.getKey().equals(getKey());
    }

}
