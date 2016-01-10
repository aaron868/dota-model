package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaReturn extends Ability {

    private static KunkkaReturn instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private KunkkaReturn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCooldown = new double[]{1,1,1,1};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5034;
        key = "kunkka_return";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Return";
        ownerKey = "npc_dota_hero_kunkka";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static KunkkaReturn instance() {
        if( instance == null ){
            instance = new KunkkaReturn();
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
        if (!(object instanceof KunkkaReturn))
            return false;
        if (object == this)
            return true;
        KunkkaReturn otherObject = (KunkkaReturn) object;
        return otherObject.getKey().equals(getKey());
    }

}
