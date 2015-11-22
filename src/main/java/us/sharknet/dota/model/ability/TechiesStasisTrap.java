package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesStasisTrap extends Ability {

    private static TechiesStasisTrap instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int activation_radius;
    private final double activation_time;
    private final int duration;
    private final double explode_delay;
    private final int fade_time;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] stun_duration;
    private final int stun_radius;

    private TechiesStasisTrap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_NORMAL_WHEN_STOLEN","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = 1;
        abilityCastRange = 150;
        abilityCooldown = new double[]{20.0,16.0,13.0,10.0};
        abilityManaCost = new int[]{80,110,140,160};
        iD = 5600;
        key = "techies_stasis_trap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        activation_radius = 450;
        activation_time = 1.5;
        duration = 36;
        explode_delay = 1.5;
        fade_time = 2;
        localizedName = "Stasis Trap";
        owningHeroShortKey = "techies";
        stun_duration = new double[]{2.5,3.0,3.5,4.0};
        stun_radius = 450;
    }

    public static TechiesStasisTrap instance() {
        if( instance == null ){
            instance = new TechiesStasisTrap();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getActivationRadius() {
        return activation_radius;
    }

    public double getActivationTime() {
        return activation_time;
    }

    public int getDuration() {
        return duration;
    }

    public double getExplodeDelay() {
        return explode_delay;
    }

    public int getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public int getStunRadius() {
        return stun_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesStasisTrap))
            return false;
        if (object == this)
            return true;
        TechiesStasisTrap otherObject = (TechiesStasisTrap) object;
        return otherObject.getKey().equals(getKey());
    }

}
