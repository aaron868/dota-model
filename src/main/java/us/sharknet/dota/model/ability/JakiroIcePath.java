package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JakiroIcePath extends Ability {

    private static JakiroIcePath instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final double path_delay;
    private final int path_radius;
    private final boolean placeholder;

    private JakiroIcePath() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.65,.65,.65,.65};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityCooldown = new double[]{12.0,11.0,10.0,9.0};
        abilityDamage = new int[]{0,0,0,0};
        abilityDuration = new double[]{1.0,1.33,1.66,2.0};
        abilityManaCost = new int[]{90,90,90,90};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5298;
        key = "jakiro_ice_path";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = 50;
        duration = new double[]{1.0,1.4,1.8,2.2};
        localizedName = "Ice Path";
        ownerKey = "npc_dota_hero_jakiro";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        path_delay = .5;
        path_radius = 150;
        placeholder = false;
    }

    public static JakiroIcePath instance() {
        if( instance == null ){
            instance = new JakiroIcePath();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
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

    public double getPathDelay() {
        return path_delay;
    }

    public int getPathRadius() {
        return path_radius;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
