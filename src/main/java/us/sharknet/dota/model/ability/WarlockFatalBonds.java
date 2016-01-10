package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockFatalBonds extends Ability {

    private static WarlockFatalBonds instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] count;
    private final int damage_share_percentage;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int search_aoe;

    private WarlockFatalBonds() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{25.0,25.0,25.0,25.0};
        abilityDamage = new int[]{0,0,0,0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = 0;
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5162;
        key = "warlock_fatal_bonds";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        count = new int[]{3,4,5,6};
        damage_share_percentage = 25;
        duration = 25;
        localizedName = "Fatal Bonds";
        ownerKey = "npc_dota_hero_warlock";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        search_aoe = 7;
    }

    public static WarlockFatalBonds instance() {
        if( instance == null ){
            instance = new WarlockFatalBonds();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int[] getCount() {
        return count;
    }

    public int getDamageSharePercentage() {
        return damage_share_percentage;
    }

    public int getDuration() {
        return duration;
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

    public int getSearchAoe() {
        return search_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WarlockFatalBonds))
            return false;
        if (object == this)
            return true;
        WarlockFatalBonds otherObject = (WarlockFatalBonds) object;
        return otherObject.getKey().equals(getKey());
    }

}
