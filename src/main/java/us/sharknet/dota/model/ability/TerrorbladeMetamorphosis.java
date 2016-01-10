package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TerrorbladeMetamorphosis extends Ability {

    private static TerrorbladeMetamorphosis instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final double base_attack_time;
    private final int[] bonus_damage;
    private final int bonus_range;
    private final double[] duration;
    private final String localizedName;
    private final int metamorph_aura_tooltip;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int speed_loss;
    private final int tooltip_attack_range;
    private final double transformation_time;

    private TerrorbladeMetamorphosis() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{14,14,14,14};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5621;
        key = "terrorblade_metamorphosis";
        base_attack_time = 1.6;
        bonus_damage = new int[]{20,40,60,80};
        bonus_range = 422;
        duration = new double[]{40.0,44.0,48.0,52.0};
        localizedName = "Metamorphosis";
        metamorph_aura_tooltip = 900;
        ownerKey = "npc_dota_hero_terrorblade";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed_loss = 25;
        tooltip_attack_range = 550;
        transformation_time = .35;
    }

    public static TerrorbladeMetamorphosis instance() {
        if( instance == null ){
            instance = new TerrorbladeMetamorphosis();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double getBaseAttackTime() {
        return base_attack_time;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusRange() {
        return bonus_range;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMetamorphAuraTooltip() {
        return metamorph_aura_tooltip;
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

    public int getSpeedLoss() {
        return speed_loss;
    }

    public int getTooltipAttackRange() {
        return tooltip_attack_range;
    }

    public double getTransformationTime() {
        return transformation_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TerrorbladeMetamorphosis))
            return false;
        if (object == this)
            return true;
        TerrorbladeMetamorphosis otherObject = (TerrorbladeMetamorphosis) object;
        return otherObject.getKey().equals(getKey());
    }

}
