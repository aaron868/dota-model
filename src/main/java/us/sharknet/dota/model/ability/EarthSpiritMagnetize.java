package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritMagnetize extends Ability {

    private static EarthSpiritMagnetize instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_radius;
    private final int damage_duration;
    private final int damage_interval;
    private final int[] damage_per_second;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int rock_explosion_delay;
    private final int rock_explosion_radius;
    private final int rock_search_radius;
    private final int silence_duration;
    private final int slow_duration;

    private EarthSpiritMagnetize() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{300,300,300,300};
        abilityCooldown = new double[]{8,8,8,8};
        abilityManaCost = new int[]{1,1,1,1};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5612;
        key = "earth_spirit_magnetize";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_radius = 300;
        damage_duration = 6;
        damage_interval = 1;
        damage_per_second = new int[]{50,75,100};
        localizedName = "Magnetize";
        ownerKey = "npc_dota_hero_earth_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        rock_explosion_delay = 8;
        rock_explosion_radius = 600;
        rock_search_radius = 400;
        silence_duration = 5;
        slow_duration = 2;
    }

    public static EarthSpiritMagnetize instance() {
        if( instance == null ){
            instance = new EarthSpiritMagnetize();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int getCastRadius() {
        return cast_radius;
    }

    public int getDamageDuration() {
        return damage_duration;
    }

    public int getDamageInterval() {
        return damage_interval;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
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

    public int getRockExplosionDelay() {
        return rock_explosion_delay;
    }

    public int getRockExplosionRadius() {
        return rock_explosion_radius;
    }

    public int getRockSearchRadius() {
        return rock_search_radius;
    }

    public int getSilenceDuration() {
        return silence_duration;
    }

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritMagnetize))
            return false;
        if (object == this)
            return true;
        EarthSpiritMagnetize otherObject = (EarthSpiritMagnetize) object;
        return otherObject.getKey().equals(getKey());
    }

}
