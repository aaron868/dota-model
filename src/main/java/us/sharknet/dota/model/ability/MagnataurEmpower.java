package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MagnataurEmpower extends Ability {

    private static MagnataurEmpower instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int aura_radius;
    private final int[] bonus_damage_pct;
    private final double[] cleave_damage_pct;
    private final int cleave_radius;
    private final double[] empower_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] splash_damage_pct;
    private final int splash_radius;

    private MagnataurEmpower() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{8,8,8,8};
        abilityManaCost = new int[]{30,40,50,60};
        abilityModifierSupportValue = .3;
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5519;
        key = "magnataur_empower";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        aura_radius = 900;
        bonus_damage_pct = new int[]{20,30,40,50};
        cleave_damage_pct = new double[]{20.0,30.0,40.0,50.0};
        cleave_radius = 200;
        empower_duration = new double[]{40.0,40.0,40.0,40.0};
        localizedName = "Empower";
        ownerKey = "npc_dota_hero_magnataur";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        splash_damage_pct = new double[]{10.0,15.0,20.0,25.0};
        splash_radius = 200;
    }

    public static MagnataurEmpower instance() {
        if( instance == null ){
            instance = new MagnataurEmpower();
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

    public int getAuraRadius() {
        return aura_radius;
    }

    public int[] getBonusDamagePct() {
        return bonus_damage_pct;
    }

    public double[] getCleaveDamagePct() {
        return cleave_damage_pct;
    }

    public int getCleaveRadius() {
        return cleave_radius;
    }

    public double[] getEmpowerDuration() {
        return empower_duration;
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

    public double[] getSplashDamagePct() {
        return splash_damage_pct;
    }

    public int getSplashRadius() {
        return splash_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagnataurEmpower))
            return false;
        if (object == this)
            return true;
        MagnataurEmpower otherObject = (MagnataurEmpower) object;
        return otherObject.getKey().equals(getKey());
    }

}
