package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BloodseekerBloodBath extends Ability {

    private static BloodseekerBloodBath instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double delay;
    private final int delay_plus_castpoint_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] silence_duration;

    private BloodseekerBloodBath() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{1500,1500,1500,1500};
        abilityCooldown = new double[]{30,25,20,15};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5016;
        key = "bloodseeker_blood_bath";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{120,160,200,240};
        delay = 2.6;
        delay_plus_castpoint_tooltip = 3;
        localizedName = "Blood Bath";
        ownerKey = "npc_dota_hero_bloodseeker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 600;
        silence_duration = new double[]{3.0,4.0,5.0,6.0};
    }

    public static BloodseekerBloodBath instance() {
        if( instance == null ){
            instance = new BloodseekerBloodBath();
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

    public int[] getDamage() {
        return damage;
    }

    public double getDelay() {
        return delay;
    }

    public int getDelayPlusCastpointTooltip() {
        return delay_plus_castpoint_tooltip;
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

    public double[] getSilenceDuration() {
        return silence_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BloodseekerBloodBath))
            return false;
        if (object == this)
            return true;
        BloodseekerBloodBath otherObject = (BloodseekerBloodBath) object;
        return otherObject.getKey().equals(getKey());
    }

}
