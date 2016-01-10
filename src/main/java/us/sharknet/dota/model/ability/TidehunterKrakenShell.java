package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TidehunterKrakenShell extends Ability {

    private static TidehunterKrakenShell instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] damage_cleanse;
    private final int[] damage_reduction;
    private final double[] damage_reset_interval;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TidehunterKrakenShell() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5119;
        key = "tidehunter_kraken_shell";
        damage_cleanse = new int[]{600,550,500,450};
        damage_reduction = new int[]{12,24,36,48};
        damage_reset_interval = new double[]{6.0,6.0,6.0,6.0};
        localizedName = "Kraken Shell";
        ownerKey = "npc_dota_hero_tidehunter";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static TidehunterKrakenShell instance() {
        if( instance == null ){
            instance = new TidehunterKrakenShell();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getDamageCleanse() {
        return damage_cleanse;
    }

    public int[] getDamageReduction() {
        return damage_reduction;
    }

    public double[] getDamageResetInterval() {
        return damage_reset_interval;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TidehunterKrakenShell))
            return false;
        if (object == this)
            return true;
        TidehunterKrakenShell otherObject = (TidehunterKrakenShell) object;
        return otherObject.getKey().equals(getKey());
    }

}
