package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MeepoPoof extends Ability {

    private static MeepoPoof instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private MeepoPoof() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT | | DOTA_ABILITY_BEHAVIOR_UNIT_TARGET | DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN | DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{1.5,1.5,1.5,1.5};
        abilityChannelTime = new double[]{0,0,0,0};
        abilityCooldown = new double[]{12,10,8,6};
        abilityDamage = new int[]{80,100,120,140};
        abilityManaCost = new int[]{80,80,80,80};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5431;
        key = "meepo_poof";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Poof";
        ownerKey = "npc_dota_hero_meepo";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 375;
    }

    public static MeepoPoof instance() {
        if( instance == null ){
            instance = new MeepoPoof();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MeepoPoof))
            return false;
        if (object == this)
            return true;
        MeepoPoof otherObject = (MeepoPoof) object;
        return otherObject.getKey().equals(getKey());
    }

}
