package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class QueenofpainScreamOfPain extends Ability {

    private static QueenofpainScreamOfPain instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;

    private QueenofpainScreamOfPain() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{7.0,7.0,7.0,7.0};
        abilityDamage = new int[]{75,150,225,300};
        abilityManaCost = new int[]{110,120,130,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5175;
        key = "queenofpain_scream_of_pain";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 475;
        localizedName = "Scream Of Pain";
        ownerKey = "npc_dota_hero_queenofpain";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 900;
    }

    public static QueenofpainScreamOfPain instance() {
        if( instance == null ){
            instance = new QueenofpainScreamOfPain();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getAreaOfEffect() {
        return area_of_effect;
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

    public int getProjectileSpeed() {
        return projectile_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof QueenofpainScreamOfPain))
            return false;
        if (object == this)
            return true;
        QueenofpainScreamOfPain otherObject = (QueenofpainScreamOfPain) object;
        return otherObject.getKey().equals(getKey());
    }

}
