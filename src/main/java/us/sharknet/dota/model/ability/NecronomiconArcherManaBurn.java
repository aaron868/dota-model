package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecronomiconArcherManaBurn extends Ability {

    private static NecronomiconArcherManaBurn instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int[] burn_amount;
    private final int burn_as_damage_tooltip;
    private final int cast_range_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private NecronomiconArcherManaBurn() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = 6;
        abilityCooldown = 2;
        abilityManaCost = new int[]{0,0,0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 523;
        key = "necronomicon_archer_mana_burn";
        burn_amount = new int[]{125,175,225};
        burn_as_damage_tooltip = 1;
        cast_range_tooltip = 6;
        localizedName = "Mana Burn";
        owningHeroShortKey = "necronomicon_archer";
    }

    public static NecronomiconArcherManaBurn instance() {
        if( instance == null ){
            instance = new NecronomiconArcherManaBurn();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
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

    public int[] getBurnAmount() {
        return burn_amount;
    }

    public int getBurnAsDamageTooltip() {
        return burn_as_damage_tooltip;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecronomiconArcherManaBurn))
            return false;
        if (object == this)
            return true;
        NecronomiconArcherManaBurn otherObject = (NecronomiconArcherManaBurn) object;
        return otherObject.getKey().equals(getKey());
    }

}
