package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordBerserkersRage extends Ability {

    private static TrollWarlordBerserkersRage instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final double base_attack_time;
    private final int bash_chance;
    private final int[] bash_damage;
    private final double[] bash_duration;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_hp;
    private final int[] bonus_move_speed;
    private final int bonus_range;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TrollWarlordBerserkersRage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        iD = 558;
        key = "troll_warlord_berserkers_rage";
        base_attack_time = 1.55;
        bash_chance = 1;
        bash_damage = new int[]{20,30,40,50};
        bash_duration = new double[]{0.8,1.2,1.6,2.0};
        bonus_armor = 3;
        bonus_damage = 0;
        bonus_hp = 1;
        bonus_move_speed = new int[]{10,20,30,40};
        bonus_range = 372;
        localizedName = "Berserkers Rage";
        owningHeroShortKey = "troll_warlord";
    }

    public static TrollWarlordBerserkersRage instance() {
        if( instance == null ){
            instance = new TrollWarlordBerserkersRage();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double getBaseAttackTime() {
        return base_attack_time;
    }

    public int getBashChance() {
        return bash_chance;
    }

    public int[] getBashDamage() {
        return bash_damage;
    }

    public double[] getBashDuration() {
        return bash_duration;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHp() {
        return bonus_hp;
    }

    public int[] getBonusMoveSpeed() {
        return bonus_move_speed;
    }

    public int getBonusRange() {
        return bonus_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TrollWarlordBerserkersRage))
            return false;
        if (object == this)
            return true;
        TrollWarlordBerserkersRage otherObject = (TrollWarlordBerserkersRage) object;
        return otherObject.getKey().equals(getKey());
    }

}
