package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EmberSpiritFlameGuard extends Ability {

    private static EmberSpiritFlameGuard instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] absorb_amount;
    private final int[] damage_per_second;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double tick_interval;

    private EmberSpiritFlameGuard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{400,400,400,400};
        abilityCooldown = new double[]{35,35,35,35};
        abilityManaCost = new int[]{80,90,100,110};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5605;
        key = "ember_spirit_flame_guard";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        absorb_amount = new int[]{50,200,350,500};
        damage_per_second = new int[]{30,40,50,60};
        duration = new double[]{8.0,12.0,16.0,20.0};
        localizedName = "Flame Guard";
        ownerKey = "npc_dota_hero_ember_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 400;
        tick_interval = .2;
    }

    public static EmberSpiritFlameGuard instance() {
        if( instance == null ){
            instance = new EmberSpiritFlameGuard();
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

    public int[] getAbsorbAmount() {
        return absorb_amount;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
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

    public double getTickInterval() {
        return tick_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EmberSpiritFlameGuard))
            return false;
        if (object == this)
            return true;
        EmberSpiritFlameGuard otherObject = (EmberSpiritFlameGuard) object;
        return otherObject.getKey().equals(getKey());
    }

}
