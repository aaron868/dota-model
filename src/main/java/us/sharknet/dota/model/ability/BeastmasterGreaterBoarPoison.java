package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterGreaterBoarPoison extends Ability {

    private static BeastmasterGreaterBoarPoison instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int attack_speed;
    private final int duration;
    private final String localizedName;
    private final int movement_speed;
    private final String owningHeroShortKey;

    private BeastmasterGreaterBoarPoison() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5352;
        key = "beastmaster_greater_boar_poison";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_speed = -35;
        duration = 3;
        localizedName = "Poison";
        movement_speed = -35;
        owningHeroShortKey = "beastmaster";
    }

    public static BeastmasterGreaterBoarPoison instance() {
        if( instance == null ){
            instance = new BeastmasterGreaterBoarPoison();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getAttackSpeed() {
        return attack_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSpeed() {
        return movement_speed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterGreaterBoarPoison))
            return false;
        if (object == this)
            return true;
        BeastmasterGreaterBoarPoison otherObject = (BeastmasterGreaterBoarPoison) object;
        return otherObject.getKey().equals(getKey());
    }

}
