package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BatriderFirefly extends Ability {

    private static BatriderFirefly instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_per_second;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double[] tick_interval;
    private final int[] tree_radius;

    private BatriderFirefly() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{40.0,40.0,40.0,40.0};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5322;
        key = "batrider_firefly";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_per_second = new int[]{10,30,50,70};
        duration = new double[]{18.0,18.0,18.0,18.0};
        localizedName = "Firefly";
        owningHeroShortKey = "batrider";
        radius = new int[]{200,200,200,200};
        tick_interval = new double[]{0.5,0.5,0.5,0.5};
        tree_radius = new int[]{100,100,100,100};
    }

    public static BatriderFirefly instance() {
        if( instance == null ){
            instance = new BatriderFirefly();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public double[] getTickInterval() {
        return tick_interval;
    }

    public int[] getTreeRadius() {
        return tree_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BatriderFirefly))
            return false;
        if (object == this)
            return true;
        BatriderFirefly otherObject = (BatriderFirefly) object;
        return otherObject.getKey().equals(getKey());
    }

}
