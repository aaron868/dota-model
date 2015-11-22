package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DazzleWeave extends Ability {

    private static DazzleWeave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] armor_per_second;
    private final double[] armor_per_second_scepter;
    private final int duration;
    private final int duration_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] radius_scepter;
    private final int vision;

    private DazzleWeave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = 2;
        abilityCooldown = new int[]{40,40,40};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5236;
        key = "dazzle_weave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_per_second = new double[]{0.75,1.0,1.25};
        armor_per_second_scepter = new double[]{1.25,1.5,1.75};
        duration = 24;
        duration_scepter = 24;
        localizedName = "Weave";
        owningHeroShortKey = "dazzle";
        radius = new int[]{575,575,575};
        radius_scepter = new int[]{775,775,775};
        vision = 8;
    }

    public static DazzleWeave instance() {
        if( instance == null ){
            instance = new DazzleWeave();
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

    public int[] getAbilityCooldown() {
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getArmorPerSecond() {
        return armor_per_second;
    }

    public double[] getArmorPerSecondScepter() {
        return armor_per_second_scepter;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationScepter() {
        return duration_scepter;
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

    public int[] getRadiusScepter() {
        return radius_scepter;
    }

    public int getVision() {
        return vision;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DazzleWeave))
            return false;
        if (object == this)
            return true;
        DazzleWeave otherObject = (DazzleWeave) object;
        return otherObject.getKey().equals(getKey());
    }

}
