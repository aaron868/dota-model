package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixFireSpirits extends Ability {

    private static PhoenixFireSpirits instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attackspeed_slow;
    private final int[] dps;
    private final int duration;
    private final int hp_cost_perc;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int spirit_count;
    private final double[] spirit_duration;
    private final int[] spirit_speed;
    private final int tick_interval;

    private PhoenixFireSpirits() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.01,0.01,0.01,0.01};
        abilityCastRange = new int[]{1400,1400,1400,1400};
        abilityCooldown = new double[]{45,40,35,30};
        abilityManaCost = new int[]{80,90,100,110};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5625;
        key = "phoenix_fire_spirits";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackspeed_slow = new int[]{-80,-100,-120,-140};
        dps = new int[]{10,30,50,70};
        duration = 4;
        hp_cost_perc = 20;
        localizedName = "Fire Spirits";
        ownerKey = "npc_dota_hero_phoenix";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{175,175,175,175};
        spirit_count = 4;
        spirit_duration = new double[]{16.0,16.0,16.0,16.0};
        spirit_speed = new int[]{900,900,900,900};
        tick_interval = 1;
    }

    public static PhoenixFireSpirits instance() {
        if( instance == null ){
            instance = new PhoenixFireSpirits();
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

    public int[] getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public int[] getDps() {
        return dps;
    }

    public int getDuration() {
        return duration;
    }

    public int getHpCostPerc() {
        return hp_cost_perc;
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

    public int[] getRadius() {
        return radius;
    }

    public int getSpiritCount() {
        return spirit_count;
    }

    public double[] getSpiritDuration() {
        return spirit_duration;
    }

    public int[] getSpiritSpeed() {
        return spirit_speed;
    }

    public int getTickInterval() {
        return tick_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixFireSpirits))
            return false;
        if (object == this)
            return true;
        PhoenixFireSpirits otherObject = (PhoenixFireSpirits) object;
        return otherObject.getKey().equals(getKey());
    }

}
