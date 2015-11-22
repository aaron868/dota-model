package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidTrueFormBattleCry extends Ability {

    private static LoneDruidTrueFormBattleCry instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int[] bonus_armor;
    private final int[] bonus_damage;
    private final int cry_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int range;

    private LoneDruidTrueFormBattleCry() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_TYPE_ULTIMATE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCooldown = 6;
        abilityManaCost = new int[]{50,50,50};
        iD = 5417;
        key = "lone_druid_true_form_battle_cry";
        maxLevel = 3;
        bonus_armor = new int[]{10,15,20};
        bonus_damage = new int[]{90,120,150};
        cry_duration = 6;
        localizedName = "True Form Battle Cry";
        owningHeroShortKey = "lone_druid";
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

    public int getAbilityCooldown() {
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

    public int getMaxLevel() {
        return maxLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
