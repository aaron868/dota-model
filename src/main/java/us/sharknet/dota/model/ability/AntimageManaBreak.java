package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AntimageManaBreak extends Ability {

    private static AntimageManaBreak instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double damage_per_burn;
    private final String localizedName;
    private final int[] mana_per_hit;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private AntimageManaBreak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5003;
        key = "antimage_mana_break";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_per_burn = .6;
        localizedName = "Mana Break";
        mana_per_hit = new int[]{28,40,52,64};
        ownerKey = "npc_dota_hero_antimage";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static AntimageManaBreak instance() {
        if( instance == null ){
            instance = new AntimageManaBreak();
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

    public double getDamagePerBurn() {
        return damage_per_burn;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaPerHit() {
        return mana_per_hit;
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
        if (!(object instanceof AntimageManaBreak))
            return false;
        if (object == this)
            return true;
        AntimageManaBreak otherObject = (AntimageManaBreak) object;
        return otherObject.getKey().equals(getKey());
    }

}
