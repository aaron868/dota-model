package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowDemonShadowPoisonRelease extends Ability {

    private static ShadowDemonShadowPoisonRelease instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCooldown;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ShadowDemonShadowPoisonRelease() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .3;
        abilityCooldown = 1;
        iD = 5424;
        key = "shadow_demon_shadow_poison_release";
        maxLevel = 1;
        localizedName = "Shadow Poison Release";
        owningHeroShortKey = "shadow_demon";
    }

    public static ShadowDemonShadowPoisonRelease instance() {
        if( instance == null ){
            instance = new ShadowDemonShadowPoisonRelease();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowDemonShadowPoisonRelease))
            return false;
        if (object == this)
            return true;
        ShadowDemonShadowPoisonRelease otherObject = (ShadowDemonShadowPoisonRelease) object;
        return otherObject.getKey().equals(getKey());
    }

}
