package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BloodseekerThirst extends Ability {

    private static BloodseekerThirst instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int[] bonus_movement_speed;
    private final int invis_threshold_pct;
    private final String localizedName;
    private final int max_bonus_pct;
    private final int min_bonus_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int visibility_threshold_pct;

    private BloodseekerThirst() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5017;
        key = "bloodseeker_thirst";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{10,20,30,40};
        bonus_movement_speed = new int[]{10,20,30,40};
        invis_threshold_pct = 25;
        localizedName = "Thirst";
        max_bonus_pct = 25;
        min_bonus_pct = 75;
        ownerKey = "npc_dota_hero_bloodseeker";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        visibility_threshold_pct = 25;
    }

    public static BloodseekerThirst instance() {
        if( instance == null ){
            instance = new BloodseekerThirst();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getInvisThresholdPct() {
        return invis_threshold_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxBonusPct() {
        return max_bonus_pct;
    }

    public int getMinBonusPct() {
        return min_bonus_pct;
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

    public int getVisibilityThresholdPct() {
        return visibility_threshold_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BloodseekerThirst))
            return false;
        if (object == this)
            return true;
        BloodseekerThirst otherObject = (BloodseekerThirst) object;
        return otherObject.getKey().equals(getKey());
    }

}
