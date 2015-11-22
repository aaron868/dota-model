package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JakiroIcePath extends Ability {

    private static JakiroIcePath instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityDamage;
    private final double[] abilityDuration;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double path_delay;
    private final int path_radius;

    private JakiroIcePath() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = new double[]{0.65,0.65,0.65,0.65};
        abilityCastRange = 12;
        abilityCooldown = new double[]{12.0,11.0,10.0,9.0};
        abilityDamage = 0;
        abilityDuration = new double[]{1.0,1.33,1.66,2.0};
        abilityManaCost = 9;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5298;
        key = "jakiro_ice_path";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = 5;
        duration = new double[]{1.0,1.4,1.8,2.2};
        localizedName = "Ice Path";
        owningHeroShortKey = "jakiro";
        path_delay = .5;
        path_radius = 15;
    }

    public static JakiroIcePath instance() {
        if( instance == null ){
            instance = new JakiroIcePath();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public int getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getPathDelay() {
        return path_delay;
    }

    public int getPathRadius() {
        return path_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof JakiroIcePath))
            return false;
        if (object == this)
            return true;
        JakiroIcePath otherObject = (JakiroIcePath) object;
        return otherObject.getKey().equals(getKey());
    }

}
