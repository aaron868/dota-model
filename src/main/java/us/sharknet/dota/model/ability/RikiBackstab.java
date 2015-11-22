package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiBackstab extends Ability {

    private static RikiBackstab instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] backstab_angle;
    private final double[] damage_multiplier;
    private final String localizedName;
    private final String owningHeroShortKey;

    private RikiBackstab() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5144;
        key = "riki_backstab";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        backstab_angle = new int[]{105,105,105,105};
        damage_multiplier = new double[]{0.5,0.75,1.0,1.25};
        localizedName = "Backstab";
        owningHeroShortKey = "riki";
    }

    public static RikiBackstab instance() {
        if( instance == null ){
            instance = new RikiBackstab();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getBackstabAngle() {
        return backstab_angle;
    }

    public double[] getDamageMultiplier() {
        return damage_multiplier;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RikiBackstab))
            return false;
        if (object == this)
            return true;
        RikiBackstab otherObject = (RikiBackstab) object;
        return otherObject.getKey().equals(getKey());
    }

}
