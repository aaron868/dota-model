package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanHowl extends Ability {

    private static LycanHowl instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportBonus;
    private final int iD;
    private final String key;
    private final int[] hero_bonus_damage;
    private final int howl_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] unit_bonus_damage;

    private LycanHowl() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new int[]{50,45,40,35};
        abilityDuration = 1;
        abilityManaCost = new int[]{15,20,25,30};
        abilityModifierSupportBonus = 5;
        iD = 5396;
        key = "lycan_howl";
        hero_bonus_damage = new int[]{14,26,38,50};
        howl_duration = 1;
        localizedName = "Howl";
        owningHeroShortKey = "lycan";
        unit_bonus_damage = new int[]{5,10,15,20};
    }

    public static LycanHowl instance() {
        if( instance == null ){
            instance = new LycanHowl();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getHeroBonusDamage() {
        return hero_bonus_damage;
    }

    public int getHowlDuration() {
        return howl_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getUnitBonusDamage() {
        return unit_bonus_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LycanHowl))
            return false;
        if (object == this)
            return true;
        LycanHowl otherObject = (LycanHowl) object;
        return otherObject.getKey().equals(getKey());
    }

}
