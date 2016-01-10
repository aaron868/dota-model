package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskFrozenSigil extends Ability {

    private static TuskFrozenSigil instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_slow;
    private final String localizedName;
    private final int[] move_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int sigil_duration;
    private final int sigil_radius;

    private TuskFrozenSigil() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCooldown = new double[]{50.0,50.0,50.0,50.0};
        abilityManaCost = new int[]{75,75,75,75};
        iD = 5567;
        key = "tusk_frozen_sigil";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attack_slow = new int[]{30,40,50,60};
        localizedName = "Frozen Sigil";
        move_slow = new int[]{10,15,20,25};
        ownerKey = "npc_dota_hero_tusk";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        sigil_duration = 3;
        sigil_radius = 600;
    }

    public static TuskFrozenSigil instance() {
        if( instance == null ){
            instance = new TuskFrozenSigil();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getAttackSlow() {
        return attack_slow;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMoveSlow() {
        return move_slow;
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

    public int getSigilDuration() {
        return sigil_duration;
    }

    public int getSigilRadius() {
        return sigil_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TuskFrozenSigil))
            return false;
        if (object == this)
            return true;
        TuskFrozenSigil otherObject = (TuskFrozenSigil) object;
        return otherObject.getKey().equals(getKey());
    }

}
