package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ZuusStaticField extends Ability {

    private static ZuusStaticField instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_health_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private ZuusStaticField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5112;
        key = "zuus_static_field";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_health_pct = new int[]{5,7,9,11};
        localizedName = "Static Field";
        ownerKey = "npc_dota_hero_zuus";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = 1200;
    }

    public static ZuusStaticField instance() {
        if( instance == null ){
            instance = new ZuusStaticField();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public int[] getDamageHealthPct() {
        return damage_health_pct;
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
        if (!(object instanceof ZuusStaticField))
            return false;
        if (object == this)
            return true;
        ZuusStaticField otherObject = (ZuusStaticField) object;
        return otherObject.getKey().equals(getKey());
    }

}
