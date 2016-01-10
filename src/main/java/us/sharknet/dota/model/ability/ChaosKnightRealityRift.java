package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChaosKnightRealityRift extends Ability {

    private static ChaosKnightRealityRift instance;

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
    private final int[] bonus_damage;
    private final double bonus_duration;
    private final int[] cast_range;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ChaosKnightRealityRift() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{550,600,650,700};
        abilityCooldown = new double[]{24,18,12,6};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5427;
        key = "chaos_knight_reality_rift";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{60,100,140,180};
        bonus_duration = 1.2;
        cast_range = new int[]{550,600,650,700};
        localizedName = "Reality Rift";
        ownerKey = "npc_dota_hero_chaos_knight";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ChaosKnightRealityRift instance() {
        if( instance == null ){
            instance = new ChaosKnightRealityRift();
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public double getBonusDuration() {
        return bonus_duration;
    }

    public int[] getCastRange() {
        return cast_range;
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
        if (!(object instanceof ChaosKnightRealityRift))
            return false;
        if (object == this)
            return true;
        ChaosKnightRealityRift otherObject = (ChaosKnightRealityRift) object;
        return otherObject.getKey().equals(getKey());
    }

}
