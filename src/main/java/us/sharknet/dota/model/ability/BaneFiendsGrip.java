package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BaneFiendsGrip extends Ability {

    private static BaneFiendsGrip instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] fiend_grip_damage;
    private final int[] fiend_grip_damage_scepter;
    private final double[] fiend_grip_duration;
    private final int fiend_grip_duration_scepter;
    private final int fiend_grip_mana_drain;
    private final int fiend_grip_mana_drain_scepter;
    private final int fiend_grip_tick_interval;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BaneFiendsGrip() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = new int[]{625,625,625,625};
        abilityChannelTime = new double[]{5.0,5.0,5.0};
        abilityCooldown = new double[]{100.0,100.0,100.0};
        abilityManaCost = new int[]{200,300,400};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5013;
        key = "bane_fiends_grip";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        fiend_grip_damage = new int[]{100,155,215};
        fiend_grip_damage_scepter = new int[]{155,215,270};
        fiend_grip_duration = new double[]{5.0,5.0,5.0};
        fiend_grip_duration_scepter = 7;
        fiend_grip_mana_drain = 5;
        fiend_grip_mana_drain_scepter = 10;
        fiend_grip_tick_interval = 1;
        localizedName = "Fiends Grip";
        ownerKey = "npc_dota_hero_bane";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static BaneFiendsGrip instance() {
        if( instance == null ){
            instance = new BaneFiendsGrip();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getFiendGripDamage() {
        return fiend_grip_damage;
    }

    public int[] getFiendGripDamageScepter() {
        return fiend_grip_damage_scepter;
    }

    public double[] getFiendGripDuration() {
        return fiend_grip_duration;
    }

    public int getFiendGripDurationScepter() {
        return fiend_grip_duration_scepter;
    }

    public int getFiendGripManaDrain() {
        return fiend_grip_mana_drain;
    }

    public int getFiendGripManaDrainScepter() {
        return fiend_grip_mana_drain_scepter;
    }

    public int getFiendGripTickInterval() {
        return fiend_grip_tick_interval;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BaneFiendsGrip))
            return false;
        if (object == this)
            return true;
        BaneFiendsGrip otherObject = (BaneFiendsGrip) object;
        return otherObject.getKey().equals(getKey());
    }

}
