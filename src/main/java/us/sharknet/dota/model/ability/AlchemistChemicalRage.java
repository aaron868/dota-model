package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlchemistChemicalRage extends Ability {

    private static AlchemistChemicalRage instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final double[] base_attack_time;
    private final int bonus_health;
    private final int[] bonus_health_regen;
    private final double[] bonus_mana_regen;
    private final int[] bonus_movespeed;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double transformation_time;

    private AlchemistChemicalRage() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = 0;
        abilityCooldown = 45;
        abilityManaCost = new int[]{50,100,150};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5369;
        key = "alchemist_chemical_rage";
        base_attack_time = new double[]{1.4,1.2,1.0};
        bonus_health = 0;
        bonus_health_regen = new int[]{50,75,100};
        bonus_mana_regen = new double[]{3.0,7.5,12.0};
        bonus_movespeed = new int[]{30,40,60};
        duration = 25;
        localizedName = "Chemical Rage";
        owningHeroShortKey = "alchemist";
        transformation_time = .35;
    }

    public static AlchemistChemicalRage instance() {
        if( instance == null ){
            instance = new AlchemistChemicalRage();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getBaseAttackTime() {
        return base_attack_time;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int[] getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public double[] getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int[] getBonusMovespeed() {
        return bonus_movespeed;
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

    public double getTransformationTime() {
        return transformation_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AlchemistChemicalRage))
            return false;
        if (object == this)
            return true;
        AlchemistChemicalRage otherObject = (AlchemistChemicalRage) object;
        return otherObject.getKey().equals(getKey());
    }

}
