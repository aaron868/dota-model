package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChaosKnightPhantasm extends Ability {

    private static ChaosKnightPhantasm instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int extra_phantasm_chance_pct_tooltip;
    private final int illusion_duration;
    private final int[] images_count;
    private final int incoming_damage;
    private final int incoming_damage_tooltip;
    private final double invuln_duration;
    private final String localizedName;
    private final int[] outgoing_damage;
    private final int[] outgoing_damage_tooltip;
    private final String owningHeroShortKey;
    private final int vision_radius;

    private ChaosKnightPhantasm() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.4,0.4,0.4};
        abilityCooldown = new double[]{140.0,140.0,140.0};
        abilityManaCost = new int[]{125,200,275};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5429;
        key = "chaos_knight_phantasm";
        extra_phantasm_chance_pct_tooltip = 50;
        illusion_duration = 42;
        images_count = new int[]{1,2,3};
        incoming_damage = 100;
        incoming_damage_tooltip = 200;
        invuln_duration = .5;
        localizedName = "Phantasm";
        outgoing_damage = new int[]{0,0,0};
        outgoing_damage_tooltip = new int[]{100,100,100};
        owningHeroShortKey = "chaos_knight";
        vision_radius = 400;
    }

    public static ChaosKnightPhantasm instance() {
        if( instance == null ){
            instance = new ChaosKnightPhantasm();
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

    public int getExtraPhantasmChancePctTooltip() {
        return extra_phantasm_chance_pct_tooltip;
    }

    public int getIllusionDuration() {
        return illusion_duration;
    }

    public int[] getImagesCount() {
        return images_count;
    }

    public int getIncomingDamage() {
        return incoming_damage;
    }

    public int getIncomingDamageTooltip() {
        return incoming_damage_tooltip;
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

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChaosKnightPhantasm))
            return false;
        if (object == this)
            return true;
        ChaosKnightPhantasm otherObject = (ChaosKnightPhantasm) object;
        return otherObject.getKey().equals(getKey());
    }

}
