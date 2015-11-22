package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerTornado extends Ability {

    private static InvokerTornado instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final int base_damage;
    private final double end_vision_duration;
    private final double[] lift_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] quas_damage;
    private final int[] travel_distance;
    private final int travel_speed;
    private final int vision_distance;
    private final double[] wex_damage;

    private InvokerTornado() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCastRange = 2;
        abilityCooldown = 3;
        abilityManaCost = 15;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        hotKeyOverride = "X";
        iD = 5382;
        key = "invoker_tornado";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 2;
        base_damage = 7;
        end_vision_duration = 1.75;
        lift_duration = new double[]{0.8,1.1,1.4,1.7,2.0,2.3,2.6,2.9};
        localizedName = "Tornado";
        owningHeroShortKey = "invoker";
        quas_damage = new double[]{0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        travel_distance = new int[]{800,1200,1600,2000,2400,2800,3200,3600};
        travel_speed = 1;
        vision_distance = 6;
        wex_damage = new double[]{45.0,90.0,135.0,180.0,225.0,270.0,315.0,360.0};
    }

    public static InvokerTornado instance() {
        if( instance == null ){
            instance = new InvokerTornado();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getHotKeyOverride() {
        return hotKeyOverride;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAreaOfEffect() {
        return area_of_effect;
    }

    public int getBaseDamage() {
        return base_damage;
    }

    public double getEndVisionDuration() {
        return end_vision_duration;
    }

    public double[] getLiftDuration() {
        return lift_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getQuasDamage() {
        return quas_damage;
    }

    public int[] getTravelDistance() {
        return travel_distance;
    }

    public int getTravelSpeed() {
        return travel_speed;
    }

    public int getVisionDistance() {
        return vision_distance;
    }

    public double[] getWexDamage() {
        return wex_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerTornado))
            return false;
        if (object == this)
            return true;
        InvokerTornado otherObject = (InvokerTornado) object;
        return otherObject.getKey().equals(getKey());
    }

}
