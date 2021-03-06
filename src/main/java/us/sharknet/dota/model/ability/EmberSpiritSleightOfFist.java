package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EmberSpiritSleightOfFist extends Ability {

    private static EmberSpiritSleightOfFist instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double attack_interval;
    private final int[] bonus_hero_damage;
    private final int creep_damage_penalty;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private EmberSpiritSleightOfFist() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{30.0,22.0,14.0,6.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5604;
        key = "ember_spirit_sleight_of_fist";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_interval = .2;
        bonus_hero_damage = new int[]{20,40,60,80};
        creep_damage_penalty = -50;
        localizedName = "Sleight Of Fist";
        ownerKey = "npc_dota_hero_ember_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{250,350,450,550};
    }

    public static EmberSpiritSleightOfFist instance() {
        if( instance == null ){
            instance = new EmberSpiritSleightOfFist();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double getAttackInterval() {
        return attack_interval;
    }

    public int[] getBonusHeroDamage() {
        return bonus_hero_damage;
    }

    public int getCreepDamagePenalty() {
        return creep_damage_penalty;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EmberSpiritSleightOfFist))
            return false;
        if (object == this)
            return true;
        EmberSpiritSleightOfFist otherObject = (EmberSpiritSleightOfFist) object;
        return otherObject.getKey().equals(getKey());
    }

}
