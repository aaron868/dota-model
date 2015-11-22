package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderTimberChain extends Ability {

    private static ShredderTimberChain instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] chain_radius;
    private final int[] damage;
    private final int[] damage_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] range;
    private final int[] speed;

    private ShredderTimberChain() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{800,1000,1200,1400};
        abilityCooldown = new double[]{4.0,4.0,4.0,4.0};
        abilityManaCost = new int[]{60,70,80,90};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        fightRecapLevel = 1;
        iD = 5525;
        key = "shredder_timber_chain";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        chain_radius = new int[]{90,90,90,90};
        damage = new int[]{100,140,180,220};
        damage_radius = new int[]{225,225,225,225};
        localizedName = "Timber Chain";
        owningHeroShortKey = "shredder";
        range = new int[]{850,1050,1250,1450};
        speed = new int[]{1600,2000,2400,2800};
    }

    public static ShredderTimberChain instance() {
        if( instance == null ){
            instance = new ShredderTimberChain();
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

    public int[] getChainRadius() {
        return chain_radius;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageRadius() {
        return damage_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRange() {
        return range;
    }

    public int[] getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShredderTimberChain))
            return false;
        if (object == this)
            return true;
        ShredderTimberChain otherObject = (ShredderTimberChain) object;
        return otherObject.getKey().equals(getKey());
    }

}
