package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkywrathMageArcaneBolt extends Ability {

    private static SkywrathMageArcaneBolt instance;

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
    private final double[] bolt_damage;
    private final int bolt_speed;
    private final int bolt_vision;
    private final double int_multiplier;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double vision_duration;

    private SkywrathMageArcaneBolt() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{5.0,4.0,3.0,2.0};
        abilityManaCost = new int[]{70,70,70,70};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5581;
        key = "skywrath_mage_arcane_bolt";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bolt_damage = new double[]{60.0,80.0,100.0,120.0};
        bolt_speed = 500;
        bolt_vision = 325;
        int_multiplier = 1.6;
        localizedName = "Arcane Bolt";
        ownerKey = "npc_dota_hero_skywrath_mage";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        vision_duration = 3.34;
    }

    public static SkywrathMageArcaneBolt instance() {
        if( instance == null ){
            instance = new SkywrathMageArcaneBolt();
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

    public double[] getBoltDamage() {
        return bolt_damage;
    }

    public int getBoltSpeed() {
        return bolt_speed;
    }

    public int getBoltVision() {
        return bolt_vision;
    }

    public double getIntMultiplier() {
        return int_multiplier;
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

    public double getVisionDuration() {
        return vision_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkywrathMageArcaneBolt))
            return false;
        if (object == this)
            return true;
        SkywrathMageArcaneBolt otherObject = (SkywrathMageArcaneBolt) object;
        return otherObject.getKey().equals(getKey());
    }

}
