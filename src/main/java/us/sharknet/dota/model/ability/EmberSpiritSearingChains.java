package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EmberSpiritSearingChains extends Ability {

    private static EmberSpiritSearingChains instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] chains_damage;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int tick_interval;
    private final int[] total_damage_tooltip;
    private final int unit_count;

    private EmberSpiritSearingChains() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{400,400,400,400};
        abilityCooldown = new double[]{14.0,12.0,10.0,8.0};
        abilityManaCost = new int[]{110,110,110,110};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5603;
        key = "ember_spirit_searing_chains";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        chains_damage = new int[]{80,60,120,100};
        duration = new double[]{1.0,2.0,2.0,3.0};
        localizedName = "Searing Chains";
        ownerKey = "npc_dota_hero_ember_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 400;
        tick_interval = 1;
        total_damage_tooltip = new int[]{80,120,240,300};
        unit_count = 2;
    }

    public static EmberSpiritSearingChains instance() {
        if( instance == null ){
            instance = new EmberSpiritSearingChains();
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getChainsDamage() {
        return chains_damage;
    }

    public double[] getDuration() {
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

    public int getTickInterval() {
        return tick_interval;
    }

    public int[] getTotalDamageTooltip() {
        return total_damage_tooltip;
    }

    public int getUnitCount() {
        return unit_count;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EmberSpiritSearingChains))
            return false;
        if (object == this)
            return true;
        EmberSpiritSearingChains otherObject = (EmberSpiritSearingChains) object;
        return otherObject.getKey().equals(getKey());
    }

}
