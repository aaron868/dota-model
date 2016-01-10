package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowDemonShadowPoisonRelease extends Ability {

    private static ShadowDemonShadowPoisonRelease instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ShadowDemonShadowPoisonRelease() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCooldown = new double[]{1,1,1,1};
        iD = 5424;
        key = "shadow_demon_shadow_poison_release";
        localizedName = "Shadow Poison Release";
        ownerKey = "npc_dota_hero_shadow_demon";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof ShadowDemonShadowPoisonRelease))
            return false;
        if (object == this)
            return true;
        ShadowDemonShadowPoisonRelease otherObject = (ShadowDemonShadowPoisonRelease) object;
        return otherObject.getKey().equals(getKey());
    }

}
