package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NevermoreNecromastery extends Ability {

    private static NevermoreNecromastery instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final int necromastery_damage_per_soul;
    private final int[] necromastery_max_souls;
    private final int[] necromastery_max_souls_scepter;
    private final double necromastery_soul_release;
    private final int necromastery_souls_hero_bonus;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NevermoreNecromastery() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5062;
        key = "nevermore_necromastery";
        localizedName = "Necromastery";
        necromastery_damage_per_soul = 2;
        necromastery_max_souls = new int[]{15,22,29,36};
        necromastery_max_souls_scepter = new int[]{15,22,29,36};
        necromastery_soul_release = .5;
        necromastery_souls_hero_bonus = 11;
        ownerKey = "npc_dota_hero_nevermore";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static NevermoreNecromastery instance() {
        if( instance == null ){
            instance = new NevermoreNecromastery();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNecromasteryDamagePerSoul() {
        return necromastery_damage_per_soul;
    }

    public int[] getNecromasteryMaxSouls() {
        return necromastery_max_souls;
    }

    public int[] getNecromasteryMaxSoulsScepter() {
        return necromastery_max_souls_scepter;
    }

    public double getNecromasterySoulRelease() {
        return necromastery_soul_release;
    }

    public int getNecromasterySoulsHeroBonus() {
        return necromastery_souls_hero_bonus;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NevermoreNecromastery))
            return false;
        if (object == this)
            return true;
        NevermoreNecromastery otherObject = (NevermoreNecromastery) object;
        return otherObject.getKey().equals(getKey());
    }

}
