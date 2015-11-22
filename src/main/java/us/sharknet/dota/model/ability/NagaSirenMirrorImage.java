package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NagaSirenMirrorImage extends Ability {

    private static NagaSirenMirrorImage instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final double[] illusion_duration;
    private final int[] images_count;
    private final int[] incoming_damage;
    private final double invuln_duration;
    private final String localizedName;
    private final int[] outgoing_damage;
    private final int[] outgoing_damage_tooltip;
    private final String owningHeroShortKey;
    private final int[] tooltip_incoming_damage_total_pct;

    private NagaSirenMirrorImage() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .65;
        abilityCooldown = new double[]{40.0,40.0,40.0,40.0};
        abilityManaCost = new int[]{70,80,90,100};
        iD = 5467;
        key = "naga_siren_mirror_image";
        illusion_duration = new double[]{30.0,30.0,30.0,30.0};
        images_count = new int[]{3,3,3,3};
        incoming_damage = new int[]{500,400,300,200};
        invuln_duration = .3;
        localizedName = "Mirror Image";
        outgoing_damage = new int[]{-80,-75,-70,-65};
        outgoing_damage_tooltip = new int[]{20,25,30,35};
        owningHeroShortKey = "naga_siren";
        tooltip_incoming_damage_total_pct = new int[]{600,500,400,300};
    }

    public static NagaSirenMirrorImage instance() {
        if( instance == null ){
            instance = new NagaSirenMirrorImage();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
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

    public double[] getIllusionDuration() {
        return illusion_duration;
    }

    public int[] getImagesCount() {
        return images_count;
    }

    public int[] getIncomingDamage() {
        return incoming_damage;
    }

    public double getInvulnDuration() {
        return invuln_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getOutgoingDamage() {
        return outgoing_damage;
    }

    public int[] getOutgoingDamageTooltip() {
        return outgoing_damage_tooltip;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getTooltipIncomingDamageTotalPct() {
        return tooltip_incoming_damage_total_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NagaSirenMirrorImage))
            return false;
        if (object == this)
            return true;
        NagaSirenMirrorImage otherObject = (NagaSirenMirrorImage) object;
        return otherObject.getKey().equals(getKey());
    }

}
