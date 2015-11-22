package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordBattleTrance extends Ability {

    private static TrollWarlordBattleTrance instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int[] attack_speed;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int trance_duration;

    private TrollWarlordBattleTrance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0};
        abilityCooldown = 3;
        abilityManaCost = new int[]{75,75,75};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5512;
        key = "troll_warlord_battle_trance";
        maxLevel = 3;
        attack_speed = new int[]{60,120,180};
        localizedName = "Battle Trance";
        owningHeroShortKey = "troll_warlord";
        trance_duration = 5;
    }

    public static TrollWarlordBattleTrance instance() {
        if( instance == null ){
            instance = new TrollWarlordBattleTrance();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public int[] getAttackSpeed() {
        return attack_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getTranceDuration() {
        return trance_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TrollWarlordBattleTrance))
            return false;
        if (object == this)
            return true;
        TrollWarlordBattleTrance otherObject = (TrollWarlordBattleTrance) object;
        return otherObject.getKey().equals(getKey());
    }

}
