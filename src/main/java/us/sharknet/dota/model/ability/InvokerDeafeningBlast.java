package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerDeafeningBlast extends Ability {

    private static InvokerDeafeningBlast instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final double[] damage;
    private final double[] disarm_duration;
    private final double end_vision_duration;
    private final double[] knockback_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius_end;
    private final int radius_start;
    private final int travel_distance;
    private final int travel_speed;

    private InvokerDeafeningBlast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCastRange = 1000;
        abilityCooldown = 40;
        abilityManaCost = 200;
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        hotKeyOverride = "B";
        iD = 5390;
        key = "invoker_deafening_blast";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new double[]{40.0,80.0,120.0,160.0,200.0,240.0,280.0,320.0};
        disarm_duration = new double[]{1.0,1.5,2.0,2.5,3.0,3.5,4.0,4.5};
        end_vision_duration = 1.75;
        knockback_duration = new double[]{0.25,0.5,0.75,1.0,1.25,1.5,1.75,2.0};
        localizedName = "Deafening Blast";
        owningHeroShortKey = "invoker";
        radius_end = 225;
        radius_start = 175;
        travel_distance = 1000;
        travel_speed = 1100;
    }

    public static InvokerDeafeningBlast instance() {
        if( instance == null ){
            instance = new InvokerDeafeningBlast();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public double[] getDamage() {
        return damage;
    }

    public double[] getDisarmDuration() {
        return disarm_duration;
    }

    public double getEndVisionDuration() {
        return end_vision_duration;
    }

    public double[] getKnockbackDuration() {
        return knockback_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadiusEnd() {
        return radius_end;
    }

    public int getRadiusStart() {
        return radius_start;
    }

    public int getTravelDistance() {
        return travel_distance;
    }

    public int getTravelSpeed() {
        return travel_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerDeafeningBlast))
            return false;
        if (object == this)
            return true;
        InvokerDeafeningBlast otherObject = (InvokerDeafeningBlast) object;
        return otherObject.getKey().equals(getKey());
    }

}
