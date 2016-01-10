package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightSpiritFormIlluminate extends Ability {

    private static KeeperOfTheLightSpiritFormIlluminate instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double channel_vision_duration;
    private final double channel_vision_interval;
    private final int channel_vision_radius;
    private final int channel_vision_step;
    private final double[] damage_per_second;
    private final String localizedName;
    private final double[] max_channel_time;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int range;
    private final int speed;
    private final double[] vision_duration;
    private final int[] vision_radius;

    private KeeperOfTheLightSpiritFormIlluminate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1800,1800,1800,1800};
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = new int[]{150,160,170,180};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5479;
        key = "keeper_of_the_light_spirit_form_illuminate";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        channel_vision_duration = 1.34;
        channel_vision_interval = .5;
        channel_vision_radius = 350;
        channel_vision_step = 150;
        damage_per_second = new double[]{100.0,100.0,100.0,100.0};
        localizedName = "Spirit Form Illuminate";
        max_channel_time = new double[]{2.0,3.0,4.0,5.0};
        ownerKey = "npc_dota_hero_keeper_of_the_light";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{350,350,350,350};
        range = 1550;
        speed = 15;
        vision_duration = new double[]{3.34,3.34,3.34,3.34};
        vision_radius = new int[]{800,800,800,800};
    }

    public static KeeperOfTheLightSpiritFormIlluminate instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightSpiritFormIlluminate();
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

    public double getChannelVisionDuration() {
        return channel_vision_duration;
    }

    public double getChannelVisionInterval() {
        return channel_vision_interval;
    }

    public int getChannelVisionRadius() {
        return channel_vision_radius;
    }

    public int getChannelVisionStep() {
        return channel_vision_step;
    }

    public double[] getDamagePerSecond() {
        return damage_per_second;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getMaxChannelTime() {
        return max_channel_time;
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

    public int getRange() {
        return range;
    }

    public int getSpeed() {
        return speed;
    }

    public double[] getVisionDuration() {
        return vision_duration;
    }

    public int[] getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KeeperOfTheLightSpiritFormIlluminate))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightSpiritFormIlluminate otherObject = (KeeperOfTheLightSpiritFormIlluminate) object;
        return otherObject.getKey().equals(getKey());
    }

}
