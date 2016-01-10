package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlardarBash extends Ability {

    private static SlardarBash instance;

    private final String[] abilityBehavior;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int[] chance;
    private final int duration;
    private final int duration_creep;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SlardarBash() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityModifierSupportBonus = 25;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5116;
        key = "slardar_bash";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{60,80,100,120};
        chance = new int[]{10,15,20,25};
        duration = 1;
        duration_creep = 2;
        localizedName = "Bash";
        ownerKey = "npc_dota_hero_slardar";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static SlardarBash instance() {
        if( instance == null ){
            instance = new SlardarBash();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getChance() {
        return chance;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationCreep() {
        return duration_creep;
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
        if (!(object instanceof SlardarBash))
            return false;
        if (object == this)
            return true;
        SlardarBash otherObject = (SlardarBash) object;
        return otherObject.getKey().equals(getKey());
    }

}
