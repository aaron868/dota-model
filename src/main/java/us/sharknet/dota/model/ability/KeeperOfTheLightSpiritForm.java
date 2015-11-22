package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightSpiritForm extends Ability {

    private static KeeperOfTheLightSpiritForm instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private KeeperOfTheLightSpiritForm() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCooldown = new double[]{80.0,70.0,60.0};
        abilityManaCost = new int[]{100,100,100};
        abilityModifierSupportValue = .35;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5474;
        key = "keeper_of_the_light_spirit_form";
        duration = new double[]{40.0,40.0,40.0};
        localizedName = "Spirit Form";
        owningHeroShortKey = "keeper_of_the_light";
    }

    public static KeeperOfTheLightSpiritForm instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightSpiritForm();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KeeperOfTheLightSpiritForm))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightSpiritForm otherObject = (KeeperOfTheLightSpiritForm) object;
        return otherObject.getKey().equals(getKey());
    }

}
