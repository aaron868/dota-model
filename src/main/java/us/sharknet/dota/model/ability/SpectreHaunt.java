package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpectreHaunt extends Ability {

    private static SpectreHaunt instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] attack_delay;
    private final double[] duration;
    private final int[] illusion_damage_incoming;
    private final int illusion_damage_outgoing;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] tooltip_illusion_total_damage_incoming;
    private final int tooltip_outgoing;

    private SpectreHaunt() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = new double[]{120.0,120.0,120.0};
        abilityManaCost = new int[]{150,150,150};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5337;
        key = "spectre_haunt";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_delay = new double[]{1.0,1.0,1.0};
        duration = new double[]{5.0,6.0,7.0};
        illusion_damage_incoming = new int[]{100,100,100};
        illusion_damage_outgoing = -70;
        localizedName = "Haunt";
        owningHeroShortKey = "spectre";
        tooltip_illusion_total_damage_incoming = new int[]{200,200,200};
        tooltip_outgoing = 30;
    }

    public static SpectreHaunt instance() {
        if( instance == null ){
            instance = new SpectreHaunt();
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

    public double[] getAttackDelay() {
        return attack_delay;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getIllusionDamageIncoming() {
        return illusion_damage_incoming;
    }

    public int getIllusionDamageOutgoing() {
        return illusion_damage_outgoing;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getTooltipIllusionTotalDamageIncoming() {
        return tooltip_illusion_total_damage_incoming;
    }

    public int getTooltipOutgoing() {
        return tooltip_outgoing;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SpectreHaunt))
            return false;
        if (object == this)
            return true;
        SpectreHaunt otherObject = (SpectreHaunt) object;
        return otherObject.getKey().equals(getKey());
    }

}
