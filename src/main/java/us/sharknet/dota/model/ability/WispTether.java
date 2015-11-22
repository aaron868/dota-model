package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispTether extends Ability {

    private static WispTether instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int attackslow_tooltip;
    private final int[] latch_distance;
    private final int[] latch_speed;
    private final String localizedName;
    private final int[] movespeed;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int slow;
    private final double[] stun_duration;
    private final double[] tether_duration;
    private final double tether_heal_amp;

    private WispTether() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.001,0.001,0.001,0.001};
        abilityCastRange = new int[]{1800,1800,1800,1800};
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityDuration = new double[]{12.0,12.0,12.0,12.0};
        abilityManaCost = new int[]{40,40,40,40};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 5485;
        key = "wisp_tether";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackslow_tooltip = -1;
        latch_distance = new int[]{700,700,700,700};
        latch_speed = new int[]{1000,1000,1000,1000};
        localizedName = "Tether";
        movespeed = new int[]{14,15,16,17};
        owningHeroShortKey = "wisp";
        radius = new int[]{900,900,900,900};
        slow = -1;
        stun_duration = new double[]{0.75,1.25,1.75,2.25};
        tether_duration = new double[]{12.0,12.0,12.0,12.0};
        tether_heal_amp = 1.5;
    }

    public static WispTether instance() {
        if( instance == null ){
            instance = new WispTether();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAttackslowTooltip() {
        return attackslow_tooltip;
    }

    public int[] getLatchDistance() {
        return latch_distance;
    }

    public int[] getLatchSpeed() {
        return latch_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeed() {
        return movespeed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int getSlow() {
        return slow;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public double[] getTetherDuration() {
        return tether_duration;
    }

    public double getTetherHealAmp() {
        return tether_heal_amp;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WispTether))
            return false;
        if (object == this)
            return true;
        WispTether otherObject = (WispTether) object;
        return otherObject.getKey().equals(getKey());
    }

}
