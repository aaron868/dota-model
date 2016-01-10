package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanHowl extends Ability {

    private static LycanHowl instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportBonus;
    private final int iD;
    private final String key;
    private final int[] hero_bonus_damage;
    private final int howl_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] unit_bonus_damage;

    private LycanHowl() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{50,45,40,35};
        abilityDuration = new double[]{10,10,10,10};
        abilityManaCost = new int[]{15,20,25,30};
        abilityModifierSupportBonus = 5;
        iD = 5396;
        key = "lycan_howl";
        hero_bonus_damage = new int[]{14,26,38,50};
        howl_duration = 1;
        localizedName = "Howl";
        ownerKey = "npc_dota_hero_lycan";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
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
