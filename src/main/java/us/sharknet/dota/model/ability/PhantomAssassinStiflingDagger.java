package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomAssassinStiflingDagger extends Ability {

    private static PhantomAssassinStiflingDagger instance;

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
    private final int[] creep_damage;
    private final int dagger_speed;
    private final int[] duration;
    private final int[] hero_damage;
    private final String localizedName;
    private final int move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private PhantomAssassinStiflingDagger() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityCooldown = new double[]{6,6,6,6};
        abilityDuration = new double[]{1.0,2.0,3.0,4.0};
        abilityManaCost = new int[]{30,25,20,15};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5190;
        key = "phantom_assassin_stifling_dagger";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        creep_damage = new int[]{60,100,140,180};
        dagger_speed = 1200;
        duration = new int[]{1,2,3,4};
        hero_damage = new int[]{30,50,70,90};
        localizedName = "Stifling Dagger";
        move_slow = -50;
        ownerKey = "npc_dota_hero_phantom_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static PhantomAssassinStiflingDagger instance() {
        if( instance == null ){
            instance = new PhantomAssassinStiflingDagger();
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

    public int[] getCreepDamage() {
        return creep_damage;
    }

    public int getDaggerSpeed() {
        return dagger_speed;
    }

    public int[] getDuration() {
        return duration;
    }

    public int[] getHeroDamage() {
        return hero_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSlow() {
        return move_slow;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomAssassinStiflingDagger))
            return false;
        if (object == this)
            return true;
        PhantomAssassinStiflingDagger otherObject = (PhantomAssassinStiflingDagger) object;
        return otherObject.getKey().equals(getKey());
    }

}
