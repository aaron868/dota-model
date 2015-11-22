package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WeaverShukuchi extends Ability {

    private static WeaverShukuchi instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double[] duration;
    private final double[] fade_time;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private WeaverShukuchi() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCooldown = new double[]{12.0,10.0,8.0,6.0};
        abilityManaCost = new int[]{60,60,60,60};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 529;
        key = "weaver_shukuchi";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{75,100,125,150};
        duration = new double[]{4.0,4.0,4.0,4.0};
        fade_time = new double[]{0.25,0.25,0.25,0.25};
        localizedName = "Shukuchi";
        owningHeroShortKey = "weaver";
        radius = new int[]{175,175,175,175};
    }

    public static WeaverShukuchi instance() {
        if( instance == null ){
            instance = new WeaverShukuchi();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
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

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getFadeTime() {
        return fade_time;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WeaverShukuchi))
            return false;
        if (object == this)
            return true;
        WeaverShukuchi otherObject = (WeaverShukuchi) object;
        return otherObject.getKey().equals(getKey());
    }

}
