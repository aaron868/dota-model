package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaTidebringer extends Ability {

    private static KunkkaTidebringer instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cleave_damage;
    private final int[] damage_bonus;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private KunkkaTidebringer() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = new double[]{13.0,10.0,7.0,4.0};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5032;
        key = "kunkka_tidebringer";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cleave_damage = 100;
        damage_bonus = new int[]{20,35,50,65};
        localizedName = "Tidebringer";
        owningHeroShortKey = "kunkka";
        radius = new int[]{500,500,500,600};
    }

    public static KunkkaTidebringer instance() {
        if( instance == null ){
            instance = new KunkkaTidebringer();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int getCleaveDamage() {
        return cleave_damage;
    }

    public int[] getDamageBonus() {
        return damage_bonus;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KunkkaTidebringer))
            return false;
        if (object == this)
            return true;
        KunkkaTidebringer otherObject = (KunkkaTidebringer) object;
        return otherObject.getKey().equals(getKey());
    }

}
