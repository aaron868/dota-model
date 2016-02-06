package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MeepoDividedWeStand extends Ability {

    private static MeepoDividedWeStand instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int levelsBetweenUpgrades;
    private final int requiredLevel;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int respawn;
    private final int[] tooltip_clones;
    private final int tooltip_respawn;
    private final int tooltip_share_percentage;
    private final int tooltip_share_percentage_scepter;

    private MeepoDividedWeStand() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5433;
        key = "meepo_divided_we_stand";
        levelsBetweenUpgrades = 7;
        requiredLevel = 3;
        localizedName = "Divided We Stand";
        ownerKey = "npc_dota_hero_meepo";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        respawn = 0;
        tooltip_clones = new int[]{1,2,3};
        tooltip_respawn = 20;
        tooltip_share_percentage = 20;
        tooltip_share_percentage_scepter = 100;
    }

    public static MeepoDividedWeStand instance() {
        if( instance == null ){
            instance = new MeepoDividedWeStand();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getLevelsBetweenUpgrades() {
        return levelsBetweenUpgrades;
    }

    public int getRequiredLevel() {
        return requiredLevel;
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

    public int getRespawn() {
        return respawn;
    }

    public int[] getTooltipClones() {
        return tooltip_clones;
    }

    public int getTooltipRespawn() {
        return tooltip_respawn;
    }

    public int getTooltipSharePercentage() {
        return tooltip_share_percentage;
    }

    public int getTooltipSharePercentageScepter() {
        return tooltip_share_percentage_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MeepoDividedWeStand))
            return false;
        if (object == this)
            return true;
        MeepoDividedWeStand otherObject = (MeepoDividedWeStand) object;
        return otherObject.getKey().equals(getKey());
    }

}
