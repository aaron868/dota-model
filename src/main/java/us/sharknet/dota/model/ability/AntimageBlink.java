package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AntimageBlink extends Ability {

    private static AntimageBlink instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] blink_range;
    private final String localizedName;
    private final int min_blink_range;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private AntimageBlink() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCooldown = new double[]{12.0,9.0,7.0,5.0};
        abilityManaCost = new int[]{60,60,60,60};
        iD = 5004;
        key = "antimage_blink";
        blink_range = new int[]{925,1000,1075,1150};
        localizedName = "Blink";
        min_blink_range = 200;
        ownerKey = "npc_dota_hero_antimage";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static AntimageBlink instance() {
        if( instance == null ){
            instance = new AntimageBlink();
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

    public int[] getBlinkRange() {
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
        if (!(object instanceof AntimageBlink))
            return false;
        if (object == this)
            return true;
        AntimageBlink otherObject = (AntimageBlink) object;
        return otherObject.getKey().equals(getKey());
    }

}
