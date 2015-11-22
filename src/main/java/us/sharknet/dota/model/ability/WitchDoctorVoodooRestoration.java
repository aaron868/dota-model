package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WitchDoctorVoodooRestoration extends Ability {

    private static WitchDoctorVoodooRestoration instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] heal;
    private final double[] heal_interval;
    private final String localizedName;
    private final int[] mana_per_second;
    private final String owningHeroShortKey;
    private final int radius;

    private WitchDoctorVoodooRestoration() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = new double[]{0.0,0.0,0.0,0.0};
        abilityManaCost = new int[]{20,30,40,50};
        iD = 5139;
        key = "witch_doctor_voodoo_restoration";
        heal = new int[]{16,24,32,40};
        heal_interval = new double[]{0.33,0.33,0.33,0.33};
        localizedName = "Voodoo Restoration";
        mana_per_second = new int[]{8,12,16,20};
        owningHeroShortKey = "witch_doctor";
        radius = 5;
    }

    public static WitchDoctorVoodooRestoration instance() {
        if( instance == null ){
            instance = new WitchDoctorVoodooRestoration();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getHeal() {
        return heal;
    }

    public double[] getHealInterval() {
        return heal_interval;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaPerSecond() {
        return mana_per_second;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WitchDoctorVoodooRestoration))
            return false;
        if (object == this)
            return true;
        WitchDoctorVoodooRestoration otherObject = (WitchDoctorVoodooRestoration) object;
        return otherObject.getKey().equals(getKey());
    }

}
