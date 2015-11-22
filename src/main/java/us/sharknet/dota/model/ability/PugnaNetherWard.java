package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PugnaNetherWard extends Ability {

    private static PugnaNetherWard instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attacks_to_destroy_tooltip;
    private final String localizedName;
    private final double[] mana_multiplier;
    private final double[] mana_regen;
    private final String owningHeroShortKey;
    private final int radius;
    private final int ward_duration_tooltip;

    private PugnaNetherWard() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = 150;
        abilityCooldown = new double[]{35.0,35.0,35.0,35.0};
        abilityDuration = 3;
        abilityManaCost = new int[]{80,80,80,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5188;
        key = "pugna_nether_ward";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attacks_to_destroy_tooltip = new int[]{4,4,4,4};
        localizedName = "Nether Ward";
        mana_multiplier = new double[]{1.0,1.25,1.5,1.75};
        mana_regen = new double[]{1.5,3.0,4.5,6.0};
        owningHeroShortKey = "pugna";
        radius = 1600;
        ward_duration_tooltip = 30;
    }

    public static PugnaNetherWard instance() {
        if( instance == null ){
            instance = new PugnaNetherWard();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
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

    public int[] getAttacksToDestroyTooltip() {
        return attacks_to_destroy_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getManaMultiplier() {
        return mana_multiplier;
    }

    public double[] getManaRegen() {
        return mana_regen;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getWardDurationTooltip() {
        return ward_duration_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PugnaNetherWard))
            return false;
        if (object == this)
            return true;
        PugnaNetherWard otherObject = (PugnaNetherWard) object;
        return otherObject.getKey().equals(getKey());
    }

}
