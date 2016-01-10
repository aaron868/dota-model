package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpiritBreakerEmpoweringHaste extends Ability {

    private static SpiritBreakerEmpoweringHaste instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final int[] aura_radius;
    private final int[] bonus_movespeed_pct;
    private final int[] bonus_movespeed_pct_extra;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SpiritBreakerEmpoweringHaste() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityCooldown = new double[]{12,12,12,12};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        iD = 5354;
        key = "spirit_breaker_empowering_haste";
        aura_radius = new int[]{900,900,900,900};
        bonus_movespeed_pct = new int[]{6,10,14,18};
        bonus_movespeed_pct_extra = new int[]{3,5,7,9};
        duration = 6;
        localizedName = "Empowering Haste";
        ownerKey = "npc_dota_hero_spirit_breaker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static SpiritBreakerEmpoweringHaste instance() {
        if( instance == null ){
            instance = new SpiritBreakerEmpoweringHaste();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int[] getAuraRadius() {
        return aura_radius;
    }

    public int[] getBonusMovespeedPct() {
        return bonus_movespeed_pct;
    }

    public int[] getBonusMovespeedPctExtra() {
        return bonus_movespeed_pct_extra;
    }

    public int getDuration() {
        return duration;
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
        if (!(object instanceof SpiritBreakerEmpoweringHaste))
            return false;
        if (object == this)
            return true;
        SpiritBreakerEmpoweringHaste otherObject = (SpiritBreakerEmpoweringHaste) object;
        return otherObject.getKey().equals(getKey());
    }

}
