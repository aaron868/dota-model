package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DazzlePoisonTouch extends Ability {

    private static DazzlePoisonTouch instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final int set_time;
    private final int[] should_stun;
    private final int[] slow_1;
    private final int[] slow_2;
    private final int[] slow_3;
    private final int stun_duration;

    private DazzlePoisonTouch() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{15,13,11,7};
        abilityDamage = new int[]{14,20,26,36};
        abilityDuration = new double[]{10,10,10,10};
        abilityManaCost = new int[]{70,70,70,70};
        abilityModifierSupportValue = .35;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5233;
        key = "dazzle_poison_touch";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration_tooltip = 1;
        localizedName = "Poison Touch";
        ownerKey = "npc_dota_hero_dazzle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 1300;
        set_time = 3;
        should_stun = new int[]{0,0,0,1};
        slow_1 = new int[]{-33,-33,-33,-33};
        slow_2 = new int[]{-33,-33,-66,-66};
        slow_3 = new int[]{-33,-66,-100,-100};
        stun_duration = 1;
    }

    public static DazzlePoisonTouch instance() {
        if( instance == null ){
            instance = new DazzlePoisonTouch();
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

    public int getDurationTooltip() {
        return duration_tooltip;
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

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int getSetTime() {
        return set_time;
    }

    public int[] getShouldStun() {
        return should_stun;
    }

    public int[] getSlow1() {
        return slow_1;
    }

    public int[] getSlow2() {
        return slow_2;
    }

    public int[] getSlow3() {
        return slow_3;
    }

    public int getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DazzlePoisonTouch))
            return false;
        if (object == this)
            return true;
        DazzlePoisonTouch otherObject = (DazzlePoisonTouch) object;
        return otherObject.getKey().equals(getKey());
    }

}
