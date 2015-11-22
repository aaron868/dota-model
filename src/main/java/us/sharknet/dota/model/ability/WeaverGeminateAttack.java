package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WeaverGeminateAttack extends Ability {

    private static WeaverGeminateAttack instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double delay;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WeaverGeminateAttack() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = new double[]{6.0,5.0,4.0,3.0};
        iD = 5291;
        key = "weaver_geminate_attack";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        delay = .25;
        localizedName = "Geminate Attack";
        owningHeroShortKey = "weaver";
    }

    public static WeaverGeminateAttack instance() {
        if( instance == null ){
            instance = new WeaverGeminateAttack();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public double getDelay() {
        return delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WeaverGeminateAttack))
            return false;
        if (object == this)
            return true;
        WeaverGeminateAttack otherObject = (WeaverGeminateAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
