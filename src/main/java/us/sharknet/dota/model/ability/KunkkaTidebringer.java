package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaTidebringer extends Ability {

    private static KunkkaTidebringer instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cleave_damage;
    private final int[] damage_bonus;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private KunkkaTidebringer() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 128;
        abilityCooldown = new double[]{13.0,10.0,7.0,4.0};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5032;
        key = "kunkka_tidebringer";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cleave_damage = 100;
        damage_bonus = new int[]{25,40,55,70};
        localizedName = "Tidebringer";
        owningHeroShortKey = "kunkka";
        radius = new int[]{450,500,550,600};
    }

    public static KunkkaTidebringer instance() {
        if( instance == null ){
            instance = new KunkkaTidebringer();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getCleaveDamage() {
        return cleave_damage;
    }

    public int[] getDamageBonus() {
        return damage_bonus;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KunkkaTidebringer))
            return false;
        if (object == this)
            return true;
        KunkkaTidebringer otherObject = (KunkkaTidebringer) object;
        return otherObject.getKey().equals(getKey());
    }

}
