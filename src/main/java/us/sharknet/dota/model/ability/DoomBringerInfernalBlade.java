package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DoomBringerInfernalBlade extends Ability {

    private static DoomBringerInfernalBlade instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int burn_damage;
    private final double[] burn_damage_pct;
    private final int burn_duration;
    private final String localizedName;
    private final double ministun_duration;
    private final String owningHeroShortKey;

    private DoomBringerInfernalBlade() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 128;
        abilityCooldown = new int[]{16,12,8,4};
        abilityManaCost = 40;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5341;
        key = "doom_bringer_infernal_blade";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_damage = 40;
        burn_damage_pct = new double[]{1.25,2.5,3.75,5.0};
        burn_duration = 4;
        localizedName = "Infernal Blade";
        ministun_duration = .3;
        owningHeroShortKey = "doom_bringer";
    }

    public static DoomBringerInfernalBlade instance() {
        if( instance == null ){
            instance = new DoomBringerInfernalBlade();
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

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBurnDamage() {
        return burn_damage;
    }

    public double[] getBurnDamagePct() {
        return burn_damage_pct;
    }

    public int getBurnDuration() {
        return burn_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getMinistunDuration() {
        return ministun_duration;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DoomBringerInfernalBlade))
            return false;
        if (object == this)
            return true;
        DoomBringerInfernalBlade otherObject = (DoomBringerInfernalBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
