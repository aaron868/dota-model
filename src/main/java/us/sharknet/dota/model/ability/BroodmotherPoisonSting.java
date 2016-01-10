package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherPoisonSting extends Ability {

    private static BroodmotherPoisonSting instance;

    private final String[] abilityBehavior;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage_per_second;
    private final int duration;
    private final int duration_hero;
    private final String localizedName;
    private final int movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BroodmotherPoisonSting() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityModifierSupportBonus = 15;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5284;
        key = "broodmother_poison_sting";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage_per_second = 8;
        duration = 6;
        duration_hero = 2;
        localizedName = "Poison Sting";
        movement_speed = -8;
        ownerKey = "npc_dota_broodmother_spiderling";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static BroodmotherPoisonSting instance() {
        if( instance == null ){
            instance = new BroodmotherPoisonSting();
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

    public int getDamagePerSecond() {
        return damage_per_second;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationHero() {
        return duration_hero;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSpeed() {
        return movement_speed;
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
        if (!(object instanceof BroodmotherPoisonSting))
            return false;
        if (object == this)
            return true;
        BroodmotherPoisonSting otherObject = (BroodmotherPoisonSting) object;
        return otherObject.getKey().equals(getKey());
    }

}
