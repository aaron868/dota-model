package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AncientApparitionChillingTouch extends Ability {

    private static AncientApparitionChillingTouch instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int attack_speed_pct;
    private final int[] bonus_damage;
    private final String localizedName;
    private final int[] max_attacks;
    private final String owningHeroShortKey;
    private final int radius;

    private AncientApparitionChillingTouch() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.01,0.01,0.01,0.01};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{50.0,42.0,34.0,26.0};
        abilityDuration = 3;
        abilityManaCost = new int[]{110,120,130,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5347;
        key = "ancient_apparition_chilling_touch";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_speed_pct = 2;
        bonus_damage = new int[]{50,60,70,80};
        localizedName = "Chilling Touch";
        max_attacks = new int[]{3,4,5,6};
        owningHeroShortKey = "ancient_apparition";
        radius = 525;
    }

    public static AncientApparitionChillingTouch instance() {
        if( instance == null ){
            instance = new AncientApparitionChillingTouch();
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

    public int getAbilityDuration() {
        return abilityDuration;
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

    public int getAttackSpeedPct() {
        return attack_speed_pct;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxAttacks() {
        return max_attacks;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientApparitionChillingTouch))
            return false;
        if (object == this)
            return true;
        AncientApparitionChillingTouch otherObject = (AncientApparitionChillingTouch) object;
        return otherObject.getKey().equals(getKey());
    }

}
