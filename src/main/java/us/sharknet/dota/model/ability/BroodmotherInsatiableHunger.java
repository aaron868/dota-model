package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherInsatiableHunger extends Ability {

    private static BroodmotherInsatiableHunger instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int[] bonus_damage;
    private final double[] duration;
    private final int[] lifesteal_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BroodmotherInsatiableHunger() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.2,0.2,0.2};
        abilityCooldown = new double[]{45.0,45.0,45.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5282;
        key = "broodmother_insatiable_hunger";
        bonus_damage = new int[]{60,90,120};
        duration = new double[]{14.0,14.0,14.0};
        lifesteal_pct = new int[]{60,80,100};
        localizedName = "Insatiable Hunger";
        owningHeroShortKey = "broodmother";
    }

    public static BroodmotherInsatiableHunger instance() {
        if( instance == null ){
            instance = new BroodmotherInsatiableHunger();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getLifestealPct() {
        return lifesteal_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherInsatiableHunger))
            return false;
        if (object == this)
            return true;
        BroodmotherInsatiableHunger otherObject = (BroodmotherInsatiableHunger) object;
        return otherObject.getKey().equals(getKey());
    }

}
