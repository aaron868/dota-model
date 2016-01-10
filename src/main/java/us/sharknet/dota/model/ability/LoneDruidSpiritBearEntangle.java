package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSpiritBearEntangle extends Ability {

    private static LoneDruidSpiritBearEntangle instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int creep_duration;
    private final int entangle_chance;
    private final int hero_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LoneDruidSpiritBearEntangle() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{5,5,5,5};
        abilityDamage = new int[]{60,60,60,60};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5419;
        key = "lone_druid_spirit_bear_entangle";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        creep_duration = 9;
        entangle_chance = 20;
        hero_duration = 3;
        localizedName = "Spirit Bear Entangle";
        ownerKey = "npc_dota_lone_druid_bear";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static LoneDruidSpiritBearEntangle instance() {
        if( instance == null ){
            instance = new LoneDruidSpiritBearEntangle();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getCreepDuration() {
        return creep_duration;
    }

    public int getEntangleChance() {
        return entangle_chance;
    }

    public int getHeroDuration() {
        return hero_duration;
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
        if (!(object instanceof LoneDruidSpiritBearEntangle))
            return false;
        if (object == this)
            return true;
        LoneDruidSpiritBearEntangle otherObject = (LoneDruidSpiritBearEntangle) object;
        return otherObject.getKey().equals(getKey());
    }

}
