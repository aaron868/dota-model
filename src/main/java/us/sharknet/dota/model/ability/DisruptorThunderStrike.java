package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DisruptorThunderStrike extends Ability {

    private static DisruptorThunderStrike instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final double[] strike_interval;
    private final int[] strikes;

    private DisruptorThunderStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.05,0.05,0.05,0.05};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{12,11,10,9};
        abilityDamage = new int[]{40,60,80,100};
        abilityDuration = new double[]{6.0,6.0,6.0,6.0};
        abilityManaCost = new int[]{130,130,130,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5458;
        key = "disruptor_thunder_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{6.0,6.0,6.0,6.0};
        localizedName = "Thunder Strike";
        ownerKey = "npc_dota_hero_disruptor";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{240,240,240,240};
        strike_interval = new double[]{2.0,2.0,2.0,2.0};
        strikes = new int[]{4,4,4,4};
    }

    public static DisruptorThunderStrike instance() {
        if( instance == null ){
            instance = new DisruptorThunderStrike();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getDuration() {
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

    public int[] getRadius() {
        return radius;
    }

    public double[] getStrikeInterval() {
        return strike_interval;
    }

    public int[] getStrikes() {
        return strikes;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DisruptorThunderStrike))
            return false;
        if (object == this)
            return true;
        DisruptorThunderStrike otherObject = (DisruptorThunderStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
