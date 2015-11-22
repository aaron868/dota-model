package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VisageSummonFamiliars extends Ability {

    private static VisageSummonFamiliars instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int damage_charge_time;
    private final int[] damage_per_charge;
    private final int[] familiar_armor;
    private final int familiar_attacks_to_destroy_creeps_tooltip;
    private final int familiar_attacks_to_destroy_tooltip;
    private final int familiar_attacks_to_destroy_tower_tooltip;
    private final int[] familiar_hp;
    private final int[] familiar_max_damage;
    private final int[] familiar_speed;
    private final String localizedName;
    private final int max_damage_charges;
    private final String owningHeroShortKey;

    private VisageSummonFamiliars() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new int[]{0,0,0};
        abilityCooldown = new double[]{180.0,160.0,140.0};
        abilityManaCost = new int[]{150,150,150};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5483;
        key = "visage_summon_familiars";
        damage_charge_time = 15;
        damage_per_charge = new int[]{8,14,22};
        familiar_armor = new int[]{0,1,2};
        familiar_attacks_to_destroy_creeps_tooltip = 6;
        familiar_attacks_to_destroy_tooltip = 3;
        familiar_attacks_to_destroy_tower_tooltip = 12;
        familiar_hp = new int[]{300,450,600};
        familiar_max_damage = new int[]{56,98,154};
        familiar_speed = new int[]{380,390,400};
        localizedName = "Summon Familiars";
        max_damage_charges = 7;
        owningHeroShortKey = "visage";
    }

    public static VisageSummonFamiliars instance() {
        if( instance == null ){
            instance = new VisageSummonFamiliars();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
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

    public int getDamageChargeTime() {
        return damage_charge_time;
    }

    public int[] getDamagePerCharge() {
        return damage_per_charge;
    }

    public int[] getFamiliarArmor() {
        return familiar_armor;
    }

    public int getFamiliarAttacksToDestroyCreepsTooltip() {
        return familiar_attacks_to_destroy_creeps_tooltip;
    }

    public int getFamiliarAttacksToDestroyTooltip() {
        return familiar_attacks_to_destroy_tooltip;
    }

    public int getFamiliarAttacksToDestroyTowerTooltip() {
        return familiar_attacks_to_destroy_tower_tooltip;
    }

    public int[] getFamiliarHp() {
        return familiar_hp;
    }

    public int[] getFamiliarMaxDamage() {
        return familiar_max_damage;
    }

    public int[] getFamiliarSpeed() {
        return familiar_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxDamageCharges() {
        return max_damage_charges;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VisageSummonFamiliars))
            return false;
        if (object == this)
            return true;
        VisageSummonFamiliars otherObject = (VisageSummonFamiliars) object;
        return otherObject.getKey().equals(getKey());
    }

}
