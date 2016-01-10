package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritPetrify extends Ability {

    private static EarthSpiritPetrify instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final boolean isGrantedByScepter;
    private final String key;
    private final String spellImmunityType;
    private final int aoe;
    private final int damage;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private EarthSpiritPetrify() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{45,45,45,45};
        abilityManaCost = new int[]{150,150,150,150};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5648;
        isGrantedByScepter = true;
        key = "earth_spirit_petrify";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        aoe = 3;
        damage = 3;
        duration = 3;
        localizedName = "Petrify";
        ownerKey = "npc_dota_hero_earth_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static EarthSpiritPetrify instance() {
        if( instance == null ){
            instance = new EarthSpiritPetrify();
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

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public boolean getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAoe() {
        return aoe;
    }

    public int getDamage() {
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritPetrify))
            return false;
        if (object == this)
            return true;
        EarthSpiritPetrify otherObject = (EarthSpiritPetrify) object;
        return otherObject.getKey().equals(getKey());
    }

}
