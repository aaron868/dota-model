package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterStormDispelMagic extends Ability {

    private static BrewmasterStormDispelMagic instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private BrewmasterStormDispelMagic() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = .4;
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = 6;
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        iD = 5408;
        key = "brewmaster_storm_dispel_magic";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{200,200,200,200};
        localizedName = "Dispel Magic";
        owningHeroShortKey = "brewmaster_storm";
        radius = 600;
    }

    public static BrewmasterStormDispelMagic instance() {
        if( instance == null ){
            instance = new BrewmasterStormDispelMagic();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterStormDispelMagic))
            return false;
        if (object == this)
            return true;
        BrewmasterStormDispelMagic otherObject = (BrewmasterStormDispelMagic) object;
        return otherObject.getKey().equals(getKey());
    }

}
