package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiFrostArmor extends Ability {

    private static OgreMagiFrostArmor instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int armor_bonus;
    private final int attackspeed_slow;
    private final int duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int slow_duration;

    private OgreMagiFrostArmor() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{.56,.56,.56,.56};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{5,5,5,5};
        abilityManaCost = new int[]{40,40,40,40};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5304;
        key = "ogre_magi_frost_armor";
        armor_bonus = 8;
        attackspeed_slow = -20;
        duration = 45;
        localizedName = "Frost Armor";
        movespeed_slow = -30;
        ownerKey = "npc_dota_hero_ogre_magi";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_duration = 5;
    }

    public static OgreMagiFrostArmor instance() {
        if( instance == null ){
            instance = new OgreMagiFrostArmor();
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

    public int getArmorBonus() {
        return armor_bonus;
    }

    public int getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
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

    public int getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiFrostArmor))
            return false;
        if (object == this)
            return true;
        OgreMagiFrostArmor otherObject = (OgreMagiFrostArmor) object;
        return otherObject.getKey().equals(getKey());
    }

}
