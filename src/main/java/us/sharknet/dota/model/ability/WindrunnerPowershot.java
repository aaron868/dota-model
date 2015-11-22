package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WindrunnerPowershot extends Ability {

    private static WindrunnerPowershot instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int arrow_range;
    private final double[] arrow_speed;
    private final int[] arrow_width;
    private final double[] damage_reduction;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] tree_width;
    private final double[] vision_duration;
    private final int vision_radius;

    private WindrunnerPowershot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = 0;
        abilityCastRange = 2600;
        abilityChannelTime = new double[]{1.0,1.0,1.0,1.0};
        abilityCooldown = new double[]{9.0,9.0,9.0,9.0};
        abilityDamage = new int[]{120,200,280,360};
        abilityManaCost = new int[]{90,100,110,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5131;
        key = "windrunner_powershot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        arrow_range = 2600;
        arrow_speed = new double[]{3000.0,3000.0,3000.0,3000.0};
        arrow_width = new int[]{125,125,125,125};
        damage_reduction = new double[]{0.1,0.1,0.1,0.1};
        localizedName = "Powershot";
        owningHeroShortKey = "windrunner";
        tree_width = new double[]{75.0,75.0,75.0,75.0};
        vision_duration = new double[]{3.34,3.34,3.34,3.34};
        vision_radius = 400;
    }

    public static WindrunnerPowershot instance() {
        if( instance == null ){
            instance = new WindrunnerPowershot();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
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

    public int getArrowRange() {
        return arrow_range;
    }

    public double[] getArrowSpeed() {
        return arrow_speed;
    }

    public int[] getArrowWidth() {
        return arrow_width;
    }

    public double[] getDamageReduction() {
        return damage_reduction;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getTreeWidth() {
        return tree_width;
    }

    public double[] getVisionDuration() {
        return vision_duration;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WindrunnerPowershot))
            return false;
        if (object == this)
            return true;
        WindrunnerPowershot otherObject = (WindrunnerPowershot) object;
        return otherObject.getKey().equals(getKey());
    }

}
