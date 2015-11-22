package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TidehunterAnchorSmash extends Ability {

    private static TidehunterAnchorSmash instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_reduction;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final double[] reduction_duration;

    private TidehunterAnchorSmash() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 375;
        abilityCooldown = new double[]{7.0,6.0,5.0,4.0};
        abilityDamage = new int[]{75,125,175,225};
        abilityManaCost = new int[]{30,40,50,60};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        fightRecapLevel = 1;
        iD = 5120;
        key = "tidehunter_anchor_smash";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage_reduction = new int[]{-45,-50,-55,-60};
        localizedName = "Anchor Smash";
        owningHeroShortKey = "tidehunter";
        radius = 375;
        reduction_duration = new double[]{6.0,6.0,6.0,6.0};
    }

    public static TidehunterAnchorSmash instance() {
        if( instance == null ){
            instance = new TidehunterAnchorSmash();
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

    public int[] getDamageReduction() {
        return damage_reduction;
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

    public double[] getReductionDuration() {
        return reduction_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TidehunterAnchorSmash))
            return false;
        if (object == this)
            return true;
        TidehunterAnchorSmash otherObject = (TidehunterAnchorSmash) object;
        return otherObject.getKey().equals(getKey());
    }

}
