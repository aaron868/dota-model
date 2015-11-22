package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AntimageManaBreak extends Ability {

    private static AntimageManaBreak instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double damage_per_burn;
    private final String localizedName;
    private final int[] mana_per_hit;
    private final String owningHeroShortKey;

    private AntimageManaBreak() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 53;
        key = "antimage_mana_break";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_per_burn = .6;
        localizedName = "Mana Break";
        mana_per_hit = new int[]{28,40,52,64};
        owningHeroShortKey = "antimage";
    }

    public static AntimageManaBreak instance() {
        if( instance == null ){
            instance = new AntimageManaBreak();
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

    public double getDamagePerBurn() {
        return damage_per_burn;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaPerHit() {
        return mana_per_hit;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
