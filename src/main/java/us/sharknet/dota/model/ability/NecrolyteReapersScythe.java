package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecrolyteReapersScythe extends Ability {

    private static NecrolyteReapersScythe instance;

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
    private final int cooldown_scepter;
    private final double[] damage_per_health;
    private final double[] damage_per_health_scepter;
    private final String localizedName;
    private final int[] mana_cost_scepter;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int respawn;
    private final int respawn_constant;
    private final double[] stun_duration;

    private NecrolyteReapersScythe() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{100,85,70};
        abilityManaCost = new int[]{175,340,500};
        abilityModifierSupportValue = .1;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5161;
        key = "necrolyte_reapers_scythe";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = 7;
        damage_per_health = new double[]{0.4,0.6,0.9};
        damage_per_health_scepter = new double[]{0.6,0.9,1.2};
        localizedName = "Reapers Scythe";
        mana_cost_scepter = new int[]{150,340,500};
        ownerKey = "npc_dota_hero_necrolyte";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        respawn = 0;
        respawn_constant = 30;
        stun_duration = new double[]{1.5,1.5,1.5};
    }

    public static NecrolyteReapersScythe instance() {
        if( instance == null ){
            instance = new NecrolyteReapersScythe();
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

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public double[] getDamagePerHealth() {
        return damage_per_health;
    }

    public double[] getDamagePerHealthScepter() {
        return damage_per_health_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaCostScepter() {
        return mana_cost_scepter;
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

    public int getRespawn() {
        return respawn;
    }

    public int getRespawnConstant() {
        return respawn_constant;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecrolyteReapersScythe))
            return false;
        if (object == this)
            return true;
        NecrolyteReapersScythe otherObject = (NecrolyteReapersScythe) object;
        return otherObject.getKey().equals(getKey());
    }

}
