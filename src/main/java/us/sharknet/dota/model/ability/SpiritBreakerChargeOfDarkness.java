package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpiritBreakerChargeOfDarkness extends Ability {

    private static SpiritBreakerChargeOfDarkness instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bash_radius;
    private final String localizedName;
    private final int[] movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;
    private final double[] vision_duration;
    private final int[] vision_radius;

    private SpiritBreakerChargeOfDarkness() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_ALERT_TARGET","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new double[]{0.47,0.47,0.47,0.47};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{12,12,12,12};
        abilityManaCost = new int[]{100,100,100,100};
        abilityModifierSupportValue = .3;
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5353;
        key = "spirit_breaker_charge_of_darkness";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bash_radius = new int[]{300,300,300,300};
        localizedName = "Charge Of Darkness";
        movement_speed = new int[]{600,650,700,750};
        ownerKey = "npc_dota_hero_spirit_breaker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{1.2,1.6,2.0,2.4};
        vision_duration = new double[]{0.94,0.94,0.94,0.94};
        vision_radius = new int[]{400,400,400,400};
    }

    public static SpiritBreakerChargeOfDarkness instance() {
        if( instance == null ){
            instance = new SpiritBreakerChargeOfDarkness();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getBashRadius() {
        return bash_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeed() {
        return movement_speed;
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

    public double[] getStunDuration() {
        return stun_duration;
    }

    public double[] getVisionDuration() {
        return vision_duration;
    }

    public int[] getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SpiritBreakerChargeOfDarkness))
            return false;
        if (object == this)
            return true;
        SpiritBreakerChargeOfDarkness otherObject = (SpiritBreakerChargeOfDarkness) object;
        return otherObject.getKey().equals(getKey());
    }

}
