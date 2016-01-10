package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DarkSeerWallOfReplica extends Ability {

    private static DarkSeerWallOfReplica instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] range_tooltip;
    private final int[] replica_damage_incoming;
    private final int[] replica_damage_outgoing;
    private final int[] replica_damage_outgoing_scepter;
    private final int replica_scale;
    private final int[] tooltip_outgoing;
    private final int[] tooltip_outgoing_scepter;
    private final int[] tooltip_replica_total_damage_incoming;
    private final int[] width;

    private DarkSeerWallOfReplica() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.4,0.4,0.4};
        abilityCastRange = new int[]{500,900,1300};
        abilityCooldown = new double[]{100.0,100.0,100.0};
        abilityManaCost = new int[]{125,250,375};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5258;
        key = "dark_seer_wall_of_replica";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{150,150,150};
        duration = 45;
        localizedName = "Wall Of Replica";
        ownerKey = "npc_dota_hero_dark_seer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        range_tooltip = new int[]{500,900,1300};
        replica_damage_incoming = new int[]{300,300,300};
        replica_damage_outgoing = new int[]{-40,-25,-10};
        replica_damage_outgoing_scepter = new int[]{0,20,40};
        replica_scale = 0;
        tooltip_outgoing = new int[]{60,75,90};
        tooltip_outgoing_scepter = new int[]{100,120,140};
        tooltip_replica_total_damage_incoming = new int[]{400,400,400};
        width = new int[]{1000,1000,1000};
    }

    public static DarkSeerWallOfReplica instance() {
        if( instance == null ){
            instance = new DarkSeerWallOfReplica();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getDamage() {
        return damage;
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

    public int[] getRangeTooltip() {
        return range_tooltip;
    }

    public int[] getReplicaDamageIncoming() {
        return replica_damage_incoming;
    }

    public int[] getReplicaDamageOutgoing() {
        return replica_damage_outgoing;
    }

    public int[] getReplicaDamageOutgoingScepter() {
        return replica_damage_outgoing_scepter;
    }

    public int getReplicaScale() {
        return replica_scale;
    }

    public int[] getTooltipOutgoing() {
        return tooltip_outgoing;
    }

    public int[] getTooltipOutgoingScepter() {
        return tooltip_outgoing_scepter;
    }

    public int[] getTooltipReplicaTotalDamageIncoming() {
        return tooltip_replica_total_damage_incoming;
    }

    public int[] getWidth() {
        return width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DarkSeerWallOfReplica))
            return false;
        if (object == this)
            return true;
        DarkSeerWallOfReplica otherObject = (DarkSeerWallOfReplica) object;
        return otherObject.getKey().equals(getKey());
    }

}
