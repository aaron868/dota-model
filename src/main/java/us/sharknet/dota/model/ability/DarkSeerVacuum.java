package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DarkSeerVacuum extends Ability {

    private static DarkSeerVacuum instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int radius_tree;

    private DarkSeerVacuum() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 500;
        abilityCooldown = 28;
        abilityManaCost = new int[]{100,130,160,190};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5255;
        key = "dark_seer_vacuum";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{40,80,120,160};
        duration = .5;
        localizedName = "Vacuum";
        owningHeroShortKey = "dark_seer";
        radius = new int[]{250,350,450,550};
        radius_tree = 275;
    }

    public static DarkSeerVacuum instance() {
        if( instance == null ){
            instance = new DarkSeerVacuum();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getDamage() {
        return damage;
    }

    public double getDuration() {
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

    public int getRadiusTree() {
        return radius_tree;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DarkSeerVacuum))
            return false;
        if (object == this)
            return true;
        DarkSeerVacuum otherObject = (DarkSeerVacuum) object;
        return otherObject.getKey().equals(getKey());
    }

}
