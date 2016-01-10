package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LunaLucentBeam extends Ability {

    private static LunaLucentBeam instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
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
    private final double[] stun_duration;

    private LunaLucentBeam() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.6,0.6,0.6,0.6};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{6.0,6.0,6.0,6.0};
        abilityDamage = new int[]{75,150,225,300};
        abilityManaCost = new int[]{90,100,110,120};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5222;
        key = "luna_lucent_beam";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Lucent Beam";
        ownerKey = "npc_dota_hero_luna";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{0.6,0.6,0.6,0.6};
    }

    public static LunaLucentBeam instance() {
        if( instance == null ){
            instance = new LunaLucentBeam();
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

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LunaLucentBeam))
            return false;
        if (object == this)
            return true;
        LunaLucentBeam otherObject = (LunaLucentBeam) object;
        return otherObject.getKey().equals(getKey());
    }

}
