package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerSunStrike extends Ability {

    private static InvokerSunStrike instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final double[] damage;
    private final double delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int vision_distance;
    private final int vision_duration;

    private InvokerSunStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCastRange = 0;
        abilityCooldown = 25;
        abilityManaCost = 175;
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        fightRecapLevel = 1;
        hotKeyOverride = "T";
        iD = 5386;
        key = "invoker_sun_strike";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        area_of_effect = 175;
        damage = new double[]{100.0,162.5,225.0,287.5,350.0,412.5,475.0,537.5};
        delay = 1.7;
        localizedName = "Sun Strike";
        owningHeroShortKey = "invoker";
        vision_distance = 4;
        vision_duration = 4;
    }

    public static InvokerSunStrike instance() {
        if( instance == null ){
            instance = new InvokerSunStrike();
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

    public int getAreaOfEffect() {
        return area_of_effect;
    }

    public double[] getDamage() {
        return damage;
    }

    public double getDelay() {
        return delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getVisionDistance() {
        return vision_distance;
    }

    public int getVisionDuration() {
        return vision_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerSunStrike))
            return false;
        if (object == this)
            return true;
        InvokerSunStrike otherObject = (InvokerSunStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
