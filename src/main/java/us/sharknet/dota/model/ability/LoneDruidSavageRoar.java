package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSavageRoar extends Ability {

    private static LoneDruidSavageRoar instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_speed;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private LoneDruidSavageRoar() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCooldown = new double[]{38,32,26,20};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5414;
        key = "lone_druid_savage_roar";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_speed = 20;
        duration = new double[]{1.2,1.6,2.0,2.4};
        localizedName = "Savage Roar";
        ownerKey = "npc_dota_hero_lone_druid";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 325;
    }

    public static LoneDruidSavageRoar instance() {
        if( instance == null ){
            instance = new LoneDruidSavageRoar();
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSavageRoar))
            return false;
        if (object == this)
            return true;
        LoneDruidSavageRoar otherObject = (LoneDruidSavageRoar) object;
        return otherObject.getKey().equals(getKey());
    }

}
