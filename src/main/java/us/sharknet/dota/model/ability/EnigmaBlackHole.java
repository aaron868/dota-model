package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnigmaBlackHole extends Ability {

    private static EnigmaBlackHole instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int[] far_damage;
    private final int far_radius;
    private final String localizedName;
    private final int[] near_damage;
    private final int near_radius;
    private final String owningHeroShortKey;
    private final int pull_radius;
    private final int[] pull_speed;
    private final double[] tick_rate;
    private final int[] vision_radius;

    private EnigmaBlackHole() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = 275;
        abilityChannelTime = new double[]{4.0,4.0,4.0};
        abilityCooldown = new double[]{200.0,180.0,160.0};
        abilityManaCost = new int[]{275,325,375};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5149;
        key = "enigma_black_hole";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{4.0,4.0,4.0};
        far_damage = new int[]{55,110,165};
        far_radius = 420;
        localizedName = "Black Hole";
        near_damage = new int[]{55,110,165};
        near_radius = 200;
        owningHeroShortKey = "enigma";
        pull_radius = 420;
        pull_speed = new int[]{40,40,40};
        tick_rate = new double[]{0.1,0.1,0.1};
        vision_radius = new int[]{800,800,800};
    }

    public static EnigmaBlackHole instance() {
        if( instance == null ){
            instance = new EnigmaBlackHole();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getDuration() {
        return duration;
    }

    public int[] getFarDamage() {
        return far_damage;
    }

    public int getFarRadius() {
        return far_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getNearDamage() {
        return near_damage;
    }

    public int getNearRadius() {
        return near_radius;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPullRadius() {
        return pull_radius;
    }

    public int[] getPullSpeed() {
        return pull_speed;
    }

    public double[] getTickRate() {
        return tick_rate;
    }

    public int[] getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnigmaBlackHole))
            return false;
        if (object == this)
            return true;
        EnigmaBlackHole otherObject = (EnigmaBlackHole) object;
        return otherObject.getKey().equals(getKey());
    }

}
