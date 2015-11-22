package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderChakram extends Ability {

    private static ShredderChakram instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int break_distance;
    private final double damage_interval;
    private final int[] damage_per_second;
    private final String localizedName;
    private final double[] mana_per_second;
    private final String owningHeroShortKey;
    private final int[] pass_damage;
    private final double pass_slow_duration;
    private final int radius;
    private final int slow;
    private final int speed;

    private ShredderChakram() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{1200,1200,1200};
        abilityCooldown = new double[]{8.0,8.0,8.0};
        abilityManaCost = new int[]{100,150,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        fightRecapLevel = 1;
        iD = 5527;
        key = "shredder_chakram";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        break_distance = 2;
        damage_interval = .5;
        damage_per_second = new int[]{50,75,100};
        localizedName = "Chakram";
        mana_per_second = new double[]{20.0,25.0,30.0};
        owningHeroShortKey = "shredder";
        pass_damage = new int[]{100,140,180};
        pass_slow_duration = .5;
        radius = 2;
        slow = 5;
        speed = 9;
    }

    public static ShredderChakram instance() {
        if( instance == null ){
            instance = new ShredderChakram();
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

    public String getAbilityType() {
        return abilityType;
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

    public int getBreakDistance() {
        return break_distance;
    }

    public double getDamageInterval() {
        return damage_interval;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getManaPerSecond() {
        return mana_per_second;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPassDamage() {
        return pass_damage;
    }

    public double getPassSlowDuration() {
        return pass_slow_duration;
    }

    public int getRadius() {
        return radius;
    }

    public int getSlow() {
        return slow;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShredderChakram))
            return false;
        if (object == this)
            return true;
        ShredderChakram otherObject = (ShredderChakram) object;
        return otherObject.getKey().equals(getKey());
    }

}
