package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MagnataurShockwave extends Ability {

    private static MagnataurShockwave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] shock_damage;
    private final int shock_speed;
    private final int shock_width;

    private MagnataurShockwave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1150,1150,1150,1150};
        abilityCooldown = new double[]{10.0,9.0,8.0,7.0};
        abilityDuration = new double[]{0.6875,0.6875,0.6875,0.6875};
        abilityManaCost = new int[]{90,90,90,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5518;
        key = "magnataur_shockwave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Shockwave";
        ownerKey = "npc_dota_hero_magnataur";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        shock_damage = new int[]{75,150,225,300};
        shock_speed = 1050;
        shock_width = 150;
    }

    public static MagnataurShockwave instance() {
        if( instance == null ){
            instance = new MagnataurShockwave();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int[] getShockDamage() {
        return shock_damage;
    }

    public int getShockSpeed() {
        return shock_speed;
    }

    public int getShockWidth() {
        return shock_width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagnataurShockwave))
            return false;
        if (object == this)
            return true;
        MagnataurShockwave otherObject = (MagnataurShockwave) object;
        return otherObject.getKey().equals(getKey());
    }

}
