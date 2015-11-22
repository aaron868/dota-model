package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterWildAxes extends Ability {

    private static BeastmasterWildAxes instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] range;
    private final int[] spread;

    private BeastmasterWildAxes() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = .4;
        abilityCastRange = 13;
        abilityCooldown = new double[]{13.0,13.0,13.0,13.0};
        abilityDamage = new int[]{70,100,130,160};
        abilityManaCost = 12;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5168;
        key = "beastmaster_wild_axes";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Wild Axes";
        owningHeroShortKey = "beastmaster";
        radius = 14;
        range = new int[]{1300,1300,1300,1300};
        spread = new int[]{353,353,353,353};
    }

    public static BeastmasterWildAxes instance() {
        if( instance == null ){
            instance = new BeastmasterWildAxes();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
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

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getRadius() {
        return radius;
    }

    public int[] getRange() {
        return range;
    }

    public int[] getSpread() {
        return spread;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterWildAxes))
            return false;
        if (object == this)
            return true;
        BeastmasterWildAxes otherObject = (BeastmasterWildAxes) object;
        return otherObject.getKey().equals(getKey());
    }

}
