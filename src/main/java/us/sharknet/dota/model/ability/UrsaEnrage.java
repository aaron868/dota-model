package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UrsaEnrage extends Ability {

    private static UrsaEnrage instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_scepter;
    private final int damage_reduction;
    private final int duration;
    private final double[] enrage_multiplier;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private UrsaEnrage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{50,40,30};
        abilityManaCost = new int[]{0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5360;
        key = "ursa_enrage";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = new double[]{30.0,24.0,18.0};
        damage_reduction = 80;
        duration = 4;
        enrage_multiplier = new double[]{1.5,1.75,2.0};
        localizedName = "Enrage";
        ownerKey = "npc_dota_hero_ursa";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static UrsaEnrage instance() {
        if( instance == null ){
            instance = new UrsaEnrage();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int getDamageReduction() {
        return damage_reduction;
    }

    public int getDuration() {
        return duration;
    }

    public double[] getEnrageMultiplier() {
        return enrage_multiplier;
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
        if (!(object instanceof UrsaEnrage))
            return false;
        if (object == this)
            return true;
        UrsaEnrage otherObject = (UrsaEnrage) object;
        return otherObject.getKey().equals(getKey());
    }

}
