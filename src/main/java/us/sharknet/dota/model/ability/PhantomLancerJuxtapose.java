package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomLancerJuxtapose extends Ability {

    private static PhantomLancerJuxtapose instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int illusion_damage_in_pct;
    private final int illusion_damage_out_pct;
    private final int illusion_duration;
    private final int illusion_from_illusion_duration;
    private final int illusion_proc_chance_pct;
    private final String localizedName;
    private final int[] max_illusions;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] proc_chance_pct;
    private final int tooltip_illusion_damage;
    private final int tooltip_total_illusion_damage_in_pct;

    private PhantomLancerJuxtapose() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5067;
        key = "phantom_lancer_juxtapose";
        illusion_damage_in_pct = 400;
        illusion_damage_out_pct = -84;
        illusion_duration = 8;
        illusion_from_illusion_duration = 4;
        illusion_proc_chance_pct = 8;
        localizedName = "Juxtapose";
        max_illusions = new int[]{5,7,9};
        ownerKey = "npc_dota_hero_phantom_lancer";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        proc_chance_pct = new int[]{40,45,50};
        tooltip_illusion_damage = 16;
        tooltip_total_illusion_damage_in_pct = 500;
    }

    public static PhantomLancerJuxtapose instance() {
        if( instance == null ){
            instance = new PhantomLancerJuxtapose();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getIllusionDamageInPct() {
        return illusion_damage_in_pct;
    }

    public int getIllusionDamageOutPct() {
        return illusion_damage_out_pct;
    }

    public int getIllusionDuration() {
        return illusion_duration;
    }

    public int getIllusionFromIllusionDuration() {
        return illusion_from_illusion_duration;
    }

    public int getIllusionProcChancePct() {
        return illusion_proc_chance_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxIllusions() {
        return max_illusions;
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

    public int[] getProcChancePct() {
        return proc_chance_pct;
    }

    public int getTooltipIllusionDamage() {
        return tooltip_illusion_damage;
    }

    public int getTooltipTotalIllusionDamageInPct() {
        return tooltip_total_illusion_damage_in_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomLancerJuxtapose))
            return false;
        if (object == this)
            return true;
        PhantomLancerJuxtapose otherObject = (PhantomLancerJuxtapose) object;
        return otherObject.getKey().equals(getKey());
    }

}
