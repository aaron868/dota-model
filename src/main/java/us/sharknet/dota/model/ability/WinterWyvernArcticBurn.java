package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WinterWyvernArcticBurn extends Ability {

    private static WinterWyvernArcticBurn instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double attack_point;
    private final int[] attack_range_bonus;
    private final int[] bonus_movespeed;
    private final int damage_duration;
    private final int duration;
    private final String localizedName;
    private final int max_attacks;
    private final int night_vision_bonus;
    private final String owningHeroShortKey;
    private final int percent_damage;
    private final int projectile_speed_bonus;
    private final int tick_rate;
    private final int tree_destruction_radius;

    private WinterWyvernArcticBurn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{50.0,40.0,30.0,20.0};
        abilityManaCost = new int[]{120,110,100,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5651;
        key = "winter_wyvern_arctic_burn";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attack_point = .1;
        attack_range_bonus = new int[]{275,375,475,575};
        bonus_movespeed = new int[]{-19,-26,-33,-40};
        damage_duration = 5;
        duration = 6;
        localizedName = "Arctic Burn";
        max_attacks = 5;
        night_vision_bonus = 400;
        owningHeroShortKey = "winter_wyvern";
        percent_damage = 8;
        projectile_speed_bonus = 500;
        tick_rate = 1;
        tree_destruction_radius = 250;
    }

    public static WinterWyvernArcticBurn instance() {
        if( instance == null ){
            instance = new WinterWyvernArcticBurn();
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

    public double getAttackPoint() {
        return attack_point;
    }

    public int[] getAttackRangeBonus() {
        return attack_range_bonus;
    }

    public int[] getBonusMovespeed() {
        return bonus_movespeed;
    }

    public int getDamageDuration() {
        return damage_duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxAttacks() {
        return max_attacks;
    }

    public int getNightVisionBonus() {
        return night_vision_bonus;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPercentDamage() {
        return percent_damage;
    }

    public int getProjectileSpeedBonus() {
        return projectile_speed_bonus;
    }

    public int getTickRate() {
        return tick_rate;
    }

    public int getTreeDestructionRadius() {
        return tree_destruction_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WinterWyvernArcticBurn))
            return false;
        if (object == this)
            return true;
        WinterWyvernArcticBurn otherObject = (WinterWyvernArcticBurn) object;
        return otherObject.getKey().equals(getKey());
    }

}
