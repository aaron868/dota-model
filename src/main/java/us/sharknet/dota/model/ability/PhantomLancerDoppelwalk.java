package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomLancerDoppelwalk extends Ability {

    private static PhantomLancerDoppelwalk instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int delay;
    private final int illusion_1_damage_in_pct;
    private final int illusion_1_damage_out_pct;
    private final int illusion_2_damage_in_pct;
    private final int illusion_2_damage_out_pct;
    private final int illusion_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int search_radius;
    private final int target_aoe;

    private PhantomLancerDoppelwalk() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{25,20,15,10};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5066;
        key = "phantom_lancer_doppelwalk";
        delay = 1;
        illusion_1_damage_in_pct = 0;
        illusion_1_damage_out_pct = -100;
        illusion_2_damage_in_pct = 500;
        illusion_2_damage_out_pct = -80;
        illusion_duration = 8;
        localizedName = "Doppelganger";
        ownerKey = "npc_dota_hero_phantom_lancer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        search_radius = 900;
        target_aoe = 325;
    }

    public static PhantomLancerDoppelwalk instance() {
        if( instance == null ){
            instance = new PhantomLancerDoppelwalk();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDelay() {
        return delay;
    }

    public int getIllusion1DamageInPct() {
        return illusion_1_damage_in_pct;
    }

    public int getIllusion1DamageOutPct() {
        return illusion_1_damage_out_pct;
    }

    public int getIllusion2DamageInPct() {
        return illusion_2_damage_in_pct;
    }

    public int getIllusion2DamageOutPct() {
        return illusion_2_damage_out_pct;
    }

    public int getIllusionDuration() {
        return illusion_duration;
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

    public int getSearchRadius() {
        return search_radius;
    }

    public int getTargetAoe() {
        return target_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomLancerDoppelwalk))
            return false;
        if (object == this)
            return true;
        PhantomLancerDoppelwalk otherObject = (PhantomLancerDoppelwalk) object;
        return otherObject.getKey().equals(getKey());
    }

}
