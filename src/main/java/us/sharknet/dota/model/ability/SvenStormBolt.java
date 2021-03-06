package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SvenStormBolt extends Ability {

    private static SvenStormBolt instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bolt_aoe;
    private final int bolt_speed;
    private final int bolt_stun_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int vision_radius;

    private SvenStormBolt() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{13,13,13,13};
        abilityDamage = new int[]{100,175,250,325};
        abilityManaCost = new int[]{140,140,140,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5094;
        key = "sven_storm_bolt";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bolt_aoe = 255;
        bolt_speed = 1000;
        bolt_stun_duration = 2;
        localizedName = "Storm Bolt";
        ownerKey = "npc_dota_hero_sven";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        vision_radius = 225;
    }

    public static SvenStormBolt instance() {
        if( instance == null ){
            instance = new SvenStormBolt();
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

    public int getBoltAoe() {
        return bolt_aoe;
    }

    public int getBoltSpeed() {
        return bolt_speed;
    }

    public int getBoltStunDuration() {
        return bolt_stun_duration;
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

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SvenStormBolt))
            return false;
        if (object == this)
            return true;
        SvenStormBolt otherObject = (SvenStormBolt) object;
        return otherObject.getKey().equals(getKey());
    }

}
