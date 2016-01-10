package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ArcWardenFlux extends Ability {

    private static ArcWardenFlux instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_tooltip;
    private final int[] damage_per_second;
    private final int duration;
    private final String localizedName;
    private final int move_speed_slow_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int search_radius;
    private final double think_interval;

    private ArcWardenFlux() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,700,800,900};
        abilityCooldown = new double[]{2,2,2,2};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5677;
        key = "arc_warden_flux";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_tooltip = new int[]{600,700,800,900};
        damage_per_second = new int[]{15,30,45,60};
        duration = 6;
        localizedName = "Flux";
        move_speed_slow_pct = 50;
        ownerKey = "npc_dota_hero_arc_warden";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        search_radius = 225;
        think_interval = .5;
    }

    public static ArcWardenFlux instance() {
        if( instance == null ){
            instance = new ArcWardenFlux();
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

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSpeedSlowPct() {
        return move_speed_slow_pct;
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

    public double getThinkInterval() {
        return think_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ArcWardenFlux))
            return false;
        if (object == this)
            return true;
        ArcWardenFlux otherObject = (ArcWardenFlux) object;
        return otherObject.getKey().equals(getKey());
    }

}
