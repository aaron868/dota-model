package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LionFingerOfDeath extends Ability {

    private static LionFingerOfDeath instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_scepter;
    private final int[] damage;
    private final double damage_delay;
    private final int[] damage_scepter;
    private final String localizedName;
    private final int[] mana_cost_scepter;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int splash_radius_scepter;

    private LionFingerOfDeath() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{160.0,100.0,40.0};
        abilityManaCost = new int[]{200,420,650};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5047;
        key = "lion_finger_of_death";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cooldown_scepter = new double[]{100.0,60.0,20.0};
        damage = new int[]{600,725,850};
        damage_delay = .25;
        damage_scepter = new int[]{725,875,1025};
        localizedName = "Finger Of Death";
        mana_cost_scepter = new int[]{200,420,625};
        ownerKey = "npc_dota_hero_lion";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        splash_radius_scepter = 3;
    }

    public static LionFingerOfDeath instance() {
        if( instance == null ){
            instance = new LionFingerOfDeath();
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

    public String getAbilityType() {
        return abilityType;
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

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public double getDamageDelay() {
        return damage_delay;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaCostScepter() {
        return mana_cost_scepter;
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

    public int getSplashRadiusScepter() {
        return splash_radius_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LionFingerOfDeath))
            return false;
        if (object == this)
            return true;
        LionFingerOfDeath otherObject = (LionFingerOfDeath) object;
        return otherObject.getKey().equals(getKey());
    }

}
