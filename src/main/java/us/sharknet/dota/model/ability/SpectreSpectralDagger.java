package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpectreSpectralDagger extends Ability {

    private static SpectreSpectralDagger instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_movespeed;
    private final double[] buff_persistence;
    private final int dagger_grace_period;
    private final double[] dagger_path_duration;
    private final int[] dagger_radius;
    private final int[] damage;
    private final double[] hero_path_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] path_radius;
    private final int speed;
    private final int vision_radius;

    private SpectreSpectralDagger() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{2000,2000,2000,2000};
        abilityCooldown = new double[]{16.0,16.0,16.0,16.0};
        abilityManaCost = new int[]{130,140,150,160};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 5334;
        key = "spectre_spectral_dagger";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_movespeed = new int[]{8,12,16,20};
        buff_persistence = new double[]{4.0,4.0,4.0,4.0};
        dagger_grace_period = 2;
        dagger_path_duration = new double[]{12.0,12.0,12.0,12.0};
        dagger_radius = new int[]{125,125,125,125};
        damage = new int[]{50,100,150,200};
        hero_path_duration = new double[]{7.0,7.0,7.0,7.0};
        localizedName = "Spectral Dagger";
        owningHeroShortKey = "spectre";
        path_radius = new int[]{175,175,175,175};
        speed = 8;
        vision_radius = 2;
    }

    public static SpectreSpectralDagger instance() {
        if( instance == null ){
            instance = new SpectreSpectralDagger();
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

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int[] getBonusMovespeed() {
        return bonus_movespeed;
    }

    public double[] getBuffPersistence() {
        return buff_persistence;
    }

    public int getDaggerGracePeriod() {
        return dagger_grace_period;
    }

    public double[] getDaggerPathDuration() {
        return dagger_path_duration;
    }

    public int[] getDaggerRadius() {
        return dagger_radius;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getHeroPathDuration() {
        return hero_path_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPathRadius() {
        return path_radius;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SpectreSpectralDagger))
            return false;
        if (object == this)
            return true;
        SpectreSpectralDagger otherObject = (SpectreSpectralDagger) object;
        return otherObject.getKey().equals(getKey());
    }

}
