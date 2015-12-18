package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MagnataurSkewer extends Ability {

    private static MagnataurSkewer instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] range;
    private final int[] skewer_damage;
    private final int skewer_radius;
    private final int skewer_speed;
    private final double[] slow_duration;
    private final int[] slow_pct;
    private final int tree_radius;

    private MagnataurSkewer() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{30.0,30.0,30.0,30.0};
        abilityManaCost = new int[]{80,80,80,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5520;
        key = "magnataur_skewer";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Skewer";
        owningHeroShortKey = "magnataur";
        range = new int[]{900,1000,1100,1200};
        skewer_damage = new int[]{70,140,210,280};
        skewer_radius = 125;
        skewer_speed = 950;
        slow_duration = new double[]{2.5,2.75,3.0,3.25};
        slow_pct = new int[]{25,30,35,40};
        tree_radius = 200;
    }

    public static MagnataurSkewer instance() {
        if( instance == null ){
            instance = new MagnataurSkewer();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getRange() {
        return range;
    }

    public int[] getSkewerDamage() {
        return skewer_damage;
    }

    public int getSkewerRadius() {
        return skewer_radius;
    }

    public int getSkewerSpeed() {
        return skewer_speed;
    }

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public int[] getSlowPct() {
        return slow_pct;
    }

    public int getTreeRadius() {
        return tree_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagnataurSkewer))
            return false;
        if (object == this)
            return true;
        MagnataurSkewer otherObject = (MagnataurSkewer) object;
        return otherObject.getKey().equals(getKey());
    }

}
