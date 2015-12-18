package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WeaverTheSwarm extends Ability {

    private static WeaverTheSwarm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_reduction;
    private final double[] attack_rate;
    private final int[] count;
    private final int damage;
    private final int[] destroy_attacks;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] spawn_radius;
    private final int[] speed;

    private WeaverTheSwarm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 3000;
        abilityCooldown = new int[]{35,30,25,20};
        abilityManaCost = new int[]{70,80,90,100};
        abilityModifierSupportValue = .2;
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5289;
        key = "weaver_the_swarm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction = new int[]{1,1,1,1};
        attack_rate = new double[]{1.25,1.1,0.95,0.8};
        count = new int[]{12,12,12,12};
        damage = 20;
        destroy_attacks = new int[]{8,8,8,8};
        duration = 16;
        localizedName = "The Swarm";
        owningHeroShortKey = "weaver";
        radius = new int[]{100,100,100,100};
        spawn_radius = new int[]{300,300,300,300};
        speed = new int[]{600,600,600,600};
    }

    public static WeaverTheSwarm instance() {
        if( instance == null ){
            instance = new WeaverTheSwarm();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getArmorReduction() {
        return armor_reduction;
    }

    public double[] getAttackRate() {
        return attack_rate;
    }

    public int[] getCount() {
        return count;
    }

    public int getDamage() {
        return damage;
    }

    public int[] getDestroyAttacks() {
        return destroy_attacks;
    }

    public int getDuration() {
        return duration;
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

    public int[] getSpawnRadius() {
        return spawn_radius;
    }

    public int[] getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WeaverTheSwarm))
            return false;
        if (object == this)
            return true;
        WeaverTheSwarm otherObject = (WeaverTheSwarm) object;
        return otherObject.getKey().equals(getKey());
    }

}
