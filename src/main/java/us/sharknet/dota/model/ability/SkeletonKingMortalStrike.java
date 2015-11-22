package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkeletonKingMortalStrike extends Ability {

    private static SkeletonKingMortalStrike instance;

    private final String abilityBehavior;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int crit_chance;
    private final int[] crit_mult;
    private final int drain_duration;
    private final int hp_drain;
    private final String localizedName;
    private final String owningHeroShortKey;

    private SkeletonKingMortalStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 588;
        key = "skeleton_king_mortal_strike";
        crit_chance = 15;
        crit_mult = new int[]{150,200,250,300};
        drain_duration = 7;
        hp_drain = 2;
        localizedName = "Mortal Strike";
        owningHeroShortKey = "skeleton_king";
    }

    public static SkeletonKingMortalStrike instance() {
        if( instance == null ){
            instance = new SkeletonKingMortalStrike();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
