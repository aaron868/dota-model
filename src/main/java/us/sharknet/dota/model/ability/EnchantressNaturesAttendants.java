package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnchantressNaturesAttendants extends Ability {

    private static EnchantressNaturesAttendants instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final double[] heal;
    private final int heal_interval;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] wisp_count;

    private EnchantressNaturesAttendants() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{45.0,45.0,45.0,45.0};
        abilityDuration = 11;
        abilityManaCost = new int[]{125,140,155,170};
        iD = 5269;
        key = "enchantress_natures_attendants";
        heal = new double[]{10.0,10.0,10.0,10.0};
        heal_interval = 1;
        localizedName = "Natures Attendants";
        owningHeroShortKey = "enchantress";
        radius = new int[]{275,275,275,275};
        wisp_count = new int[]{4,6,8,10};
    }

    public static EnchantressNaturesAttendants instance() {
        if( instance == null ){
            instance = new EnchantressNaturesAttendants();
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

    public int getAbilityDuration() {
        return abilityDuration;
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

    public double[] getHeal() {
        return heal;
    }

    public int getHealInterval() {
        return heal_interval;
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

    public int[] getWispCount() {
        return wisp_count;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnchantressNaturesAttendants))
            return false;
        if (object == this)
            return true;
        EnchantressNaturesAttendants otherObject = (EnchantressNaturesAttendants) object;
        return otherObject.getKey().equals(getKey());
    }

}
