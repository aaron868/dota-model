package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LegionCommanderOverwhelmingOdds extends Ability {

    private static LegionCommanderOverwhelmingOdds instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_speed_creeps;
    private final int bonus_speed_heroes;
    private final int[] damage;
    private final int[] damage_per_hero;
    private final int[] damage_per_unit;
    private final int duration;
    private final int illusion_dmg_pct;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private LegionCommanderOverwhelmingOdds() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 1000;
        abilityCooldown = 15;
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5595;
        key = "legion_commander_overwhelming_odds";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_speed_creeps = 3;
        bonus_speed_heroes = 9;
        damage = new int[]{40,80,120,160};
        damage_per_hero = new int[]{20,35,50,65};
        damage_per_unit = new int[]{14,16,18,20};
        duration = 7;
        illusion_dmg_pct = 25;
        localizedName = "Overwhelming Odds";
        owningHeroShortKey = "legion_commander";
        radius = 330;
    }

    public static LegionCommanderOverwhelmingOdds instance() {
        if( instance == null ){
            instance = new LegionCommanderOverwhelmingOdds();
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

    public int getAbilityCooldown() {
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

    public int getBonusSpeedCreeps() {
        return bonus_speed_creeps;
    }

    public int getBonusSpeedHeroes() {
        return bonus_speed_heroes;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamagePerHero() {
        return damage_per_hero;
    }

    public int[] getDamagePerUnit() {
        return damage_per_unit;
    }

    public int getDuration() {
        return duration;
    }

    public int getIllusionDmgPct() {
        return illusion_dmg_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LegionCommanderOverwhelmingOdds))
            return false;
        if (object == this)
            return true;
        LegionCommanderOverwhelmingOdds otherObject = (LegionCommanderOverwhelmingOdds) object;
        return otherObject.getKey().equals(getKey());
    }

}
