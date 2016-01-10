package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerSunStrike extends Ability {

    private static InvokerSunStrike instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final double[] damage;
    private final double delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int vision_distance;
    private final int vision_duration;

    private InvokerSunStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{25,25,25,25};
        abilityManaCost = new int[]{175,175,175,175};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5386;
        key = "invoker_sun_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        area_of_effect = 175;
        damage = new double[]{100.0,162.5,225.0,287.5,350.0,412.5,475.0,537.5};
        delay = 1.7;
        localizedName = "Sun Strike";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        vision_distance = 400;
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
