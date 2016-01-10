package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkeletonKingMortalStrike extends Ability {

    private static SkeletonKingMortalStrike instance;

    private final String[] abilityBehavior;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int crit_chance;
    private final int[] crit_mult;
    private final int drain_duration;
    private final int hp_drain;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SkeletonKingMortalStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5088;
        key = "skeleton_king_mortal_strike";
        crit_chance = 15;
        crit_mult = new int[]{150,200,250,300};
        drain_duration = 7;
        hp_drain = 20;
        localizedName = "Mortal Strike";
        ownerKey = "npc_dota_hero_skeleton_king";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static SkeletonKingMortalStrike instance() {
        if( instance == null ){
            instance = new SkeletonKingMortalStrike();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int getCritChance() {
        return crit_chance;
    }

    public int[] getCritMult() {
        return crit_mult;
    }

    public int getDrainDuration() {
        return drain_duration;
    }

    public int getHpDrain() {
        return hp_drain;
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
        if (!(object instanceof SkeletonKingMortalStrike))
            return false;
        if (object == this)
            return true;
        SkeletonKingMortalStrike otherObject = (SkeletonKingMortalStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
