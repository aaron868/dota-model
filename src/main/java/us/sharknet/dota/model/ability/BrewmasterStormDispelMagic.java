package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterStormDispelMagic extends Ability {

    private static BrewmasterStormDispelMagic instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private BrewmasterStormDispelMagic() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = new double[]{4,4,4,4};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        iD = 5408;
        key = "brewmaster_storm_dispel_magic";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = 500;
        localizedName = "Dispel Magic";
        ownerKey = "npc_dota_brewmaster_storm";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
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

    public String[] getAbilityUnitTargetTeam() {
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

    public int getDamage() {
        return damage;
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
