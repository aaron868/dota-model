package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UrsaOverpower extends Ability {

    private static UrsaOverpower instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] attack_speed_bonus_pct;
    private final int duration_tooltip;
    private final String localizedName;
    private final int[] max_attacks;
    private final String owningHeroShortKey;

    private UrsaOverpower() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 0;
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityDuration = new double[]{15.0,15.0,15.0,15.0};
        abilityManaCost = new int[]{45,55,65,75};
        iD = 5358;
        key = "ursa_overpower";
        attack_speed_bonus_pct = new int[]{400,400,400,400};
        duration_tooltip = 15;
        localizedName = "Overpower";
        max_attacks = new int[]{3,4,5,6};
        owningHeroShortKey = "ursa";
    }

    public static UrsaOverpower instance() {
        if( instance == null ){
            instance = new UrsaOverpower();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getAttackSpeedBonusPct() {
        return attack_speed_bonus_pct;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxAttacks() {
        return max_attacks;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UrsaOverpower))
            return false;
        if (object == this)
            return true;
        UrsaOverpower otherObject = (UrsaOverpower) object;
        return otherObject.getKey().equals(getKey());
    }

}
