package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidTrueFormBattleCry extends Ability {

    private static LoneDruidTrueFormBattleCry instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] bonus_armor;
    private final int[] bonus_damage;
    private final int cry_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int range;

    private LoneDruidTrueFormBattleCry() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_TYPE_ULTIMATE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCooldown = new double[]{6,6,6,6};
        abilityManaCost = new int[]{50,50,50};
        iD = 5417;
        key = "lone_druid_true_form_battle_cry";
        bonus_armor = new int[]{10,15,20};
        bonus_damage = new int[]{90,120,150};
        cry_duration = 6;
        localizedName = "True Form Battle Cry";
        ownerKey = "npc_dota_hero_lone_druid";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        range = 1;
    }

    public static LoneDruidTrueFormBattleCry instance() {
        if( instance == null ){
            instance = new LoneDruidTrueFormBattleCry();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusArmor() {
        return bonus_armor;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int getCryDuration() {
        return cry_duration;
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

    public int getRange() {
        return range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidTrueFormBattleCry))
            return false;
        if (object == this)
            return true;
        LoneDruidTrueFormBattleCry otherObject = (LoneDruidTrueFormBattleCry) object;
        return otherObject.getKey().equals(getKey());
    }

}
