package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MiranaInvis extends Ability {

    private static MiranaInvis instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int duration;
    private final double[] fade_delay;
    private final String localizedName;
    private final String owningHeroShortKey;

    private MiranaInvis() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = 600;
        abilityCooldown = new double[]{140.0,120.0,100.0};
        abilityManaCost = 75;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5049;
        key = "mirana_invis";
        duration = 15;
        fade_delay = new double[]{2.5,2.0,1.5};
        localizedName = "Moonlight Shadow";
        owningHeroShortKey = "mirana";
    }

    public static MiranaInvis instance() {
        if( instance == null ){
            instance = new MiranaInvis();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDuration() {
        return duration;
    }

    public double[] getFadeDelay() {
        return fade_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MiranaInvis))
            return false;
        if (object == this)
            return true;
        MiranaInvis otherObject = (MiranaInvis) object;
        return otherObject.getKey().equals(getKey());
    }

}
