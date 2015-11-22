package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UndyingDecay extends Ability {

    private static UndyingDecay instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] decay_damage;
    private final int decay_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int str_scale_up;
    private final int str_steal;
    private final int str_steal_scepter;

    private UndyingDecay() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.45,0.45,0.45,0.45};
        abilityCastRange = 625;
        abilityCooldown = new double[]{10.0,8.0,6.0,4.0};
        abilityDuration = new double[]{21.0,24.0,27.0,30.0};
        abilityManaCost = new int[]{70,90,110,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        fightRecapLevel = 1;
        iD = 5442;
        key = "undying_decay";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        decay_damage = new int[]{20,60,100,140};
        decay_duration = 4;
        localizedName = "Decay";
        owningHeroShortKey = "undying";
        radius = 325;
        str_scale_up = 2;
        str_steal = 4;
        str_steal_scepter = 1;
    }

    public static UndyingDecay instance() {
        if( instance == null ){
            instance = new UndyingDecay();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int[] getDecayDamage() {
        return decay_damage;
    }

    public int getDecayDuration() {
        return decay_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getStrScaleUp() {
        return str_scale_up;
    }

    public int getStrSteal() {
        return str_steal;
    }

    public int getStrStealScepter() {
        return str_steal_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UndyingDecay))
            return false;
        if (object == this)
            return true;
        UndyingDecay otherObject = (UndyingDecay) object;
        return otherObject.getKey().equals(getKey());
    }

}
