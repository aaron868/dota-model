package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskWalrusKick extends Ability {

    private static TuskWalrusKick instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final boolean isGrantedByScepter;
    private final String key;
    private final String spellImmunityType;
    private final int air_time;
    private final int cooldown_scepter;
    private final int crit_multiplier;
    private final int damage;
    private final String localizedName;
    private final int move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int push_length;
    private final int slow_duration;

    private TuskWalrusKick() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{128,128,128,128};
        abilityCooldown = new double[]{12,12,12,12};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5672;
        isGrantedByScepter = true;
        key = "tusk_walrus_kick";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        air_time = 1;
        cooldown_scepter = 12;
        crit_multiplier = 0;
        damage = 200;
        localizedName = "Walrus Kick";
        move_slow = 40;
        ownerKey = "npc_dota_hero_tusk";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        push_length = 900;
        slow_duration = 4;
    }

    public static TuskWalrusKick instance() {
        if( instance == null ){
            instance = new TuskWalrusKick();
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

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public boolean getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAirTime() {
        return air_time;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
    }

    public int getDamage() {
        return damage;
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

    public int getPushLength() {
        return push_length;
    }

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TuskWalrusKick))
            return false;
        if (object == this)
            return true;
        TuskWalrusKick otherObject = (TuskWalrusKick) object;
        return otherObject.getKey().equals(getKey());
    }

}
