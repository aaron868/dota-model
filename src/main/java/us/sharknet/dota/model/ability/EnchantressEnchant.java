package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnchantressEnchant extends Ability {

    private static EnchantressEnchant instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int dominate_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] slow_movement_speed;
    private final double[] tooltip_duration;

    private EnchantressEnchant() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{30.0,24.0,18.0,12.0};
        abilityDuration = new double[]{5.5,5.5,5.5,5.5};
        abilityManaCost = new int[]{65,65,65,65};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5268;
        key = "enchantress_enchant";
        dominate_duration = 8;
        localizedName = "Enchant";
        ownerKey = "npc_dota_hero_enchantress";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_movement_speed = new int[]{-20,-30,-40,-50};
        tooltip_duration = new double[]{5.5,5.5,5.5,5.5};
    }

    public static EnchantressEnchant instance() {
        if( instance == null ){
            instance = new EnchantressEnchant();
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

    public int getDominateDuration() {
        return dominate_duration;
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

    public int[] getSlowMovementSpeed() {
        return slow_movement_speed;
    }

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnchantressEnchant))
            return false;
        if (object == this)
            return true;
        EnchantressEnchant otherObject = (EnchantressEnchant) object;
        return otherObject.getKey().equals(getKey());
    }

}
