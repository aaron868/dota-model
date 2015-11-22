package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidChronosphere extends Ability {

    private static FacelessVoidChronosphere instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportBonus;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_scepter;
    private final double[] duration;
    private final double[] duration_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int vision_radius;

    private FacelessVoidChronosphere() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.35,0.35,0.35};
        abilityCastRange = 6;
        abilityCooldown = new double[]{130.0,115.0,100.0};
        abilityManaCost = new int[]{150,225,300};
        abilityModifierSupportBonus = 5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5185;
        key = "faceless_void_chronosphere";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = new double[]{60.0,60.0,60.0};
        duration = new double[]{4.0,4.5,5.0};
        duration_scepter = new double[]{4.0,5.0,6.0};
        localizedName = "Chronosphere";
        owningHeroShortKey = "faceless_void";
        radius = 425;
        vision_radius = 475;
    }

    public static FacelessVoidChronosphere instance() {
        if( instance == null ){
            instance = new FacelessVoidChronosphere();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
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

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getDurationScepter() {
        return duration_scepter;
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

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FacelessVoidChronosphere))
            return false;
        if (object == this)
            return true;
        FacelessVoidChronosphere otherObject = (FacelessVoidChronosphere) object;
        return otherObject.getKey().equals(getKey());
    }

}
