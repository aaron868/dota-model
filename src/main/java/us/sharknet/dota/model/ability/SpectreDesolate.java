package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpectreDesolate extends Ability {

    private static SpectreDesolate instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private SpectreDesolate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5335;
        key = "spectre_desolate";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{20,35,50,65};
        localizedName = "Desolate";
        ownerKey = "npc_dota_hero_spectre";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = new int[]{325,325,325,325};
    }

    public static SpectreDesolate instance() {
        if( instance == null ){
            instance = new SpectreDesolate();
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

    public int[] getBonusDamage() {
        return bonus_damage;
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
        if (!(object instanceof SpectreDesolate))
            return false;
        if (object == this)
            return true;
        SpectreDesolate otherObject = (SpectreDesolate) object;
        return otherObject.getKey().equals(getKey());
    }

}
