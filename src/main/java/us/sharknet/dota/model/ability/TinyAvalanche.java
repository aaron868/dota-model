package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinyAvalanche extends Ability {

    private static TinyAvalanche instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int[] num_ticks;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double projectile_duration;
    private final int[] radius;
    private final int stun_duration;
    private final double[] tick_interval;

    private TinyAvalanche() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{17.0,17.0,17.0,17.0};
        abilityDamage = new int[]{100,180,260,300};
        abilityDuration = new double[]{2.0,2.0,2.0,2.0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5106;
        key = "tiny_avalanche";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Avalanche";
        num_ticks = new int[]{4,4,4,4};
        ownerKey = "npc_dota_hero_tiny";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_duration = .5;
        radius = new int[]{275,275,275,275};
        stun_duration = 1;
        tick_interval = new double[]{0.25,0.25,0.25,0.25};
    }

    public static TinyAvalanche instance() {
        if( instance == null ){
            instance = new TinyAvalanche();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getNumTicks() {
        return num_ticks;
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

    public double getProjectileDuration() {
        return projectile_duration;
    }

    public int[] getRadius() {
        return radius;
    }

    public int getStunDuration() {
        return stun_duration;
    }

    public double[] getTickInterval() {
        return tick_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinyAvalanche))
            return false;
        if (object == this)
            return true;
        TinyAvalanche otherObject = (TinyAvalanche) object;
        return otherObject.getKey().equals(getKey());
    }

}
