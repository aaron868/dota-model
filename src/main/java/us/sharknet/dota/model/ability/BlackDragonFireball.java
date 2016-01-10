package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlackDragonFireball extends Ability {

    private static BlackDragonFireball instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double burn_interval;
    private final int damage;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private BlackDragonFireball() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{10,10,10,10};
        abilityManaCost = new int[]{100,100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5689;
        key = "black_dragon_fireball";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_interval = .5;
        damage = 85;
        duration = 1;
        localizedName = "Fireball";
        ownerKey = "npc_dota_neutral_black_dragon";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 300;
    }

    public static BlackDragonFireball instance() {
        if( instance == null ){
            instance = new BlackDragonFireball();
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

    public double getBurnInterval() {
        return burn_interval;
    }

    public int getDamage() {
        return damage;
    }

    public int getDuration() {
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlackDragonFireball))
            return false;
        if (object == this)
            return true;
        BlackDragonFireball otherObject = (BlackDragonFireball) object;
        return otherObject.getKey().equals(getKey());
    }

}
