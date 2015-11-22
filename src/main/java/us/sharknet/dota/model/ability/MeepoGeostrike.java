package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MeepoGeostrike extends Ability {

    private static MeepoGeostrike instance;

    private final String abilityBehavior;
    private final int[] abilityDamage;
    private final int abilityDuration;
    private final int abilityModifierSupportBonus;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] slow;

    private MeepoGeostrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityDamage = new int[]{8,16,24,32};
        abilityDuration = 2;
        abilityModifierSupportBonus = 5;
        iD = 5432;
        key = "meepo_geostrike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration_tooltip = 2;
        localizedName = "Geostrike";
        owningHeroShortKey = "meepo";
        slow = new int[]{-5,-10,-15,-20};
    }

    public static MeepoGeostrike instance() {
        if( instance == null ){
            instance = new MeepoGeostrike();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
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

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSlow() {
        return slow;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MeepoGeostrike))
            return false;
        if (object == this)
            return true;
        MeepoGeostrike otherObject = (MeepoGeostrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
