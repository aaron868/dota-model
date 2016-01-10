package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbaddonDeathCoil extends Ability {

    private static AbaddonDeathCoil instance;

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
    private final int[] heal_amount;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final double[] self_damage;
    private final double[] target_damage;

    private AbaddonDeathCoil() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.452,0.452,0.452,0.452};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{4.5,4.5,4.5,4.5};
        abilityManaCost = new int[]{50,60,70,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5585;
        key = "abaddon_death_coil";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        heal_amount = new int[]{100,150,200,250};
        localizedName = "Mist Coil";
        ownerKey = "npc_dota_hero_abaddon";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 1250;
        self_damage = new double[]{75.0,100.0,125.0,150.0};
        target_damage = new double[]{100.0,150.0,200.0,250.0};
    }

    public static AbaddonDeathCoil instance() {
        if( instance == null ){
            instance = new AbaddonDeathCoil();
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

    public int[] getHealAmount() {
        return heal_amount;
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

    public double[] getSelfDamage() {
        return self_damage;
    }

    public double[] getTargetDamage() {
        return target_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbaddonDeathCoil))
            return false;
        if (object == this)
            return true;
        AbaddonDeathCoil otherObject = (AbaddonDeathCoil) object;
        return otherObject.getKey().equals(getKey());
    }

}
