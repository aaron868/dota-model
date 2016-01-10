package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class HarpyStormChainLightning extends Ability {

    private static HarpyStormChainLightning instance;

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
    private final int damage_percent_loss;
    private final int initial_damage;
    private final double jump_delay;
    private final int jump_range;
    private final String localizedName;
    private final int max_targets;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private HarpyStormChainLightning() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{4,4,4,4};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5319;
        key = "harpy_storm_chain_lightning";
        damage_percent_loss = 25;
        initial_damage = 140;
        jump_delay = .25;
        jump_range = 500;
        localizedName = "Chain Lightning";
        max_targets = 4;
        ownerKey = "npc_dota_neutral_harpy_storm";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static HarpyStormChainLightning instance() {
        if( instance == null ){
            instance = new HarpyStormChainLightning();
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

    public int getDamagePercentLoss() {
        return damage_percent_loss;
    }

    public int getInitialDamage() {
        return initial_damage;
    }

    public double getJumpDelay() {
        return jump_delay;
    }

    public int getJumpRange() {
        return jump_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxTargets() {
        return max_targets;
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
        if (!(object instanceof HarpyStormChainLightning))
            return false;
        if (object == this)
            return true;
        HarpyStormChainLightning otherObject = (HarpyStormChainLightning) object;
        return otherObject.getKey().equals(getKey());
    }

}
