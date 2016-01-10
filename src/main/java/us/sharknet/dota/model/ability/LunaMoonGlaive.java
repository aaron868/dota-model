package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LunaMoonGlaive extends Ability {

    private static LunaMoonGlaive instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bounces;
    private final int damage_reduction_percent;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int range;

    private LunaMoonGlaive() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5223;
        key = "luna_moon_glaive";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bounces = new int[]{1,2,3,6};
        damage_reduction_percent = 35;
        localizedName = "Moon Glaive";
        ownerKey = "npc_dota_hero_luna";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        range = 500;
    }

    public static LunaMoonGlaive instance() {
        if( instance == null ){
            instance = new LunaMoonGlaive();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getBounces() {
        return bounces;
    }

    public int getDamageReductionPercent() {
        return damage_reduction_percent;
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

    public int getRange() {
        return range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LunaMoonGlaive))
            return false;
        if (object == this)
            return true;
        LunaMoonGlaive otherObject = (LunaMoonGlaive) object;
        return otherObject.getKey().equals(getKey());
    }

}
