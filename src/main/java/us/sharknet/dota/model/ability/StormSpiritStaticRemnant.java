package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class StormSpiritStaticRemnant extends Ability {

    private static StormSpiritStaticRemnant instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] static_remnant_damage;
    private final int static_remnant_damage_radius;
    private final int static_remnant_delay;
    private final int static_remnant_radius;

    private StormSpiritStaticRemnant() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{3.5,3.5,3.5,3.5};
        abilityDuration = new double[]{12.0,12.0,12.0,12.0};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5098;
        key = "storm_spirit_static_remnant";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Static Remnant";
        ownerKey = "npc_dota_hero_storm_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        static_remnant_damage = new int[]{140,180,220,260};
        static_remnant_damage_radius = 260;
        static_remnant_delay = 1;
        static_remnant_radius = 235;
    }

    public static StormSpiritStaticRemnant instance() {
        if( instance == null ){
            instance = new StormSpiritStaticRemnant();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int[] getStaticRemnantDamage() {
        return static_remnant_damage;
    }

    public int getStaticRemnantDamageRadius() {
        return static_remnant_damage_radius;
    }

    public int getStaticRemnantDelay() {
        return static_remnant_delay;
    }

    public int getStaticRemnantRadius() {
        return static_remnant_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof StormSpiritStaticRemnant))
            return false;
        if (object == this)
            return true;
        StormSpiritStaticRemnant otherObject = (StormSpiritStaticRemnant) object;
        return otherObject.getKey().equals(getKey());
    }

}
