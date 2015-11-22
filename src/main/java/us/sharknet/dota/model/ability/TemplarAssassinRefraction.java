package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TemplarAssassinRefraction extends Ability {

    private static TemplarAssassinRefraction instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int[] damage_threshold;
    private final double[] duration;
    private final int[] instances;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TemplarAssassinRefraction() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{17.0,17.0,17.0,17.0};
        abilityManaCost = 1;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5194;
        key = "templar_assassin_refraction";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{20,40,60,80};
        damage_threshold = new int[]{5,5,5,5};
        duration = new double[]{17.0,17.0,17.0,17.0};
        instances = new int[]{3,4,5,6};
        localizedName = "Refraction";
        owningHeroShortKey = "templar_assassin";
    }

    public static TemplarAssassinRefraction instance() {
        if( instance == null ){
            instance = new TemplarAssassinRefraction();
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

    public int getAbilityManaCost() {
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getDamageThreshold() {
        return damage_threshold;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getInstances() {
        return instances;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TemplarAssassinRefraction))
            return false;
        if (object == this)
            return true;
        TemplarAssassinRefraction otherObject = (TemplarAssassinRefraction) object;
        return otherObject.getKey().equals(getKey());
    }

}
