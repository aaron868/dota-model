package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RattletrapRocketFlare extends Ability {

    private static RattletrapRocketFlare instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int speed;
    private final int vision_radius;

    private RattletrapRocketFlare() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{20.0,18.0,16.0,14.0};
        abilityDamage = new int[]{80,120,160,200};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5239;
        key = "rattletrap_rocket_flare";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{10.0,10.0,10.0,10.0};
        localizedName = "Rocket Flare";
        ownerKey = "npc_dota_hero_rattletrap";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{575,575,575,575};
        speed = 1750;
        vision_radius = 600;
    }

    public static RattletrapRocketFlare instance() {
        if( instance == null ){
            instance = new RattletrapRocketFlare();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public int[] getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RattletrapRocketFlare))
            return false;
        if (object == this)
            return true;
        RattletrapRocketFlare otherObject = (RattletrapRocketFlare) object;
        return otherObject.getKey().equals(getKey());
    }

}
