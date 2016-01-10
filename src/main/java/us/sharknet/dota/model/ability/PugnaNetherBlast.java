package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PugnaNetherBlast extends Ability {

    private static PugnaNetherBlast instance;

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
    private final double[] delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final double structure_damage_mod;

    private PugnaNetherBlast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{400,400,400,400};
        abilityCooldown = new double[]{5.5,5.5,5.5,5.5};
        abilityDamage = new int[]{100,175,250,325};
        abilityManaCost = new int[]{85,105,125,145};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5186;
        key = "pugna_nether_blast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        delay = new double[]{0.9,0.9,0.9,0.9};
        localizedName = "Nether Blast";
        ownerKey = "npc_dota_hero_pugna";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{400,400,400,400};
        structure_damage_mod = .5;
    }

    public static PugnaNetherBlast instance() {
        if( instance == null ){
            instance = new PugnaNetherBlast();
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

    public double[] getDelay() {
        return delay;
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

    public int[] getRadius() {
        return radius;
    }

    public double getStructureDamageMod() {
        return structure_damage_mod;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PugnaNetherBlast))
            return false;
        if (object == this)
            return true;
        PugnaNetherBlast otherObject = (PugnaNetherBlast) object;
        return otherObject.getKey().equals(getKey());
    }

}
