package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UndyingSoulRip extends Ability {

    private static UndyingSoulRip instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_per_unit;
    private final String localizedName;
    private final int[] max_units;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] tombstone_heal;

    private UndyingSoulRip() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.45,0.45,0.45,0.45};
        abilityCastRange = 75;
        abilityCooldown = new double[]{24.0,18.0,12.0,6.0};
        abilityManaCost = new int[]{100,110,120,130};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        fightRecapLevel = 1;
        iD = 5443;
        key = "undying_soul_rip";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_per_unit = new int[]{18,22,26,30};
        localizedName = "Soul Rip";
        max_units = new int[]{10,12,14,16};
        owningHeroShortKey = "undying";
        radius = 13;
        tombstone_heal = new int[]{2,4,6,8};
    }

    public static UndyingSoulRip instance() {
        if( instance == null ){
            instance = new UndyingSoulRip();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int[] getDamagePerUnit() {
        return damage_per_unit;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxUnits() {
        return max_units;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getTombstoneHeal() {
        return tombstone_heal;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UndyingSoulRip))
            return false;
        if (object == this)
            return true;
        UndyingSoulRip otherObject = (UndyingSoulRip) object;
        return otherObject.getKey().equals(getKey());
    }

}
