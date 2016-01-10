package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightSpiritFormIlluminateEnd extends Ability {

    private static KeeperOfTheLightSpiritFormIlluminateEnd instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private KeeperOfTheLightSpiritFormIlluminateEnd() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5503;
        key = "keeper_of_the_light_spirit_form_illuminate_end";
        localizedName = "Spirit Form Illuminate End";
        ownerKey = "npc_dota_hero_keeper_of_the_light";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static KeeperOfTheLightSpiritFormIlluminateEnd instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightSpiritFormIlluminateEnd();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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
        if (!(object instanceof KeeperOfTheLightSpiritFormIlluminateEnd))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightSpiritFormIlluminateEnd otherObject = (KeeperOfTheLightSpiritFormIlluminateEnd) object;
        return otherObject.getKey().equals(getKey());
    }

}
