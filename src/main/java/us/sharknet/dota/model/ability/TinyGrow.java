package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinyGrow extends Ability {

    private static TinyGrow instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed;
    private final int bonus_building_damage_scepter;
    private final int bonus_cleave_damage_scepter;
    private final int bonus_cleave_radius_scepter;
    private final int[] bonus_damage;
    private final int[] bonus_movement_speed;
    private final int bonus_range_scepter;
    private final int[] grow_bonus_damage_pct;
    private final int[] grow_bonus_damage_pct_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TinyGrow() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5109;
        key = "tiny_grow";
        bonus_attack_speed = new int[]{-20,-35,-50};
        bonus_building_damage_scepter = 75;
        bonus_cleave_damage_scepter = 50;
        bonus_cleave_radius_scepter = 400;
        bonus_damage = new int[]{50,100,150};
        bonus_movement_speed = new int[]{40,50,60};
        bonus_range_scepter = 107;
        grow_bonus_damage_pct = new int[]{35,50,65};
        grow_bonus_damage_pct_scepter = new int[]{50,65,80};
        localizedName = "Grow";
        owningHeroShortKey = "tiny";
    }

    public static TinyGrow instance() {
        if( instance == null ){
            instance = new TinyGrow();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusBuildingDamageScepter() {
        return bonus_building_damage_scepter;
    }

    public int getBonusCleaveDamageScepter() {
        return bonus_cleave_damage_scepter;
    }

    public int getBonusCleaveRadiusScepter() {
        return bonus_cleave_radius_scepter;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBonusRangeScepter() {
        return bonus_range_scepter;
    }

    public int[] getGrowBonusDamagePct() {
        return grow_bonus_damage_pct;
    }

    public int[] getGrowBonusDamagePctScepter() {
        return grow_bonus_damage_pct_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinyGrow))
            return false;
        if (object == this)
            return true;
        TinyGrow otherObject = (TinyGrow) object;
        return otherObject.getKey().equals(getKey());
    }

}
