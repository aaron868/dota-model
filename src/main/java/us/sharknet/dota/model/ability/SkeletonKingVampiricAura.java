package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkeletonKingVampiricAura extends Ability {

    private static SkeletonKingVampiricAura instance;

    private final String[] abilityBehavior;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] vampiric_aura;
    private final int vampiric_aura_radius;

    private SkeletonKingVampiricAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        iD = 5087;
        key = "skeleton_king_vampiric_aura";
        localizedName = "Vampiric Aura";
        ownerKey = "npc_dota_hero_skeleton_king";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        vampiric_aura = new int[]{15,20,25,30};
        vampiric_aura_radius = 900;
    }

    public static SkeletonKingVampiricAura instance() {
        if( instance == null ){
            instance = new SkeletonKingVampiricAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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

    public int[] getVampiricAura() {
        return vampiric_aura;
    }

    public int getVampiricAuraRadius() {
        return vampiric_aura_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkeletonKingVampiricAura))
            return false;
        if (object == this)
            return true;
        SkeletonKingVampiricAura otherObject = (SkeletonKingVampiricAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
