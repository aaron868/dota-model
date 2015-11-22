package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NevermoreDarkLord extends Ability {

    private static NevermoreDarkLord instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final int onCastbar;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] presence_armor_reduction;
    private final int presence_radius;

    private NevermoreDarkLord() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityCastRange = 900;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        iD = 5063;
        key = "nevermore_dark_lord";
        onCastbar = 0;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Presence of the Dark Lord";
        owningHeroShortKey = "nevermore";
        presence_armor_reduction = new int[]{-3,-4,-5,-6};
        presence_radius = 900;
    }

    public static NevermoreDarkLord instance() {
        if( instance == null ){
            instance = new NevermoreDarkLord();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getOnCastbar() {
        return onCastbar;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPresenceArmorReduction() {
        return presence_armor_reduction;
    }

    public int getPresenceRadius() {
        return presence_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NevermoreDarkLord))
            return false;
        if (object == this)
            return true;
        NevermoreDarkLord otherObject = (NevermoreDarkLord) object;
        return otherObject.getKey().equals(getKey());
    }

}
