package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class QueenofpainBlink extends Ability {

    private static QueenofpainBlink instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int blink_range;
    private final String localizedName;
    private final int min_blink_range;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private QueenofpainBlink() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new double[]{0.33,0.33,0.33,0.33};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{15.0,12.0,9.0,6.0};
        abilityManaCost = new int[]{60,60,60,60};
        iD = 5174;
        key = "queenofpain_blink";
        blink_range = 1300;
        localizedName = "Blink";
        min_blink_range = 200;
        ownerKey = "npc_dota_hero_queenofpain";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static QueenofpainBlink instance() {
        if( instance == null ){
            instance = new QueenofpainBlink();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getBlinkRange() {
        return blink_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMinBlinkRange() {
        return min_blink_range;
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
        if (!(object instanceof QueenofpainBlink))
            return false;
        if (object == this)
            return true;
        QueenofpainBlink otherObject = (QueenofpainBlink) object;
        return otherObject.getKey().equals(getKey());
    }

}
