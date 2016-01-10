package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JuggernautOmniSlash extends Ability {

    private static JuggernautOmniSlash instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final double omni_slash_bounce_tick;
    private final int omni_slash_cooldown_scepter;
    private final int[] omni_slash_damage;
    private final int[] omni_slash_jumps;
    private final int[] omni_slash_jumps_scepter;
    private final int omni_slash_radius;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private JuggernautOmniSlash() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{350,350,350,350};
        abilityCooldown = new double[]{130.0,120.0,110.0};
        abilityManaCost = new int[]{200,275,350};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5030;
        key = "juggernaut_omni_slash";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Omnislash";
        omni_slash_bounce_tick = .4;
        omni_slash_cooldown_scepter = 7;
        omni_slash_damage = new int[]{200,225};
        omni_slash_jumps = new int[]{3,6,9};
        omni_slash_jumps_scepter = new int[]{6,9,12};
        omni_slash_radius = 425;
        ownerKey = "npc_dota_hero_juggernaut";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static JuggernautOmniSlash instance() {
        if( instance == null ){
            instance = new JuggernautOmniSlash();
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

    public String getLocalizedName() {
        return localizedName;
    }

    public double getOmniSlashBounceTick() {
        return omni_slash_bounce_tick;
    }

    public int getOmniSlashCooldownScepter() {
        return omni_slash_cooldown_scepter;
    }

    public int[] getOmniSlashDamage() {
        return omni_slash_damage;
    }

    public int[] getOmniSlashJumps() {
        return omni_slash_jumps;
    }

    public int[] getOmniSlashJumpsScepter() {
        return omni_slash_jumps_scepter;
    }

    public int getOmniSlashRadius() {
        return omni_slash_radius;
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
        if (!(object instanceof JuggernautOmniSlash))
            return false;
        if (object == this)
            return true;
        JuggernautOmniSlash otherObject = (JuggernautOmniSlash) object;
        return otherObject.getKey().equals(getKey());
    }

}
