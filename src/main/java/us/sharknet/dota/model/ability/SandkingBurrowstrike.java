package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SandkingBurrowstrike extends Ability {

    private static SandkingBurrowstrike instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double burrow_anim_time;
    private final double burrow_duration;
    private final int burrow_speed;
    private final int burrow_speed_scepter;
    private final int burrow_width;
    private final int[] cast_range_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] tooltip_range;

    private SandkingBurrowstrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{350,450,550,650};
        abilityCooldown = new double[]{11.0,11.0,11.0,11.0};
        abilityDamage = new int[]{100,160,220,280};
        abilityManaCost = new int[]{110,120,130,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5102;
        key = "sandking_burrowstrike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burrow_anim_time = .52;
        burrow_duration = 2.17;
        burrow_speed = 2000;
        burrow_speed_scepter = 3000;
        burrow_width = 150;
        cast_range_scepter = new int[]{700,900,1100,1300};
        localizedName = "Burrowstrike";
        ownerKey = "npc_dota_hero_sand_king";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_range = new int[]{350,450,550,650};
    }

    public static SandkingBurrowstrike instance() {
        if( instance == null ){
            instance = new SandkingBurrowstrike();
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

    public double getBurrowAnimTime() {
        return burrow_anim_time;
    }

    public double getBurrowDuration() {
        return burrow_duration;
    }

    public int getBurrowSpeed() {
        return burrow_speed;
    }

    public int getBurrowSpeedScepter() {
        return burrow_speed_scepter;
    }

    public int getBurrowWidth() {
        return burrow_width;
    }

    public int[] getCastRangeScepter() {
        return cast_range_scepter;
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

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SandkingBurrowstrike))
            return false;
        if (object == this)
            return true;
        SandkingBurrowstrike otherObject = (SandkingBurrowstrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
