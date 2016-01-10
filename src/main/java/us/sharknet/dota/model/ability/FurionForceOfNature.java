package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FurionForceOfNature extends Ability {

    private static FurionForceOfNature instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] area_of_effect;
    private final double[] duration;
    private final String localizedName;
    private final int[] max_treants;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int treant_health_tooltip;
    private final int treant_max_dmg_tooltip;
    private final int treant_min_dmg_tooltip;

    private FurionForceOfNature() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = new int[]{750,750,750,750};
        abilityCooldown = new double[]{37,37,37,37};
        abilityManaCost = new int[]{160,160,160,160};
        iD = 5247;
        key = "furion_force_of_nature";
        area_of_effect = new int[]{150,225,300,375};
        duration = new double[]{60.0,60.0,60.0,60.0};
        localizedName = "Force Of Nature";
        max_treants = new int[]{2,3,4,5};
        ownerKey = "npc_dota_hero_furion";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        treant_health_tooltip = 550;
        treant_max_dmg_tooltip = 34;
        treant_min_dmg_tooltip = 30;
    }

    public static FurionForceOfNature instance() {
        if( instance == null ){
            instance = new FurionForceOfNature();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getAreaOfEffect() {
        return area_of_effect;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxTreants() {
        return max_treants;
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

    public int getTreantHealthTooltip() {
        return treant_health_tooltip;
    }

    public int getTreantMaxDmgTooltip() {
        return treant_max_dmg_tooltip;
    }

    public int getTreantMinDmgTooltip() {
        return treant_min_dmg_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FurionForceOfNature))
            return false;
        if (object == this)
            return true;
        FurionForceOfNature otherObject = (FurionForceOfNature) object;
        return otherObject.getKey().equals(getKey());
    }

}
