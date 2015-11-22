package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OmniknightGuardianAngel extends Ability {

    private static OmniknightGuardianAngel instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final double[] duration_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private OmniknightGuardianAngel() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCooldown = new double[]{150.0,150.0,150.0};
        abilityManaCost = new int[]{125,175,250};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5266;
        key = "omniknight_guardian_angel";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        duration = new double[]{6.0,7.0,8.0};
        duration_scepter = new double[]{8.0,9.0,10.0};
        localizedName = "Guardian Angel";
        owningHeroShortKey = "omniknight";
        radius = new int[]{600,600,600};
    }

    public static OmniknightGuardianAngel instance() {
        if( instance == null ){
            instance = new OmniknightGuardianAngel();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getDurationScepter() {
        return duration_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OmniknightGuardianAngel))
            return false;
        if (object == this)
            return true;
        OmniknightGuardianAngel otherObject = (OmniknightGuardianAngel) object;
        return otherObject.getKey().equals(getKey());
    }

}
