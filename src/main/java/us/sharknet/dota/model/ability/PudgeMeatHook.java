package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PudgeMeatHook extends Ability {

    private static PudgeMeatHook instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cooldown_scepter;
    private final int[] damage_scepter;
    private final int[] hook_distance;
    private final int hook_speed;
    private final int hook_width;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] vision_duration;
    private final int[] vision_radius;

    private PudgeMeatHook() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1000,1100,1200,1300};
        abilityCooldown = new double[]{14,13,12,11};
        abilityDamage = new int[]{90,180,270,360};
        abilityManaCost = new int[]{110,120,130,140};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5075;
        key = "pudge_meat_hook";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = 4;
        damage_scepter = new int[]{180,270,360,450};
        hook_distance = new int[]{1000,1100,1200,1300};
        hook_speed = 16;
        hook_width = 100;
        localizedName = "Meat Hook";
        ownerKey = "npc_dota_hero_pudge";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        vision_duration = new double[]{4.0,4.0,4.0,4.0};
        vision_radius = new int[]{500,500,500,500};
    }

    public static PudgeMeatHook instance() {
        if( instance == null ){
            instance = new PudgeMeatHook();
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

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int[] getHookDistance() {
        return hook_distance;
    }

    public int getHookSpeed() {
        return hook_speed;
    }

    public int getHookWidth() {
        return hook_width;
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

    public double[] getVisionDuration() {
        return vision_duration;
    }

    public int[] getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PudgeMeatHook))
            return false;
        if (object == this)
            return true;
        PudgeMeatHook otherObject = (PudgeMeatHook) object;
        return otherObject.getKey().equals(getKey());
    }

}
