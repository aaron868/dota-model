package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WinterWyvernColdEmbrace extends Ability {

    private static WinterWyvernColdEmbrace instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final int heal_additive;
    private final double[] heal_percentage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WinterWyvernColdEmbrace() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{24,21,18,15};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5653;
        key = "winter_wyvern_cold_embrace";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        duration = 4;
        heal_additive = 20;
        heal_percentage = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Cold Embrace";
        ownerKey = "npc_dota_hero_winter_wyvern";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static WinterWyvernColdEmbrace instance() {
        if( instance == null ){
            instance = new WinterWyvernColdEmbrace();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getDuration() {
        return duration;
    }

    public int getHealAdditive() {
        return heal_additive;
    }

    public double[] getHealPercentage() {
        return heal_percentage;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WinterWyvernColdEmbrace))
            return false;
        if (object == this)
            return true;
        WinterWyvernColdEmbrace otherObject = (WinterWyvernColdEmbrace) object;
        return otherObject.getKey().equals(getKey());
    }

}
