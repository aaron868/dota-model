package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlarkPounce extends Ability {

    private static SlarkPounce instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double leash_duration;
    private final int leash_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int pounce_acceleration;
    private final int[] pounce_damage;
    private final int pounce_distance;
    private final int pounce_radius;
    private final double pounce_speed;

    private SlarkPounce() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCooldown = new double[]{20.0,16.0,12.0,8.0};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5495;
        key = "slark_pounce";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        leash_duration = 3.5;
        leash_radius = 325;
        localizedName = "Pounce";
        owningHeroShortKey = "slark";
        pounce_acceleration = 7;
        pounce_damage = new int[]{50,100,150,200};
        pounce_distance = 7;
        pounce_radius = 95;
        pounce_speed = 933.33;
    }

    public static SlarkPounce instance() {
        if( instance == null ){
            instance = new SlarkPounce();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public double getLeashDuration() {
        return leash_duration;
    }

    public int getLeashRadius() {
        return leash_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPounceAcceleration() {
        return pounce_acceleration;
    }

    public int[] getPounceDamage() {
        return pounce_damage;
    }

    public int getPounceDistance() {
        return pounce_distance;
    }

    public int getPounceRadius() {
        return pounce_radius;
    }

    public double getPounceSpeed() {
        return pounce_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SlarkPounce))
            return false;
        if (object == this)
            return true;
        SlarkPounce otherObject = (SlarkPounce) object;
        return otherObject.getKey().equals(getKey());
    }

}
