package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ViperNethertoxin extends Ability {

    private static ViperNethertoxin instance;

    private final String abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] bonus_damage;
    private final String localizedName;
    private final int[] max_damage_tooltip;
    private final int[] non_hero_damage_pct;
    private final String owningHeroShortKey;

    private ViperNethertoxin() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5219;
        key = "viper_nethertoxin";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new double[]{2.5,5.0,7.5,10.0};
        localizedName = "Nethertoxin";
        max_damage_tooltip = new int[]{40,80,120,160};
        non_hero_damage_pct = new int[]{50,50,50,50};
        owningHeroShortKey = "viper";
    }

    public static ViperNethertoxin instance() {
        if( instance == null ){
            instance = new ViperNethertoxin();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public double[] getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxDamageTooltip() {
        return max_damage_tooltip;
    }

    public int[] getNonHeroDamagePct() {
        return non_hero_damage_pct;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ViperNethertoxin))
            return false;
        if (object == this)
            return true;
        ViperNethertoxin otherObject = (ViperNethertoxin) object;
        return otherObject.getKey().equals(getKey());
    }

}
