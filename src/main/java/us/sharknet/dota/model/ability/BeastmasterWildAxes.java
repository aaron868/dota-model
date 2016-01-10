package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterWildAxes extends Ability {

    private static BeastmasterWildAxes instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int[] range;
    private final int[] spread;

    private BeastmasterWildAxes() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{1300,1300,1300,1300};
        abilityCooldown = new double[]{13.0,13.0,13.0,13.0};
        abilityDamage = new int[]{70,100,130,160};
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5168;
        key = "beastmaster_wild_axes";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Wild Axes";
        ownerKey = "npc_dota_hero_beastmaster";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 140;
        range = new int[]{1300,1300,1300,1300};
        spread = new int[]{353,353,353,353};
    }

    public static BeastmasterWildAxes instance() {
        if( instance == null ){
            instance = new BeastmasterWildAxes();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getRange() {
        return range;
    }

    public int[] getSpread() {
        return spread;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterWildAxes))
            return false;
        if (object == this)
            return true;
        BeastmasterWildAxes otherObject = (BeastmasterWildAxes) object;
        return otherObject.getKey().equals(getKey());
    }

}
