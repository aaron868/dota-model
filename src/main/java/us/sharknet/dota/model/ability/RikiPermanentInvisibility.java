package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiPermanentInvisibility extends Ability {

    private static RikiPermanentInvisibility instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] backstab_angle;
    private final double[] damage_multiplier;
    private final double[] fade_delay;
    private final double[] fade_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private RikiPermanentInvisibility() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5144;
        key = "riki_permanent_invisibility";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        backstab_angle = new int[]{105,105,105,105};
        damage_multiplier = new double[]{0.5,0.75,1.0,1.25};
        fade_delay = new double[]{6.0,5.0,4.0,3.0};
        fade_time = new double[]{0.0,0.0,0.0,0.0};
        localizedName = "Cloak and Dagger";
        ownerKey = "npc_dota_hero_riki";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static RikiPermanentInvisibility instance() {
        if( instance == null ){
            instance = new RikiPermanentInvisibility();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public double[] getFadeDelay() {
        return fade_delay;
    }

    public double[] getFadeTime() {
        return fade_time;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RikiPermanentInvisibility))
            return false;
        if (object == this)
            return true;
        RikiPermanentInvisibility otherObject = (RikiPermanentInvisibility) object;
        return otherObject.getKey().equals(getKey());
    }

}
