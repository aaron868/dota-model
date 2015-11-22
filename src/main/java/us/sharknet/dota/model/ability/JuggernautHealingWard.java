package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class JuggernautHealingWard extends Ability {

    private static JuggernautHealingWard instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int healing_ward_aura_radius;
    private final int healing_ward_duration_tooltip;
    private final int[] healing_ward_heal_amount;
    private final int healing_ward_movespeed_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private JuggernautHealingWard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 35;
        abilityCooldown = new double[]{60.0,60.0,60.0,60.0};
        abilityDuration = new double[]{25.0,25.0,25.0,25.0};
        abilityManaCost = new int[]{120,125,130,135};
        iD = 529;
        key = "juggernaut_healing_ward";
        healing_ward_aura_radius = 5;
        healing_ward_duration_tooltip = 25;
        healing_ward_heal_amount = new int[]{2,3,4,5};
        healing_ward_movespeed_tooltip = 42;
        localizedName = "Healing Ward";
        owningHeroShortKey = "juggernaut";
    }

    public static JuggernautHealingWard instance() {
        if( instance == null ){
            instance = new JuggernautHealingWard();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getHealingWardAuraRadius() {
        return healing_ward_aura_radius;
    }

    public int getHealingWardDurationTooltip() {
        return healing_ward_duration_tooltip;
    }

    public int[] getHealingWardHealAmount() {
        return healing_ward_heal_amount;
    }

    public int getHealingWardMovespeedTooltip() {
        return healing_ward_movespeed_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof JuggernautHealingWard))
            return false;
        if (object == this)
            return true;
        JuggernautHealingWard otherObject = (JuggernautHealingWard) object;
        return otherObject.getKey().equals(getKey());
    }

}
