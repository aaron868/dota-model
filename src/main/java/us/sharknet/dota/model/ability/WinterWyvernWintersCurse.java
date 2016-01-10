package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WinterWyvernWintersCurse extends Ability {

    private static WinterWyvernWintersCurse instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_attack_speed;
    private final double damage_amplification;
    private final int damage_reduction;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private WinterWyvernWintersCurse() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{120,110,100};
        abilityManaCost = new int[]{250,250,250,250};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5654;
        key = "winter_wyvern_winters_curse";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_attack_speed = 70;
        damage_amplification = 0.0;
        damage_reduction = 100;
        duration = new double[]{3.25,4.0,4.75};
        localizedName = "Winters Curse";
        ownerKey = "npc_dota_hero_winter_wyvern";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 500;
    }

    public static WinterWyvernWintersCurse instance() {
        if( instance == null ){
            instance = new WinterWyvernWintersCurse();
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

    public String getAbilityType() {
        return abilityType;
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

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public double getDamageAmplification() {
        return damage_amplification;
    }

    public int getDamageReduction() {
        return damage_reduction;
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

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WinterWyvernWintersCurse))
            return false;
        if (object == this)
            return true;
        WinterWyvernWintersCurse otherObject = (WinterWyvernWintersCurse) object;
        return otherObject.getKey().equals(getKey());
    }

}
