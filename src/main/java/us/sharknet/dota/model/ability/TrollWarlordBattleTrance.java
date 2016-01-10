package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordBattleTrance extends Ability {

    private static TrollWarlordBattleTrance instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] attack_speed;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int trance_duration;

    private TrollWarlordBattleTrance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0};
        abilityCooldown = new double[]{30,30,30,30};
        abilityManaCost = new int[]{75,75,75};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5512;
        key = "troll_warlord_battle_trance";
        attack_speed = new int[]{60,120,180};
        localizedName = "Battle Trance";
        ownerKey = "npc_dota_hero_troll_warlord";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getAttackSpeed() {
        return attack_speed;
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
