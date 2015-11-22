package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SandkingSandStorm extends Ability {

    private static SandkingSandStorm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double sand_storm_invis_delay;
    private final int sand_storm_radius;

    private SandkingSandStorm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 0;
        abilityChannelTime = new double[]{20.0,40.0,60.0,80.0};
        abilityCooldown = new double[]{40.0,30.0,20.0,10.0};
        abilityDamage = new int[]{25,50,75,100};
        abilityDuration = new double[]{20.0,40.0,60.0,80.0};
        abilityManaCost = new int[]{60,50,40,30};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 513;
        key = "sandking_sand_storm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Sand Storm";
        owningHeroShortKey = "sand_king";
        sand_storm_invis_delay = 1.5;
        sand_storm_radius = 525;
    }

    public static SandkingSandStorm instance() {
        if( instance == null ){
            instance = new SandkingSandStorm();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getSandStormInvisDelay() {
        return sand_storm_invis_delay;
    }

    public int getSandStormRadius() {
        return sand_storm_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SandkingSandStorm))
            return false;
        if (object == this)
            return true;
        SandkingSandStorm otherObject = (SandkingSandStorm) object;
        return otherObject.getKey().equals(getKey());
    }

}
