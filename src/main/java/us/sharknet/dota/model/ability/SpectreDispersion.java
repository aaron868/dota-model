package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpectreDispersion extends Ability {

    private static SpectreDispersion instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_reflection_pct;
    private final String localizedName;
    private final int[] max_radius;
    private final int[] min_radius;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SpectreDispersion() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5336;
        key = "spectre_dispersion";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_reflection_pct = new int[]{10,14,18,22};
        localizedName = "Dispersion";
        max_radius = new int[]{1000,1000,1000,1000};
        min_radius = new int[]{300,300,300,300};
        ownerKey = "npc_dota_hero_spectre";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static SpectreDispersion instance() {
        if( instance == null ){
            instance = new SpectreDispersion();
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

    public int[] getDamageReflectionPct() {
        return damage_reflection_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxRadius() {
        return max_radius;
    }

    public int[] getMinRadius() {
        return min_radius;
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
        if (!(object instanceof SpectreDispersion))
            return false;
        if (object == this)
            return true;
        SpectreDispersion otherObject = (SpectreDispersion) object;
        return otherObject.getKey().equals(getKey());
    }

}
