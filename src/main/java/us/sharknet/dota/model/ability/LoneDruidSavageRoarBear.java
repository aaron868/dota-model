package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSavageRoarBear extends Ability {

    private static LoneDruidSavageRoarBear instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_speed;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private LoneDruidSavageRoarBear() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = .1;
        abilityCooldown = new int[]{28,24,20,16};
        abilityManaCost = 50;
        iD = 5687;
        key = "lone_druid_savage_roar_bear";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_speed = 20;
        duration = new double[]{1.2,1.6,2.0,2.4};
        localizedName = " Bear Savage Roar";
        owningHeroShortKey = "lone_druid_bear";
        radius = 325;
    }

    public static LoneDruidSavageRoarBear instance() {
        if( instance == null ){
            instance = new LoneDruidSavageRoarBear();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusSpeed() {
        return bonus_speed;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSavageRoarBear))
            return false;
        if (object == this)
            return true;
        LoneDruidSavageRoarBear otherObject = (LoneDruidSavageRoarBear) object;
        return otherObject.getKey().equals(getKey());
    }

}
