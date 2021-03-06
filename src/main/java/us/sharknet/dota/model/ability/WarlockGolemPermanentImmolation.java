package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockGolemPermanentImmolation extends Ability {

    private static WarlockGolemPermanentImmolation instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] aura_damage;
    private final int aura_radius;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WarlockGolemPermanentImmolation() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5167;
        key = "warlock_golem_permanent_immolation";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        aura_damage = new int[]{30,40,50};
        aura_radius = 300;
        localizedName = "Permanent Immolation";
        ownerKey = "npc_dota_warlock_golem";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static WarlockGolemPermanentImmolation instance() {
        if( instance == null ){
            instance = new WarlockGolemPermanentImmolation();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getAuraDamage() {
        return aura_damage;
    }

    public int getAuraRadius() {
        return aura_radius;
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
        if (!(object instanceof WarlockGolemPermanentImmolation))
            return false;
        if (object == this)
            return true;
        WarlockGolemPermanentImmolation otherObject = (WarlockGolemPermanentImmolation) object;
        return otherObject.getKey().equals(getKey());
    }

}
