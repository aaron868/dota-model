package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PuckDreamCoil extends Ability {

    private static PuckDreamCoil instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] coil_break_damage;
    private final int[] coil_break_damage_scepter;
    private final int[] coil_break_radius;
    private final double[] coil_duration;
    private final int coil_duration_scepter;
    private final int[] coil_init_damage_tooltip;
    private final int[] coil_radius;
    private final double[] coil_stun_duration;
    private final double[] coil_stun_duration_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double stun_duration;

    private PuckDreamCoil() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.1,0.1,0.1};
        abilityCastRange = 750;
        abilityCooldown = 75;
        abilityManaCost = new int[]{100,150,200};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5073;
        key = "puck_dream_coil";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        coil_break_damage = new int[]{100,150,200};
        coil_break_damage_scepter = new int[]{200,250,300};
        coil_break_radius = new int[]{600,600,600};
        coil_duration = new double[]{6.0,6.0,6.0};
        coil_duration_scepter = 8;
        coil_init_damage_tooltip = new int[]{100,150,200};
        coil_radius = new int[]{375,375,375};
        coil_stun_duration = new double[]{1.5,2.25,3.0};
        coil_stun_duration_scepter = new double[]{1.5,3.0,4.5};
        localizedName = "Dream Coil";
        owningHeroShortKey = "puck";
        stun_duration = .5;
    }

    public static PuckDreamCoil instance() {
        if( instance == null ){
            instance = new PuckDreamCoil();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getCoilBreakDamage() {
        return coil_break_damage;
    }

    public int[] getCoilBreakDamageScepter() {
        return coil_break_damage_scepter;
    }

    public int[] getCoilBreakRadius() {
        return coil_break_radius;
    }

    public double[] getCoilDuration() {
        return coil_duration;
    }

    public int getCoilDurationScepter() {
        return coil_duration_scepter;
    }

    public int[] getCoilInitDamageTooltip() {
        return coil_init_damage_tooltip;
    }

    public int[] getCoilRadius() {
        return coil_radius;
    }

    public double[] getCoilStunDuration() {
        return coil_stun_duration;
    }

    public double[] getCoilStunDurationScepter() {
        return coil_stun_duration_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PuckDreamCoil))
            return false;
        if (object == this)
            return true;
        PuckDreamCoil otherObject = (PuckDreamCoil) object;
        return otherObject.getKey().equals(getKey());
    }

}
