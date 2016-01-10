package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AxeCullingBlade extends Ability {

    private static AxeCullingBlade instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
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
    private final int atk_speed_bonus_tooltip;
    private final double[] cooldown_scepter;
    private final int[] damage;
    private final int[] kill_threshold;
    private final int[] kill_threshold_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int speed_aoe;
    private final int speed_bonus;
    private final int speed_duration;
    private final int speed_duration_scepter;

    private AxeCullingBlade() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{75.0,65.0,55.0};
        abilityManaCost = new int[]{60,120,180};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5010;
        key = "axe_culling_blade";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        atk_speed_bonus_tooltip = 30;
        cooldown_scepter = new double[]{6.0,6.0,6.0};
        damage = new int[]{150,250,300};
        kill_threshold = new int[]{250,325,400};
        kill_threshold_scepter = new int[]{300,425,550};
        localizedName = "Culling Blade";
        ownerKey = "npc_dota_hero_axe";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed_aoe = 900;
        speed_bonus = 30;
        speed_duration = 6;
        speed_duration_scepter = 1;
    }

    public static AxeCullingBlade instance() {
        if( instance == null ){
            instance = new AxeCullingBlade();
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

    public int getAtkSpeedBonusTooltip() {
        return atk_speed_bonus_tooltip;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getKillThreshold() {
        return kill_threshold;
    }

    public int[] getKillThresholdScepter() {
        return kill_threshold_scepter;
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

    public int getSpeedAoe() {
        return speed_aoe;
    }

    public int getSpeedBonus() {
        return speed_bonus;
    }

    public int getSpeedDuration() {
        return speed_duration;
    }

    public int getSpeedDurationScepter() {
        return speed_duration_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AxeCullingBlade))
            return false;
        if (object == this)
            return true;
        AxeCullingBlade otherObject = (AxeCullingBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
