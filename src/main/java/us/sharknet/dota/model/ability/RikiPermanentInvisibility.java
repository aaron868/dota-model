package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiPermanentInvisibility extends Ability {

    private static RikiPermanentInvisibility instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final double[] bonus_health_regen;
    private final double[] fade_delay;
    private final double[] fade_time;
    private final String localizedName;
    private final String owningHeroShortKey;

    private RikiPermanentInvisibility() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = new double[]{8.0,6.0,4.0,2.0};
        iD = 5145;
        key = "riki_permanent_invisibility";
        bonus_health_regen = new double[]{6.0,8.0,10.0,12.0};
        fade_delay = new double[]{8.0,6.0,4.0,2.0};
        fade_time = new double[]{0.0,0.0,0.0,0.0};
        localizedName = "Permanent Invisibility";
        owningHeroShortKey = "riki";
    }

    public static RikiPermanentInvisibility instance() {
        if( instance == null ){
            instance = new RikiPermanentInvisibility();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public double[] getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public double[] getFadeDelay() {
        return fade_delay;
    }

    public double[] getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RikiPermanentInvisibility))
            return false;
        if (object == this)
            return true;
        RikiPermanentInvisibility otherObject = (RikiPermanentInvisibility) object;
        return otherObject.getKey().equals(getKey());
    }

}
