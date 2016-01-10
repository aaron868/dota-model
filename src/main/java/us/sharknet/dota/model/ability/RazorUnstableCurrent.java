package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RazorUnstableCurrent extends Ability {

    private static RazorUnstableCurrent instance;

    private final String[] abilityBehavior;
    private final int[] abilityDamage;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int[] movement_speed_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final double[] pause_duration;
    private final boolean placeholder;
    private final double[] purge_frequency;
    private final int[] slow_amount;
    private final double[] slow_duration;

    private RazorUnstableCurrent() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityDamage = new int[]{40,70,100,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5084;
        key = "razor_unstable_current";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Unstable Current";
        movement_speed_pct = new int[]{4,8,12,16};
        ownerKey = "npc_dota_hero_razor";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        pause_duration = new double[]{0.3,0.3,0.3,0.3};
        placeholder = false;
        purge_frequency = new double[]{1.0,1.0,1.0,1.0};
        slow_amount = new int[]{-100,-100,-100,-100};
        slow_duration = new double[]{0.5,1.0,1.5,2.0};
    }

    public static RazorUnstableCurrent instance() {
        if( instance == null ){
            instance = new RazorUnstableCurrent();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeedPct() {
        return movement_speed_pct;
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

    public double[] getPauseDuration() {
        return pause_duration;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public double[] getPurgeFrequency() {
        return purge_frequency;
    }

    public int[] getSlowAmount() {
        return slow_amount;
    }

    public double[] getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RazorUnstableCurrent))
            return false;
        if (object == this)
            return true;
        RazorUnstableCurrent otherObject = (RazorUnstableCurrent) object;
        return otherObject.getKey().equals(getKey());
    }

}
