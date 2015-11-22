package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlchemistAcidSpray extends Ability {

    private static AlchemistAcidSpray instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_reduction;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int tick_rate;

    private AlchemistAcidSpray() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = .2;
        abilityCastRange = 900;
        abilityCooldown = 22;
        abilityManaCost = new int[]{130,140,150,160};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5365;
        key = "alchemist_acid_spray";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction = new int[]{4,5,6,7};
        damage = new int[]{15,20,25,30};
        duration = 16;
        localizedName = "Acid Spray";
        owningHeroShortKey = "alchemist";
        radius = 625;
        tick_rate = 1;
    }

    public static AlchemistAcidSpray instance() {
        if( instance == null ){
            instance = new AlchemistAcidSpray();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getArmorReduction() {
        return armor_reduction;
    }

    public int[] getDamage() {
        return damage;
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

    public int getRadius() {
        return radius;
    }

    public int getTickRate() {
        return tick_rate;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AlchemistAcidSpray))
            return false;
        if (object == this)
            return true;
        AlchemistAcidSpray otherObject = (AlchemistAcidSpray) object;
        return otherObject.getKey().equals(getKey());
    }

}
