package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RattletrapPowerCogs extends Ability {

    private static RattletrapPowerCogs instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attacks_to_destroy;
    private final int cogs_radius;
    private final int[] drain_amount;
    private final double[] duration;
    private final int extra_pull_buffer;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int push_length;
    private final int push_speed;
    private final int trigger_distance;

    private RattletrapPowerCogs() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{15.0,15.0,15.0,15.0};
        abilityManaCost = new int[]{50,60,70,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5238;
        key = "rattletrap_power_cogs";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attacks_to_destroy = new int[]{2,2,2,3};
        cogs_radius = 200;
        drain_amount = new int[]{80,120,160,200};
        duration = new double[]{5.0,6.0,7.0,8.0};
        extra_pull_buffer = -10;
        localizedName = "Power Cogs";
        ownerKey = "npc_dota_hero_rattletrap";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        push_length = 252;
        push_speed = 300;
        trigger_distance = 170;
    }

    public static RattletrapPowerCogs instance() {
        if( instance == null ){
            instance = new RattletrapPowerCogs();
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

    public int[] getAttacksToDestroy() {
        return attacks_to_destroy;
    }

    public int getCogsRadius() {
        return cogs_radius;
    }

    public int[] getDrainAmount() {
        return drain_amount;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getExtraPullBuffer() {
        return extra_pull_buffer;
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

    public int getPushLength() {
        return push_length;
    }

    public int getPushSpeed() {
        return push_speed;
    }

    public int getTriggerDistance() {
        return trigger_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RattletrapPowerCogs))
            return false;
        if (object == this)
            return true;
        RattletrapPowerCogs otherObject = (RattletrapPowerCogs) object;
        return otherObject.getKey().equals(getKey());
    }

}
