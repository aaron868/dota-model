package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FurionWrathOfNature extends Ability {

    private static FurionWrathOfNature instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int buffer_tooltip_scepter;
    private final int[] damage;
    private final int damage_percent_add;
    private final int[] damage_scepter;
    private final double jump_delay;
    private final String localizedName;
    private final int[] max_targets;
    private final int[] max_targets_scepter;
    private final String owningHeroShortKey;
    private final int scepter_buffer;

    private FurionWrathOfNature() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = 0;
        abilityCooldown = new int[]{90,75,60};
        abilityManaCost = new int[]{175,225,275};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        fightRecapLevel = 2;
        iD = 5248;
        key = "furion_wrath_of_nature";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        buffer_tooltip_scepter = 4;
        damage = new int[]{140,180,225};
        damage_percent_add = 7;
        damage_scepter = new int[]{155,210,275};
        jump_delay = .25;
        localizedName = "Wrath Of Nature";
        max_targets = new int[]{16,16,16};
        max_targets_scepter = new int[]{18,18,18};
        owningHeroShortKey = "furion";
        scepter_buffer = 4;
    }

    public static FurionWrathOfNature instance() {
        if( instance == null ){
            instance = new FurionWrathOfNature();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int getBufferTooltipScepter() {
        return buffer_tooltip_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDamagePercentAdd() {
        return damage_percent_add;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public double getJumpDelay() {
        return jump_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxTargets() {
        return max_targets;
    }

    public int[] getMaxTargetsScepter() {
        return max_targets_scepter;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getScepterBuffer() {
        return scepter_buffer;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FurionWrathOfNature))
            return false;
        if (object == this)
            return true;
        FurionWrathOfNature otherObject = (FurionWrathOfNature) object;
        return otherObject.getKey().equals(getKey());
    }

}
