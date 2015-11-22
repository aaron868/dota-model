package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DazzleShadowWave extends Ability {

    private static DazzleShadowWave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bounce_radius;
    private final int[] damage;
    private final int damage_radius;
    private final String localizedName;
    private final int[] max_targets;
    private final String owningHeroShortKey;
    private final int[] tooltip_max_targets_inc_dazzle;

    private DazzleShadowWave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 9;
        abilityCooldown = new int[]{12,10,8,6};
        abilityDamage = new int[]{80,100,120,140};
        abilityManaCost = new int[]{80,90,100,110};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5235;
        key = "dazzle_shadow_wave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bounce_radius = 475;
        damage = new int[]{80,100,120,140};
        damage_radius = 185;
        localizedName = "Shadow Wave";
        max_targets = new int[]{3,4,5,6};
        owningHeroShortKey = "dazzle";
        tooltip_max_targets_inc_dazzle = new int[]{4,5,6,7};
    }

    public static DazzleShadowWave instance() {
        if( instance == null ){
            instance = new DazzleShadowWave();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
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

    public int getBounceRadius() {
        return bounce_radius;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDamageRadius() {
        return damage_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxTargets() {
        return max_targets;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getTooltipMaxTargetsIncDazzle() {
        return tooltip_max_targets_inc_dazzle;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DazzleShadowWave))
            return false;
        if (object == this)
            return true;
        DazzleShadowWave otherObject = (DazzleShadowWave) object;
        return otherObject.getKey().equals(getKey());
    }

}
