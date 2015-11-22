package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightFrostBreath extends Ability {

    private static DragonKnightFrostBreath instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_attack_speed;
    private final int bonus_movement_speed;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DragonKnightFrostBreath() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5232;
        key = "dragon_knight_frost_breath";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_attack_speed = -2;
        bonus_movement_speed = -3;
        duration = 3;
        localizedName = "Frost Breath";
        owningHeroShortKey = "dragon_knight";
    }

    public static DragonKnightFrostBreath instance() {
        if( instance == null ){
            instance = new DragonKnightFrostBreath();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonKnightFrostBreath))
            return false;
        if (object == this)
            return true;
        DragonKnightFrostBreath otherObject = (DragonKnightFrostBreath) object;
        return otherObject.getKey().equals(getKey());
    }

}
