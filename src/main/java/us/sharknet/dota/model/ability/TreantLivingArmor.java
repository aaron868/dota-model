package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantLivingArmor extends Ability {

    private static TreantLivingArmor instance;

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
    private final int[] damage_block;
    private final int[] damage_count;
    private final int duration;
    private final int[] health_regen;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TreantLivingArmor() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{32.0,26.0,20.0,14.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_BUILDING"};
        iD = 5436;
        key = "treant_living_armor";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        damage_block = new int[]{20,40,60,80};
        damage_count = new int[]{4,5,6,7};
        duration = 15;
        health_regen = new int[]{4,7,10,13};
        localizedName = "Living Armor";
        ownerKey = "npc_dota_hero_treant";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static TreantLivingArmor instance() {
        if( instance == null ){
            instance = new TreantLivingArmor();
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

    public int[] getDamageBlock() {
        return damage_block;
    }

    public int[] getDamageCount() {
        return damage_count;
    }

    public int getDuration() {
        return duration;
    }

    public int[] getHealthRegen() {
        return health_regen;
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
        if (!(object instanceof TreantLivingArmor))
            return false;
        if (object == this)
            return true;
        TreantLivingArmor otherObject = (TreantLivingArmor) object;
        return otherObject.getKey().equals(getKey());
    }

}
