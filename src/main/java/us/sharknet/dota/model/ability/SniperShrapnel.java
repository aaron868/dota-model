package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SniperShrapnel extends Ability {

    private static SniperShrapnel instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int building_damage;
    private final int charge_restore_time;
    private final double damage_delay;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] slow_duration;
    private final int[] slow_movement_speed;

    private SniperShrapnel() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1800,1800,1800,1800};
        abilityCooldown = new double[]{0,0,0,0};
        abilityDamage = new int[]{12,24,36,48};
        abilityManaCost = new int[]{50,50,50,50};
        abilityModifierSupportValue = .25;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5154;
        key = "sniper_shrapnel";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        building_damage = 0;
        charge_restore_time = 55;
        damage_delay = 1.2;
        duration = 1;
        localizedName = "Shrapnel";
        ownerKey = "npc_dota_hero_sniper";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 450;
        slow_duration = new double[]{2.0,2.0,2.0,2.0};
        slow_movement_speed = new int[]{-15,-20,-25,-30};
    }

    public static SniperShrapnel instance() {
        if( instance == null ){
            instance = new SniperShrapnel();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getBuildingDamage() {
        return building_damage;
    }

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public double getDamageDelay() {
        return damage_delay;
    }

    public int getDuration() {
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

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public int[] getSlowMovementSpeed() {
        return slow_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SniperShrapnel))
            return false;
        if (object == this)
            return true;
        SniperShrapnel otherObject = (SniperShrapnel) object;
        return otherObject.getKey().equals(getKey());
    }

}
