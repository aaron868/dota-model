package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MeepoDividedWeStand extends Ability {

    private static MeepoDividedWeStand instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int displayAdditionalHeroes;
    private final int iD;
    private final String key;
    private final int levelsBetweenUpgrades;
    private final int requiredLevel;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double respawn;
    private final int[] tooltip_clones;
    private final int tooltip_respawn;
    private final int tooltip_share_percentage;
    private final int tooltip_share_percentage_scepter;

    private MeepoDividedWeStand() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        displayAdditionalHeroes = 1;
        iD = 5433;
        key = "meepo_divided_we_stand";
        levelsBetweenUpgrades = 7;
        requiredLevel = 3;
        localizedName = "Divided We Stand";
        owningHeroShortKey = "meepo";
        respawn = 0.0;
        tooltip_clones = new int[]{1,2,3};
        tooltip_respawn = 2;
        tooltip_share_percentage = 2;
        tooltip_share_percentage_scepter = 1;
    }

    public static MeepoDividedWeStand instance() {
        if( instance == null ){
            instance = new MeepoDividedWeStand();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getDisplayAdditionalHeroes() {
        return displayAdditionalHeroes;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getRespawn() {
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
