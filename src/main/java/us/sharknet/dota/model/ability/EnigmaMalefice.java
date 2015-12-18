package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnigmaMalefice extends Ability {

    private static EnigmaMalefice instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] stun_duration;
    private final double[] tick_rate;
    private final double[] tooltip_stuns;

    private EnigmaMalefice() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 600;
        abilityCooldown = new double[]{15.0,15.0,15.0,15.0};
        abilityManaCost = new int[]{110,130,150,160};
        abilityModifierSupportValue = .33;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5146;
        key = "enigma_malefice";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{30,50,70,90};
        duration = new double[]{4.0,4.0,4.0,4.0};
        localizedName = "Malefice";
        owningHeroShortKey = "enigma";
        stun_duration = new double[]{0.25,0.5,0.75,1.0};
        tick_rate = new double[]{2.0,2.0,2.0,2.0};
        tooltip_stuns = new double[]{3.0,3.0,3.0,3.0};
    }

    public static EnigmaMalefice instance() {
        if( instance == null ){
            instance = new EnigmaMalefice();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
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

    public double[] getTickRate() {
        return tick_rate;
    }

    public double[] getTooltipStuns() {
        return tooltip_stuns;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnigmaMalefice))
            return false;
        if (object == this)
            return true;
        EnigmaMalefice otherObject = (EnigmaMalefice) object;
        return otherObject.getKey().equals(getKey());
    }

}
