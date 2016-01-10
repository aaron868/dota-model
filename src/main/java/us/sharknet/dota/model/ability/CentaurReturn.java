package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurReturn extends Ability {

    private static CentaurReturn instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] return_damage;
    private final int[] strength_pct;

    private CentaurReturn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5516;
        key = "centaur_return";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Return";
        ownerKey = "npc_dota_hero_centaur";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        return_damage = new int[]{16,18,20,22};
        strength_pct = new int[]{30,45,60,75};
    }

    public static CentaurReturn instance() {
        if( instance == null ){
            instance = new CentaurReturn();
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

    public int[] getReturnDamage() {
        return return_damage;
    }

    public int[] getStrengthPct() {
        return strength_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CentaurReturn))
            return false;
        if (object == this)
            return true;
        CentaurReturn otherObject = (CentaurReturn) object;
        return otherObject.getKey().equals(getKey());
    }

}
