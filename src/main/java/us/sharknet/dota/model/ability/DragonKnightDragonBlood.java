package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightDragonBlood extends Ability {

    private static DragonKnightDragonBlood instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_armor;
    private final int[] bonus_health_regen;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private DragonKnightDragonBlood() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5228;
        key = "dragon_knight_dragon_blood";
        bonus_armor = new int[]{3,6,9,12};
        bonus_health_regen = new int[]{3,6,9,12};
        localizedName = "Dragon Blood";
        ownerKey = "npc_dota_hero_dragon_knight";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static DragonKnightDragonBlood instance() {
        if( instance == null ){
            instance = new DragonKnightDragonBlood();
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

    public int[] getBonusArmor() {
        return bonus_armor;
    }

    public int[] getBonusHealthRegen() {
        return bonus_health_regen;
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
        if (!(object instanceof DragonKnightDragonBlood))
            return false;
        if (object == this)
            return true;
        DragonKnightDragonBlood otherObject = (DragonKnightDragonBlood) object;
        return otherObject.getKey().equals(getKey());
    }

}
