package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ElderTitanAncestralSpirit extends Ability {

    private static ElderTitanAncestralSpirit instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int buff_duration;
    private final int[] damage_creeps;
    private final int[] damage_heroes;
    private final String localizedName;
    private final int move_pct_cap;
    private final int move_pct_creeps;
    private final int move_pct_heroes;
    private final String owningHeroShortKey;
    private final int[] pass_damage;
    private final int radius;
    private final int speed;
    private final int spirit_duration;

    private ElderTitanAncestralSpirit() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 1200;
        abilityCooldown = 16;
        abilityManaCost = new int[]{80,90,100,110};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5591;
        key = "elder_titan_ancestral_spirit";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        buff_duration = 9;
        damage_creeps = new int[]{6,9,12,15};
        damage_heroes = new int[]{10,20,30,40};
        localizedName = "Ancestral Spirit";
        move_pct_cap = 30;
        move_pct_creeps = 1;
        move_pct_heroes = 5;
        owningHeroShortKey = "elder_titan";
        pass_damage = new int[]{60,90,120,150};
        radius = 275;
        speed = 600;
        spirit_duration = 8;
    }

    public static ElderTitanAncestralSpirit instance() {
        if( instance == null ){
            instance = new ElderTitanAncestralSpirit();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getBuffDuration() {
        return buff_duration;
    }

    public int[] getDamageCreeps() {
        return damage_creeps;
    }

    public int[] getDamageHeroes() {
        return damage_heroes;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovePctCap() {
        return move_pct_cap;
    }

    public int getMovePctCreeps() {
        return move_pct_creeps;
    }

    public int getMovePctHeroes() {
        return move_pct_heroes;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPassDamage() {
        return pass_damage;
    }

    public int getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpiritDuration() {
        return spirit_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ElderTitanAncestralSpirit))
            return false;
        if (object == this)
            return true;
        ElderTitanAncestralSpirit otherObject = (ElderTitanAncestralSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
