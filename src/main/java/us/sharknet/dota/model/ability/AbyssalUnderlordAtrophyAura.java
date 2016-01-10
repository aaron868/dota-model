package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbyssalUnderlordAtrophyAura extends Ability {

    private static AbyssalUnderlordAtrophyAura instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final double[] bonus_damage_duration;
    private final int bonus_damage_from_creep;
    private final int bonus_damage_from_hero;
    private final int[] damage_reduction_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private AbyssalUnderlordAtrophyAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityCastRange = new int[]{900,900,900,900};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        iD = 5615;
        key = "abyssal_underlord_atrophy_aura";
        bonus_damage_duration = new double[]{30.0,35.0,40.0,45.0};
        bonus_damage_from_creep = 5;
        bonus_damage_from_hero = 30;
        damage_reduction_pct = new int[]{18,26,34,42};
        localizedName = "Atrophy Aura";
        ownerKey = "npc_dota_hero_abyssal_underlord";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static AbyssalUnderlordAtrophyAura instance() {
        if( instance == null ){
            instance = new AbyssalUnderlordAtrophyAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public double[] getBonusDamageDuration() {
        return bonus_damage_duration;
    }

    public int getBonusDamageFromCreep() {
        return bonus_damage_from_creep;
    }

    public int getBonusDamageFromHero() {
        return bonus_damage_from_hero;
    }

    public int[] getDamageReductionPct() {
        return damage_reduction_pct;
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
        if (!(object instanceof AbyssalUnderlordAtrophyAura))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlordAtrophyAura otherObject = (AbyssalUnderlordAtrophyAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
