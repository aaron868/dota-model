package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbyssalUnderlordDarkRift extends Ability {

    private static AbyssalUnderlordDarkRift instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] teleport_delay;

    private AbyssalUnderlordDarkRift() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.6,.6,.6,.6};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{13,13,13,13};
        abilityManaCost = new int[]{75,150,225};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_INVULNERABLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_BUILDING"};
        iD = 5616;
        key = "abyssal_underlord_dark_rift";
        localizedName = "Dark Rift";
        ownerKey = "npc_dota_hero_abyssal_underlord";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 450;
        teleport_delay = new double[]{5.0,4.0,3.0};
    }

    public static AbyssalUnderlordDarkRift instance() {
        if( instance == null ){
            instance = new AbyssalUnderlordDarkRift();
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

    public String getAbilityType() {
        return abilityType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getRadius() {
        return radius;
    }

    public double[] getTeleportDelay() {
        return teleport_delay;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbyssalUnderlordDarkRift))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlordDarkRift otherObject = (AbyssalUnderlordDarkRift) object;
        return otherObject.getKey().equals(getKey());
    }

}
