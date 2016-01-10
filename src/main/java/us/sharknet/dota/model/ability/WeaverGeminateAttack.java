package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WeaverGeminateAttack extends Ability {

    private static WeaverGeminateAttack instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WeaverGeminateAttack() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{6.0,5.0,4.0,3.0};
        iD = 5291;
        key = "weaver_geminate_attack";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        delay = .25;
        localizedName = "Geminate Attack";
        ownerKey = "npc_dota_hero_weaver";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static WeaverGeminateAttack instance() {
        if( instance == null ){
            instance = new WeaverGeminateAttack();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
