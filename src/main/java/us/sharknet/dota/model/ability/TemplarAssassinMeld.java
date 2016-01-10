package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TemplarAssassinMeld extends Ability {

    private static TemplarAssassinMeld instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int armor_reduction_duration_tooltip;
    private final int[] bonus_armor;
    private final int[] bonus_damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TemplarAssassinMeld() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{6,6,6,6};
        abilityDuration = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5195;
        key = "templar_assassin_meld";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction_duration_tooltip = 10;
        bonus_armor = new int[]{-2,-4,-6,-8};
        bonus_damage = new int[]{50,100,150,200};
        localizedName = "Meld";
        ownerKey = "npc_dota_hero_templar_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static TemplarAssassinMeld instance() {
        if( instance == null ){
            instance = new TemplarAssassinMeld();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int getArmorReductionDurationTooltip() {
        return armor_reduction_duration_tooltip;
    }

    public int[] getBonusArmor() {
        return bonus_armor;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
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
        if (!(object instanceof TemplarAssassinMeld))
            return false;
        if (object == this)
            return true;
        TemplarAssassinMeld otherObject = (TemplarAssassinMeld) object;
        return otherObject.getKey().equals(getKey());
    }

}
