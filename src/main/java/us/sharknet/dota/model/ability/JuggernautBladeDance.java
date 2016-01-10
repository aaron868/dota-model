package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JuggernautBladeDance extends Ability {

    private static JuggernautBladeDance instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] blade_dance_crit_chance;
    private final int blade_dance_crit_mult;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private JuggernautBladeDance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5027;
        key = "juggernaut_blade_dance";
        blade_dance_crit_chance = new int[]{20,25,30,35};
        blade_dance_crit_mult = 200;
        localizedName = "Blade Dance";
        ownerKey = "npc_dota_hero_juggernaut";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static JuggernautBladeDance instance() {
        if( instance == null ){
            instance = new JuggernautBladeDance();
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

    public int[] getBladeDanceCritChance() {
        return blade_dance_crit_chance;
    }

    public int getBladeDanceCritMult() {
        return blade_dance_crit_mult;
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
        if (!(object instanceof JuggernautBladeDance))
            return false;
        if (object == this)
            return true;
        JuggernautBladeDance otherObject = (JuggernautBladeDance) object;
        return otherObject.getKey().equals(getKey());
    }

}
