package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterFirePermanentImmolation extends Ability {

    private static BrewmasterFirePermanentImmolation instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private BrewmasterFirePermanentImmolation() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5411;
        key = "brewmaster_fire_permanent_immolation";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{15,30,45};
        localizedName = "Permanent Immolation";
        ownerKey = "npc_dota_brewmaster_fire";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius = new int[]{220,220,220};
    }

    public static BrewmasterFirePermanentImmolation instance() {
        if( instance == null ){
            instance = new BrewmasterFirePermanentImmolation();
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

    public int[] getDamage() {
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterFirePermanentImmolation))
            return false;
        if (object == this)
            return true;
        BrewmasterFirePermanentImmolation otherObject = (BrewmasterFirePermanentImmolation) object;
        return otherObject.getKey().equals(getKey());
    }

}
