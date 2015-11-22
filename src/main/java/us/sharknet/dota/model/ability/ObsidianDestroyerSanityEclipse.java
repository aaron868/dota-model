package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerSanityEclipse extends Ability {

    private static ObsidianDestroyerSanityEclipse instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_range;
    private final int[] damage_multiplier;
    private final int[] damage_multiplier_scepter;
    private final String localizedName;
    private final int mana_drain;
    private final String owningHeroShortKey;
    private final int[] radius;

    private ObsidianDestroyerSanityEclipse() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.25,0.25,0.25};
        abilityCastRange = 700;
        abilityCooldown = 160;
        abilityManaCost = new int[]{175,250,325};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5394;
        key = "obsidian_destroyer_sanity_eclipse";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range = 700;
        damage_multiplier = new int[]{8,9,10};
        damage_multiplier_scepter = new int[]{8,9,10};
        localizedName = "Sanity Eclipse";
        mana_drain = 40;
        owningHeroShortKey = "obsidian_destroyer";
        radius = new int[]{375,475,575};
    }

    public static ObsidianDestroyerSanityEclipse instance() {
        if( instance == null ){
            instance = new ObsidianDestroyerSanityEclipse();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
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

    public int getCastRange() {
        return cast_range;
    }

    public int[] getDamageMultiplier() {
        return damage_multiplier;
    }

    public int[] getDamageMultiplierScepter() {
        return damage_multiplier_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaDrain() {
        return mana_drain;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObsidianDestroyerSanityEclipse))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyerSanityEclipse otherObject = (ObsidianDestroyerSanityEclipse) object;
        return otherObject.getKey().equals(getKey());
    }

}
