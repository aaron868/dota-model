package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbyssalUnderlordPitOfMalice extends Ability {

    private static AbyssalUnderlordPitOfMalice instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final double[] ensnare_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final int pit_damage;
    private final int pit_duration;
    private final double pit_interval;
    private final boolean placeholder;
    private final int radius;

    private AbyssalUnderlordPitOfMalice() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{.6,.6,.6,.6};
        abilityCastRange = new int[]{750,750,750,750};
        abilityCooldown = new double[]{24.0,21.0,18.0,15.0};
        abilityManaCost = new int[]{100,115,130,145};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5614;
        key = "abyssal_underlord_pit_of_malice";
        ensnare_duration = new double[]{1.0,1.5,2.0,2.5};
        localizedName = "Pit Of Malice";
        ownerKey = "npc_dota_hero_abyssal_underlord";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        pit_damage = 100;
        pit_duration = 7;
        pit_interval = .5;
        placeholder = false;
        radius = 275;
    }

    public static AbyssalUnderlordPitOfMalice instance() {
        if( instance == null ){
            instance = new AbyssalUnderlordPitOfMalice();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getEnsnareDuration() {
        return ensnare_duration;
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

    public int getPitDamage() {
        return pit_damage;
    }

    public int getPitDuration() {
        return pit_duration;
    }

    public double getPitInterval() {
        return pit_interval;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbyssalUnderlordPitOfMalice))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlordPitOfMalice otherObject = (AbyssalUnderlordPitOfMalice) object;
        return otherObject.getKey().equals(getKey());
    }

}
