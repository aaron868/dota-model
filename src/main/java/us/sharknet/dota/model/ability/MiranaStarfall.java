package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MiranaStarfall extends Ability {

    private static MiranaStarfall instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int starfall_radius;
    private final int starfall_secondary_radius;

    private MiranaStarfall() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityDamage = new int[]{75,150,225,300};
        abilityDuration = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = new int[]{100,120,140,160};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 551;
        key = "mirana_starfall";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Starfall";
        owningHeroShortKey = "mirana";
        starfall_radius = 625;
        starfall_secondary_radius = 425;
    }

    public static MiranaStarfall instance() {
        if( instance == null ){
            instance = new MiranaStarfall();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getStarfallRadius() {
        return starfall_radius;
    }

    public int getStarfallSecondaryRadius() {
        return starfall_secondary_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MiranaStarfall))
            return false;
        if (object == this)
            return true;
        MiranaStarfall otherObject = (MiranaStarfall) object;
        return otherObject.getKey().equals(getKey());
    }

}
