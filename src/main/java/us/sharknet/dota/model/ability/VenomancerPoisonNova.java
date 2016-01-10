package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VenomancerPoisonNova extends Ability {

    private static VenomancerPoisonNova instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_scepter;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int duration;
    private final int duration_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int speed;
    private final int[] start_radius;

    private VenomancerPoisonNova() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0};
        abilityCooldown = new double[]{140.0,120.0,100.0};
        abilityManaCost = new int[]{200,300,400};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5181;
        key = "venomancer_poison_nova";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = new double[]{140.0,120.0,60.0};
        damage = new int[]{30,55,80};
        damage_scepter = new int[]{60,85,110};
        duration = 16;
        duration_scepter = 16;
        localizedName = "Poison Nova";
        ownerKey = "npc_dota_hero_venomancer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 830;
        speed = 500;
        start_radius = new int[]{255,255,255};
    }

    public static VenomancerPoisonNova instance() {
        if( instance == null ){
            instance = new VenomancerPoisonNova();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationScepter() {
        return duration_scepter;
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

    public int getSpeed() {
        return speed;
    }

    public int[] getStartRadius() {
        return start_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VenomancerPoisonNova))
            return false;
        if (object == this)
            return true;
        VenomancerPoisonNova otherObject = (VenomancerPoisonNova) object;
        return otherObject.getKey().equals(getKey());
    }

}
