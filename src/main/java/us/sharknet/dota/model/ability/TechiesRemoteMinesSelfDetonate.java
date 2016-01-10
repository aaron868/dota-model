package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesRemoteMinesSelfDetonate extends Ability {

    private static TechiesRemoteMinesSelfDetonate instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private TechiesRemoteMinesSelfDetonate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastRange = new int[]{0,0,0,0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5636;
        key = "techies_remote_mines_self_detonate";
        localizedName = "Remote Mines Self Detonate";
        ownerKey = "npc_dota_hero_techies";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{400,410,425};
    }

    public static TechiesRemoteMinesSelfDetonate instance() {
        if( instance == null ){
            instance = new TechiesRemoteMinesSelfDetonate();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesRemoteMinesSelfDetonate))
            return false;
        if (object == this)
            return true;
        TechiesRemoteMinesSelfDetonate otherObject = (TechiesRemoteMinesSelfDetonate) object;
        return otherObject.getKey().equals(getKey());
    }

}
