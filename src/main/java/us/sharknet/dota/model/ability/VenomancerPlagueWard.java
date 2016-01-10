package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VenomancerPlagueWard extends Ability {

    private static VenomancerPlagueWard instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] ward_damage_tooltip;
    private final int[] ward_hp_tooltip;

    private VenomancerPlagueWard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{850,850,850,850};
        abilityCooldown = new double[]{5,5,5,5};
        abilityManaCost = new int[]{20,20,20,20};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5180;
        key = "venomancer_plague_ward";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = 4;
        localizedName = "Plague Ward";
        ownerKey = "npc_dota_hero_venomancer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        ward_damage_tooltip = new int[]{10,19,29,38};
        ward_hp_tooltip = new int[]{75,200,325,450};
    }

    public static VenomancerPlagueWard instance() {
        if( instance == null ){
            instance = new VenomancerPlagueWard();
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

    public int[] getWardDamageTooltip() {
        return ward_damage_tooltip;
    }

    public int[] getWardHpTooltip() {
        return ward_hp_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VenomancerPlagueWard))
            return false;
        if (object == this)
            return true;
        VenomancerPlagueWard otherObject = (VenomancerPlagueWard) object;
        return otherObject.getKey().equals(getKey());
    }

}
