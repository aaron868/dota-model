package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterInnerBeast extends Ability {

    private static BeastmasterInnerBeast instance;

    private final String[] abilityBehavior;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private BeastmasterInnerBeast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        iD = 5172;
        key = "beastmaster_inner_beast";
        bonus_attack_speed = new int[]{15,25,35,45};
        localizedName = "Inner Beast";
        ownerKey = "npc_dota_hero_beastmaster";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = 900;
    }

    public static BeastmasterInnerBeast instance() {
        if( instance == null ){
            instance = new BeastmasterInnerBeast();
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
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
        if (!(object instanceof BeastmasterInnerBeast))
            return false;
        if (object == this)
            return true;
        BeastmasterInnerBeast otherObject = (BeastmasterInnerBeast) object;
        return otherObject.getKey().equals(getKey());
    }

}
