package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidTrueForm extends Ability {

    private static LoneDruidTrueForm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final double[] base_attack_time;
    private final int[] bonus_armor;
    private final int[] bonus_hp;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int speed_loss;
    private final double transformation_time;

    private LoneDruidTrueForm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0};
        abilityCooldown = new double[]{0.0,0.0,0.0};
        abilityManaCost = new int[]{25,25,25};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5415;
        key = "lone_druid_true_form";
        base_attack_time = new double[]{1.5,1.5,1.5};
        bonus_armor = new int[]{4,6,8};
        bonus_hp = new int[]{300,600,900};
        localizedName = "True Form";
        ownerKey = "npc_dota_hero_lone_druid";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed_loss = 45;
        transformation_time = 1.933;
    }

    public static LoneDruidTrueForm instance() {
        if( instance == null ){
            instance = new LoneDruidTrueForm();
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

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getBaseAttackTime() {
        return base_attack_time;
    }

    public int[] getBonusArmor() {
        return bonus_armor;
    }

    public int[] getBonusHp() {
        return bonus_hp;
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

    public int getSpeedLoss() {
        return speed_loss;
    }

    public double getTransformationTime() {
        return transformation_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidTrueForm))
            return false;
        if (object == this)
            return true;
        LoneDruidTrueForm otherObject = (LoneDruidTrueForm) object;
        return otherObject.getKey().equals(getKey());
    }

}
