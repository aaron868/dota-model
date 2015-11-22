package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TerrorbladeConjureImage extends Ability {

    private static TerrorbladeConjureImage instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int illusion_duration;
    private final int illusion_incoming_damage;
    private final int illusion_incoming_damage_total_tooltip;
    private final double[] illusion_outgoing_damage;
    private final double[] illusion_outgoing_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TerrorbladeConjureImage() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .15;
        abilityCooldown = 16;
        abilityManaCost = 8;
        iD = 562;
        key = "terrorblade_conjure_image";
        illusion_duration = 32;
        illusion_incoming_damage = 325;
        illusion_incoming_damage_total_tooltip = 425;
        illusion_outgoing_damage = new double[]{70.0,60.0,50.0,40.0};
        illusion_outgoing_tooltip = new double[]{30.0,40.0,50.0,60.0};
        localizedName = "Conjure Image";
        owningHeroShortKey = "terrorblade";
    }

    public static TerrorbladeConjureImage instance() {
        if( instance == null ){
            instance = new TerrorbladeConjureImage();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getIllusionDuration() {
        return illusion_duration;
    }

    public int getIllusionIncomingDamage() {
        return illusion_incoming_damage;
    }

    public int getIllusionIncomingDamageTotalTooltip() {
        return illusion_incoming_damage_total_tooltip;
    }

    public double[] getIllusionOutgoingDamage() {
        return illusion_outgoing_damage;
    }

    public double[] getIllusionOutgoingTooltip() {
        return illusion_outgoing_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TerrorbladeConjureImage))
            return false;
        if (object == this)
            return true;
        TerrorbladeConjureImage otherObject = (TerrorbladeConjureImage) object;
        return otherObject.getKey().equals(getKey());
    }

}
