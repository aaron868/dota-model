package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AntimageManaVoid extends Ability {

    private static AntimageManaVoid instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int mana_void_aoe_radius;
    private final double[] mana_void_damage_per_mana;
    private final double mana_void_ministun;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private AntimageManaVoid() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{70.0,70.0,70.0};
        abilityManaCost = new int[]{125,200,275};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5006;
        key = "antimage_mana_void";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Mana Void";
        mana_void_aoe_radius = 500;
        mana_void_damage_per_mana = new double[]{0.6,0.85,1.1};
        mana_void_ministun = .15;
        ownerKey = "npc_dota_hero_antimage";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static AntimageManaVoid instance() {
        if( instance == null ){
            instance = new AntimageManaVoid();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaVoidAoeRadius() {
        return mana_void_aoe_radius;
    }

    public double[] getManaVoidDamagePerMana() {
        return mana_void_damage_per_mana;
    }

    public double getManaVoidMinistun() {
        return mana_void_ministun;
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
        if (!(object instanceof AntimageManaVoid))
            return false;
        if (object == this)
            return true;
        AntimageManaVoid otherObject = (AntimageManaVoid) object;
        return otherObject.getKey().equals(getKey());
    }

}
