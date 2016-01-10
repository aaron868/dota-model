package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinManaBurn extends Ability {

    private static NyxAssassinManaBurn instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] float_multiplier;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NyxAssassinManaBurn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{28.0,20.0,12.0,4.0};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5463;
        key = "nyx_assassin_mana_burn";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        float_multiplier = new double[]{3.5,4.0,4.5,5.0};
        localizedName = "Mana Burn";
        ownerKey = "npc_dota_hero_nyx_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NyxAssassinManaBurn instance() {
        if( instance == null ){
            instance = new NyxAssassinManaBurn();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public double[] getFloatMultiplier() {
        return float_multiplier;
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
        if (!(object instanceof NyxAssassinManaBurn))
            return false;
        if (object == this)
            return true;
        NyxAssassinManaBurn otherObject = (NyxAssassinManaBurn) object;
        return otherObject.getKey().equals(getKey());
    }

}
