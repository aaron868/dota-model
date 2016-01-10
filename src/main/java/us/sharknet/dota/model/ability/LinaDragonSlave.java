package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LinaDragonSlave extends Ability {

    private static LinaDragonSlave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int dragon_slave_distance;
    private final int dragon_slave_speed;
    private final int dragon_slave_width_end;
    private final int dragon_slave_width_initial;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LinaDragonSlave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.45,0.45,0.45,0.45};
        abilityCastRange = new int[]{1075,1075,1075,1075};
        abilityCooldown = new double[]{8.5,8.5,8.5,8.5};
        abilityDamage = new int[]{110,180,250,320};
        abilityDuration = new double[]{0.6875,0.6875,0.6875,0.6875};
        abilityManaCost = new int[]{100,115,130,145};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5040;
        key = "lina_dragon_slave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        dragon_slave_distance = 1075;
        dragon_slave_speed = 1200;
        dragon_slave_width_end = 200;
        dragon_slave_width_initial = 275;
        localizedName = "Dragon Slave";
        ownerKey = "npc_dota_hero_lina";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static LinaDragonSlave instance() {
        if( instance == null ){
            instance = new LinaDragonSlave();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getDragonSlaveDistance() {
        return dragon_slave_distance;
    }

    public int getDragonSlaveSpeed() {
        return dragon_slave_speed;
    }

    public int getDragonSlaveWidthEnd() {
        return dragon_slave_width_end;
    }

    public int getDragonSlaveWidthInitial() {
        return dragon_slave_width_initial;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LinaDragonSlave))
            return false;
        if (object == this)
            return true;
        LinaDragonSlave otherObject = (LinaDragonSlave) object;
        return otherObject.getKey().equals(getKey());
    }

}
