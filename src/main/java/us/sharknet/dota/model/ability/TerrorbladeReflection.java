package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TerrorbladeReflection extends Ability {

    private static TerrorbladeReflection instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int attack_slow_tooltip;
    private final double[] illusion_duration;
    private final double[] illusion_outgoing_damage;
    private final double[] illusion_outgoing_tooltip;
    private final String localizedName;
    private final int move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int range;

    private TerrorbladeReflection() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCooldown = new double[]{22,20,18,16};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5619;
        key = "terrorblade_reflection";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attack_slow_tooltip = 25;
        illusion_duration = new double[]{2.5,3.5,4.5,5.5};
        illusion_outgoing_damage = new double[]{60.0,40.0,20.0,0.0};
        illusion_outgoing_tooltip = new double[]{40.0,60.0,80.0,100.0};
        localizedName = "Reflection";
        move_slow = 25;
        ownerKey = "npc_dota_hero_terrorblade";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        range = 900;
    }

    public static TerrorbladeReflection instance() {
        if( instance == null ){
            instance = new TerrorbladeReflection();
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAttackSlowTooltip() {
        return attack_slow_tooltip;
    }

    public double[] getIllusionDuration() {
        return illusion_duration;
    }

    public double[] getIllusionOutgoingDamage() {
        return illusion_outgoing_damage;
    }

    public double[] getIllusionOutgoingTooltip() {
        return illusion_outgoing_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSlow() {
        return move_slow;
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

    public int getRange() {
        return range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TerrorbladeReflection))
            return false;
        if (object == this)
            return true;
        TerrorbladeReflection otherObject = (TerrorbladeReflection) object;
        return otherObject.getKey().equals(getKey());
    }

}
