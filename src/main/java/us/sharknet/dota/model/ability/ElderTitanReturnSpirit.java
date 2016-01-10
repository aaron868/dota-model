package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ElderTitanReturnSpirit extends Ability {

    private static ElderTitanReturnSpirit instance;

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

    private ElderTitanReturnSpirit() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{0.0,0.0,0.0};
        iD = 5592;
        key = "elder_titan_return_spirit";
        localizedName = "Return Spirit";
        ownerKey = "npc_dota_hero_elder_titan";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ElderTitanReturnSpirit instance() {
        if( instance == null ){
            instance = new ElderTitanReturnSpirit();
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
        if (!(object instanceof ElderTitanReturnSpirit))
            return false;
        if (object == this)
            return true;
        ElderTitanReturnSpirit otherObject = (ElderTitanReturnSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
