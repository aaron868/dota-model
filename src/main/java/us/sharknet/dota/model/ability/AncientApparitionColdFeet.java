package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AncientApparitionColdFeet extends Ability {

    private static AncientApparitionColdFeet instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] break_distance;
    private final int[] cast_range_tooltip;
    private final double[] damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;

    private AncientApparitionColdFeet() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.01,0.01,0.01,0.01};
        abilityCastRange = new int[]{700,800,900,1000};
        abilityCooldown = new double[]{15.0,13.0,11.0,9.0};
        abilityDuration = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{150,150,150,150};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5345;
        key = "ancient_apparition_cold_feet";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        break_distance = new int[]{740,740,740,740};
        cast_range_tooltip = new int[]{700,800,900,1000};
        damage = new double[]{37.5,50.0,62.5,75.0};
        localizedName = "Cold Feet";
        ownerKey = "npc_dota_hero_ancient_apparition";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{1.25,2.0,2.75,3.5};
    }

    public static AncientApparitionColdFeet instance() {
        if( instance == null ){
            instance = new AncientApparitionColdFeet();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getBreakDistance() {
        return break_distance;
    }

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getDamage() {
        return damage;
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

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientApparitionColdFeet))
            return false;
        if (object == this)
            return true;
        AncientApparitionColdFeet otherObject = (AncientApparitionColdFeet) object;
        return otherObject.getKey().equals(getKey());
    }

}
