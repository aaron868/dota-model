package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockGolemFlamingFists extends Ability {

    private static WarlockGolemFlamingFists instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int chance;
    private final int[] damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private WarlockGolemFlamingFists() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5166;
        key = "warlock_golem_flaming_fists";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        chance = 40;
        damage = new int[]{80,115,150};
        localizedName = "Flaming Fists";
        ownerKey = "npc_dota_warlock_golem";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius = new int[]{300,300,300};
    }

    public static WarlockGolemFlamingFists instance() {
        if( instance == null ){
            instance = new WarlockGolemFlamingFists();
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

    public int getChance() {
        return chance;
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
        if (!(object instanceof WarlockGolemFlamingFists))
            return false;
        if (object == this)
            return true;
        WarlockGolemFlamingFists otherObject = (WarlockGolemFlamingFists) object;
        return otherObject.getKey().equals(getKey());
    }

}
