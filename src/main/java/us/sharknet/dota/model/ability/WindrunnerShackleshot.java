package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WindrunnerShackleshot extends Ability {

    private static WindrunnerShackleshot instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int arrow_speed;
    private final double[] fail_stun_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int shackle_angle;
    private final int shackle_count;
    private final int shackle_distance;
    private final double[] stun_duration;

    private WindrunnerShackleshot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.15,.15,.15,.15};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityDamage = new int[]{0,0,0,0};
        abilityManaCost = new int[]{90,100,110,120};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5130;
        key = "windrunner_shackleshot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        arrow_speed = 1650;
        fail_stun_duration = new double[]{0.75,0.75,0.75,0.75};
        localizedName = "Shackleshot";
        ownerKey = "npc_dota_hero_windrunner";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        shackle_angle = 23;
        shackle_count = 1;
        shackle_distance = 575;
        stun_duration = new double[]{1.5,2.25,3.0,3.75};
    }

    public static WindrunnerShackleshot instance() {
        if( instance == null ){
            instance = new WindrunnerShackleshot();
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

    public int getArrowSpeed() {
        return arrow_speed;
    }

    public double[] getFailStunDuration() {
        return fail_stun_duration;
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

    public int getShackleAngle() {
        return shackle_angle;
    }

    public int getShackleCount() {
        return shackle_count;
    }

    public int getShackleDistance() {
        return shackle_distance;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WindrunnerShackleshot))
            return false;
        if (object == this)
            return true;
        WindrunnerShackleshot otherObject = (WindrunnerShackleshot) object;
        return otherObject.getKey().equals(getKey());
    }

}
