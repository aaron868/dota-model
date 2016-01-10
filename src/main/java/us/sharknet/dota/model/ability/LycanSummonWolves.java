package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanSummonWolves extends Ability {

    private static LycanSummonWolves instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] wolf_bat;
    private final int[] wolf_damage;
    private final double[] wolf_duration;
    private final int[] wolf_hp;
    private final int[] wolf_index;

    private LycanSummonWolves() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{30.0,30.0,30.0,30.0};
        abilityManaCost = new int[]{145,145,145,145};
        iD = 5395;
        key = "lycan_summon_wolves";
        localizedName = "Summon Wolves";
        ownerKey = "npc_dota_hero_lycan";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        wolf_bat = new double[]{1.25,1.2,1.15,1.1};
        wolf_damage = new int[]{18,29,37,46};
        wolf_duration = new double[]{55.0,55.0,55.0,55.0};
        wolf_hp = new int[]{200,240,280,320};
        wolf_index = new int[]{1,2,3,4};
    }

    public static LycanSummonWolves instance() {
        if( instance == null ){
            instance = new LycanSummonWolves();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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

    public double[] getWolfBat() {
        return wolf_bat;
    }

    public int[] getWolfDamage() {
        return wolf_damage;
    }

    public double[] getWolfDuration() {
        return wolf_duration;
    }

    public int[] getWolfHp() {
        return wolf_hp;
    }

    public int[] getWolfIndex() {
        return wolf_index;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LycanSummonWolves))
            return false;
        if (object == this)
            return true;
        LycanSummonWolves otherObject = (LycanSummonWolves) object;
        return otherObject.getKey().equals(getKey());
    }

}
