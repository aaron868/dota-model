package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlchemistAcidSpray extends Ability {

    private static AlchemistAcidSpray instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_reduction;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int tick_rate;

    private AlchemistAcidSpray() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{22,22,22,22};
        abilityManaCost = new int[]{130,140,150,160};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5365;
        key = "alchemist_acid_spray";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction = new int[]{4,5,6,7};
        damage = new int[]{15,20,25,30};
        duration = 16;
        localizedName = "Acid Spray";
        ownerKey = "npc_dota_hero_alchemist";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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
